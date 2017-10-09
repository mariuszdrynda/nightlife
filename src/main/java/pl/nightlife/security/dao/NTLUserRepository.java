package pl.nightlife.security.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import pl.nightlife.persistence.entity.NTLAbstractUser;
import pl.nightlife.persistence.entity.impl.Place;

import javax.annotation.Resource;

@Repository
public class NTLUserRepository
{
    public NTLAbstractUser readByEmail(String email)
    {
        return null;
    }
}