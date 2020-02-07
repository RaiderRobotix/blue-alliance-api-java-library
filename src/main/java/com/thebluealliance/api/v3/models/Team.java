package com.thebluealliance.api.v3.models;

import java.util.HashMap;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * Represents a FIRST Robotics Competition team
 */
@EqualsAndHashCode(callSuper = true)
@Value public class Team extends SimpleTeam {
	
	Team() throws IllegalAccessException {
		super(null, null, null, null, null, null);
		throw new IllegalAccessException("You've called the constructor of Team");
	}

    /**
	* @return Postal code from the team address.
	*/
	String postal_code;
	/**
	* @return Official website associated with the team.
	*/
	String website;
	/**
	* @return Team�s motto as provided by FIRST.
	*/
	String motto;
    /**
	* @return First year the team officially competed.
	*/
	int rookie_year;

     HashMap<String, String> home_championship;

    /**
     * @param year An year to query. Must be greater than or equal to 2017.
     * @return Location of the team�s home championship for the particular <code>year</code>
     */
    public String getHomeChampionship(int year) {
        return home_championship.get(Integer.toString(year));
    }


}
