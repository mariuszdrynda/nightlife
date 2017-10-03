package pl.nightlife.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "NTL_OFFER")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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
