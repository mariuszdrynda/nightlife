package pl.nightlife.security.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.nightlife.enumeration.NTLAuthorityType;
import pl.nightlife.persistence.entity.NTLAbstractUser;
import pl.nightlife.security.dao.NTLUserRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service("ntlUserDetailsService")
public class NTLUserDetailsService implements UserDetailsService
{
    @Resource
    private NTLUserRepository userRepository;

    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        NTLAbstractUser user = userRepository.readByEmail(username);
        if (user == null)
        {
            throw new UsernameNotFoundException("Username not found");
        }
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(NTLAuthorityType.ROLE_PLACE.getRole()));
        return new User(username, user.getPassword(), grantedAuthorities);
    }
}