package com.thebluealliance.api.v3.models;

import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.HashMap;

/**
 * Represents a FIRST Robotics Competition team
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class Team extends SimpleTeam {

	Team() {
		super(null, null, null, null, null, null, 0);
		postal_code = null;
		website = null;
		motto = null;
		rookie_year = 0;
		home_championship = null;
	}

	/**
	 * Postal code from the team address.
	 */
	String postal_code;
	/**
	 * Official website associated with the team.
	 */
	String website;
	/**
	 * Team's motto as provided by FIRST.
	 */
	String motto;
	/**
	 * First year the team officially competed.
	 */
	int rookie_year;

	HashMap<String, String> home_championship;

	/**
	 * @param year
	 *                 An year to query. Must be greater than or equal to 2017. Location of the team�s home championship for the particular <code>year</code>
	 */
	public String getHomeChampionship(int year) {
		return home_championship.get(Integer.toString(year));
	}

}
