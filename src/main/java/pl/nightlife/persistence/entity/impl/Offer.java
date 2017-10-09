package pl.nightlife.persistence.entity.impl;

import pl.nightlife.persistence.entity.NTLAbstractEntity;

import javax.persistence.*;

public class Offer implements NTLAbstractEntity
{
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CYCLIC")
    private Boolean cyclic;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Boolean getCyclic()
    {
        return cyclic;
    }

    public void setCyclic(Boolean cyclic)
    {
        this.cyclic = cyclic;
    }

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
}
