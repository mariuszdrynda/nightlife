package pl.nightlife.persistence.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class NTLAbstractEntity
{
    @Id
    @GeneratedValue
    private Long id;


    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
}
