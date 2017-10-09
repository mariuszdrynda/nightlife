package pl.nightlife.persistence.entity.impl;

import pl.nightlife.persistence.entity.NTLAbstractEntity;

import javax.persistence.*;

public class Offer extends NTLAbstractEntity
{
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
}
