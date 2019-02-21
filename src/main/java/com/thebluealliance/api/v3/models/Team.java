package com.thebluealliance.api.v3.models;

import java.util.HashMap;

/**
 * Represents a FIRST Robotics Competition team
 */
public class Team extends SimpleTeam {

    private String postal_code, website, motto;
    private int rookie_year;

    private HashMap<String, String> home_championship;

    /**
     * @return Postal code from the team address.
     */
    public String getPostalCode() {
        return postal_code;
    }

    /**
     * @return Official website associated with the team.
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @return Team�s motto as provided by FIRST.
     */
    public String getMotto() {
        return motto;
    }

    /**
     * @return First year the team officially competed.
     */
    public int getRookieYear() {
        return rookie_year;
    }

    /**
     * @param year An year to query. Must be greater than or equal to 2017.
     * @return Location of the team�s home championship for the particular <code>year</code>
     */
    public String getHomeChampionship(int year) {
        return home_championship.get(Integer.toString(year));
    }


}
