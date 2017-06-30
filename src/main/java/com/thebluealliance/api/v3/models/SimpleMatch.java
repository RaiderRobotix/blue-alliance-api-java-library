package com.thebluealliance.api.v3.models;

import java.util.HashMap;

/** Shortform representation of a FIRST Robotics Competition match
 *
 */
public class SimpleMatch {

	private int match_number, set_number;
	private String winning_alliance, comp_level, event_key, key;
	private long time, predicted_time, actual_time; 
	private HashMap<String, Alliance> alliances;
	
	/**
	 * @return The match number of the match in the competition level.
	 */
	public int getMatchNumber() {
		return match_number;
	}
	
	/**
	 * @return The set number in a series of matches where more than one match is required in the match series.
	 */
	public int getSetNumber() {
		return set_number;
	}
	
	/**
	 * @return The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.
	 */
	public String getWinningAlliance() {
		return winning_alliance;
	}
	
	/**
	 * @return The competition level the match was played at.
	 * Value is either <code>qm</code>, <code>qf</code>, <code>sf</code>, <code>f</code>, or <code>ef</code> 
	 */
	public String getCompLevel() {
		return comp_level;
	}
	
	/**
	 * @return Event key of the event the match was played at.
	 */
	public String getEventKey() {
		return event_key;
	}
	
	/**
	 * @return TBA event key with the format <code>yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]</code>, where <code>yyyy</code> is the year, and <code>EVENT_CODE</code> is the event code of the event, <code>COMP_LEVEL</code> is (qm, ef, qf, sf, f), and <code>MATCH_NUMBER</code> is the match number in the competition level. A set number may append the competition level if more than one match in required per set.
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * @return UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule.
	 */
	public long getTime() {
		return time;
	}
	
	/**
	 * @return UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time.
	 */
	public long getPredictedTime() {
		return predicted_time;
	}
	
	/**
	 * @return UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time.
	 */
	public long getActualTime() {
		return actual_time;
	}
	
	/**
	 * @return {@link Alliance} object representing the blue alliance
	 */
	public Alliance getBlueAlliance() {
		return alliances.get("blue");
	}
	
	/**
	 * @return {@link Alliance} object representing the red alliance
	 */
	public Alliance getRedAlliance() {
		return alliances.get("red");
	}
	
	/** Represents an alliance during a match
	 *
	 */
	public class Alliance {

		private int score;
		private String[] team_keys, surrogate_team_keys;
		
		/**
		 * @return Score for this alliance. Will be null or -1 for an unplayed match.
		 */
		public int getScore() {
			return score;
		}
		
		/**
		 * @return TBA Team keys for teams on this alliance.
		 */
		public String[] getTeamKeys() {
			return team_keys;
		}
		
		/**
		 * @return TBA team keys of any teams playing as a surrogate.
		 */
		public String[] getSurrogateTeamKeys() {
			return surrogate_team_keys;
		}
		
	}
	
			
		


	
	
	
}
