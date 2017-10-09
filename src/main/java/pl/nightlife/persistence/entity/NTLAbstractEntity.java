package pl.nightlife.persistence.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public interface NTLAbstractEntity
{

    Long getId();

    void setId(Long id);
}
