package pl.nightlife.persistence.entity;

import pl.nightlife.enumeration.NTLAuthorityType;

public interface NTLAbstractUser extends NTLAbstractEntity
{
    String getAuthorityType();

    void setAuthorityType(String authorityType);

    String getEmail();

    void setEmail(String email);

    String getPassword();

    void setPassword(String password);
}
