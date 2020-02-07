package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * Represents the ranking of a team at an event
 */
@Value public class Ranking {
	/**
	* @return Number of times disqualified
	*/
	int dq;
	/**
	* @return Number of matches played by this team
	*/
	int matches_played;
	/**
	* @return The average match score during qualifications. Year specific. May be null if not relevant for a given
	* year.
	*/
	int qual_average;
	/**
	* @return The team�s rank at the event as provided by FIRST.
	*/
	int rank;
	/**
	* @return Win-Loss-Tie object model for all matches
	*/
	WLTRecord record;
	/**
	* @return The team with this rank.
	*/
	String team_key;
	/**
	* @return Sorting criteria values for the current season
	*/
	double[] sort_orders;

}
