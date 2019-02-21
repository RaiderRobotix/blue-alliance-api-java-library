package com.thebluealliance.api.v3.models;

/**
 * A <code>District</code> object represents a district for a particular year
 */
public class District {

    private String abbreviation, display_name, key;
    private int year;

    /**
     * @return The short identifier for the district.
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * @return The long name for the district.
     */
    public String getDisplayName() {
        return display_name;
    }

    /**
     * @return Key for this district, e.g. <code>2016ne</code>.
     */
    public String getKey() {
        return key;
    }

    /**
     * @return Year this district participated.
     */
    public int getYear() {
        return year;
    }


}
