package com.raven.utilities.fluent.geoquery;

/**
 * Copyright 2016 - Kenneth Allen Stoner - All rights reserved
 * for licensing information you can contact ken.stoner.sdet at gmail.
 */
public class Location
{
    private double longitude;
    private double latitude;
    private String postalCode;

    public Location(final double longitude, final double latitude, final String postalCode)
    {
        this.longitude = longitude;
        this.latitude = latitude;
        this.postalCode = postalCode;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public void setLatitude(double latitude)
    {
        this.latitude = latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public void setPostalCode(String postalCode)
    {
        this.postalCode = postalCode;
    }


}
