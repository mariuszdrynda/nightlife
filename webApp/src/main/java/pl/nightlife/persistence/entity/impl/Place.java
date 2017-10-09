package pl.nightlife.persistence.entity.impl;

import pl.nightlife.persistence.entity.NTLAbstractUser;

import javax.persistence.*;

@Entity
@Table(name = "NTL_PLACE")
public class Place extends NTLAbstractUser
{

    @Column(name = "PLACE_NAME")
    private String placeName;

    @Column(name = "SURNAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "NIP")
    private String nip;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CITY")
    private String city;

    @Column(name = "GOOGLE_LOCS_CODE")
    private String googleLocsCode;


}
