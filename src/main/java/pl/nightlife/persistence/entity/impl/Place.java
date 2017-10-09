package pl.nightlife.persistence.entity.impl;

import pl.nightlife.enumeration.NTLAuthorityType;
import pl.nightlife.persistence.entity.NTLAbstractUser;

import javax.persistence.*;

@Entity
@Table(name = "NTL_PLACE")
public class Place implements NTLAbstractUser
{
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "AUTHORITY_TYPE", nullable = false)
    private String authorityType = NTLAuthorityType.ROLE_PLACE.getRole();

    @Column(name = "PLACE_NAME", nullable = false)
    private String placeName;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "SURNAME", nullable = false)
    private String surname;

    @Column(name = "PHONE", nullable = false)
    private String phone;

    @Column(name = "NIP", nullable = false)
    private String nip;

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "GOOGLE_LOCS_CODE", nullable = false)
    private String googleLocsCode;

    @Override
    public Long getId()
    {
        return id;
    }

    @Override
    public void setId(Long id)
    {
        this.id = id;
    }

    @Override
    public String getEmail()
    {
        return email;
    }

    @Override
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String getAuthorityType()
    {
        return authorityType;
    }

    @Override
    public void setAuthorityType(String authorityType)
    {
        this.authorityType = authorityType;
    }

    public String getPlaceName()
    {
        return placeName;
    }

    public void setPlaceName(String placeName)
    {
        this.placeName = placeName;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getNip()
    {
        return nip;
    }

    public void setNip(String nip)
    {
        this.nip = nip;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getGoogleLocsCode()
    {
        return googleLocsCode;
    }

    public void setGoogleLocsCode(String googleLocsCode)
    {
        this.googleLocsCode = googleLocsCode;
    }
}
