package com.thebluealliance.api.v3.models;

/**
 * Shortform representation of a FIRST Robotics Competition team
 */
public class SimpleTeam {

    private String key, nickname, name, city,
            state_prov, country;
    private int team_number;

    /**
     * @return TBA team key with the format <code>frcXXXX</code> with <code>XXXX</code> representing the team number.
     */
    public String getKey() {
        return key;
    }

    /**
     * @return Team nickname provided by FIRST.
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @return Official long name registered with FIRST.
     */
    public String getName() {
        return name;
    }

    /**
     * @return City of team derived from parsing the address registered with FIRST.
     */
    public String getCity() {
        return city;
    }

    /**
     * @return State of team derived from parsing the address registered with FIRST.
     */
    public String getStateProv() {
        return state_prov;
    }

    /**
     * @return Country of team derived from parsing the address registered with FIRST.
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return Official team number issued by FIRST.
     */
    public int getTeamNumber() {
        return team_number;
    }

}
