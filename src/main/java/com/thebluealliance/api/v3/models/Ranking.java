package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * Represents the ranking of a team at an event
 */
@Value
public class Ranking {
	/**
	 * Number of times disqualified
	 */
	int dq;
	/**
	 * Number of matches played by this team
	 */
	int matches_played;
	/**
	 * The average match score during qualifications. Year specific. May be null if not relevant for a given year.
	 */
	int qual_average;
	/**
	 * The team's rank at the event as provided by FIRST.
	 */
	int rank;
	/**
	 * Win-Loss-Tie object model for all matches
	 */
	WLTRecord record;
	/**
	 * The team with this rank.
	 */
	String team_key;
	/**
	 * Sorting criteria values for the current season
	 */
	double[] sort_orders;

}
