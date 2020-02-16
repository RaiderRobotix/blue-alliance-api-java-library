package com.thebluealliance.api.v3.models;

import java.util.HashMap;

import lombok.Value;
import lombok.experimental.NonFinal;

/**
 * Shortform representation of a FIRST Robotics Competition match
 */
@Value
@NonFinal
public class SimpleMatch {

	/**
	 * The match number of the match in the competition level.
	 */
	int match_number;
	/**
	 * The set number in a series of matches where more than one match is required in the match series.
	 */
	int set_number;
	/**
	 * The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.
	 */
	String winning_alliance;
	/**
	 * The competition level the match was played at. Value is either <code>qm</code>, <code>qf</code>, <code>sf</code>, <code>f</code>, or <code>ef</code>
	 */
	String comp_level;
	/**
	 * Event key of the event the match was played at.
	 */
	String event_key;
	/**
	 * TBA event key with the format <code>yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]</code>, where <code>yyyy</code> is the year, and <code>EVENT_CODE</code> is the event code of the event,
	 * <code>COMP_LEVEL</code> is (qm, ef, qf, sf, f), and <code>MATCH_NUMBER</code> is the match number in the competition level. A set number may append the competition level if more than one match in
	 * required per set.
	 */
	String key;
	/**
	 * UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule.
	 */
	long time;
	/**
	 * UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time.
	 */
	long predicted_time;
	/**
	 * UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time.
	 */
	long actual_time;

	HashMap<String, Alliance> alliances;

	public Alliance getBlueAlliance() {
		return alliances.get("blue");
	}

	public Alliance getRedAlliance() {
		return alliances.get("red");
	}

	/**
	 * Represents an alliance during a match
	 */
	@Value
	public class Alliance {

		/**
		 * Score for this alliance. Will be null or -1 for an unplayed match.
		 */
		int score;
		/**
		 * TBA Team keys for teams on this alliance.
		 */
		String[] team_keys;
		/**
		 * TBA team keys of any teams playing as a surrogate.
		 */
		String[] surrogate_team_keys;

	}

}
