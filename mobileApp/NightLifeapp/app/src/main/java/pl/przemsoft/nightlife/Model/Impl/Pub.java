package pl.przemsoft.nightlife.Model.Impl;

import com.google.android.gms.maps.model.LatLng;

import pl.przemsoft.nightlife.Model.Place;

/**
 * Created by dominik on 09.10.17.
 */

public class Pub implements Place
{
    private LatLng location;

    public Pub(LatLng location)
    {
        this.location = location;
    }

    @Override
    public LatLng getLatLng()
    {
        return location;
    }
}
