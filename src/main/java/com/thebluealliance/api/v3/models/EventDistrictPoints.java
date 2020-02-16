package com.thebluealliance.api.v3.models;

import java.util.HashMap;

import lombok.Value;

/**
 * Represents all district points accumulated at an event
 */
public class EventDistrictPoints {

	private HashMap<String, EventPoints> points;
	private HashMap<String, Tiebreaker> tiebreakers;

	/**
	 * @param teamNumber
	 *                       Team number used for a query
	 * @return A {@link Tiebreaker} object for that team
	 */
	public Tiebreaker getTiebreaker(int teamNumber) {
		return tiebreakers.get("frc" + teamNumber);
	}

	/**
	 * @param teamNumber
	 *                       Team number used for a query
	 * @return The {@link EventPoints} the team earned
	 */
	public EventPoints getEventPoints(int teamNumber) {
		return points.get("frc" + teamNumber);
	}

	/**
	 * Tiebreaker value a team at a event, describing the tiebreaker elements
	 */
	@Value
	public class Tiebreaker {
		/**
		 * Number of qualification match wins
		 */
		private int qual_wins;
		/**
		 * List of three highest qualification match scores
		 */
		private int[] highest_qual_scores;
	}

}
