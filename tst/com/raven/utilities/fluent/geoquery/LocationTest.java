package com.raven.utilities.fluent.geoquery;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * Copyright 2016 - Kenneth Allen Stoner - All rights reserved
 * for licensing information you can contact ken.stoner.sdet at gmail.
 */
public class LocationTest
{
    @Test
    public void getLatitude() throws Exception
    {
        double expected = 1.0;
        Location l = new Location(2.0, expected, "3.0");
        assertThat(l.getLatitude()).isEqualTo(expected);
    }

    @Test
    public void setLatitude() throws Exception
    {
        double expected = 1.0;
        Location l = new Location(2.0, 0.0, "3.0");
        l.setLatitude(expected);
        assertThat(l.getLatitude()).isEqualTo(expected);
    }

    @Test
    public void getLongitude() throws Exception
    {
        double expected = 1.0;
        Location l = new Location(expected, 2.0, "3.0");
        assertThat(l.getLongitude()).isEqualTo(expected);
    }

    @Test
    public void setLongitude() throws Exception
    {
        double expected = 1.0;
        Location l = new Location(0.0, 2.0, "3.0");
        l.setLongitude(expected);
        assertThat(l.getLongitude()).isEqualTo(expected);
    }

    @Test
    public void getPostalCode() throws Exception
    {
        String expected = "3.0";
        Location l = new Location(1.0, 2.0, expected);
        assertThat(l.getPostalCode()).isEqualTo(expected);
    }

    @Test
    public void setPostalCode() throws Exception
    {
        String expected = "3.0";
        Location l = new Location(1.0, 2.0, "0.0");
        l.setPostalCode(expected);
        assertThat(l.getPostalCode()).isEqualTo(expected);
    }

}