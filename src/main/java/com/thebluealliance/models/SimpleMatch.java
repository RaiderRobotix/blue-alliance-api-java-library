package com.thebluealliance.models;

import java.util.HashMap;

public class SimpleMatch {

	private int match_number, set_number;
	private String winning_alliance, comp_level, event_key, key;
	private long time, predicted_time, actual_time; 
	private HashMap<String, Alliance> alliances;
	
	public int getMatchNumber() {
		return match_number;
	}
	public int getSetNumber() {
		return set_number;
	}
	public String getWinningAlliance() {
		return winning_alliance;
	}
	public String getCompLevel() {
		return comp_level;
	}
	public String getEventKey() {
		return event_key;
	}
	public String getKey() {
		return key;
	}
	public long getTime() {
		return time;
	}
	public long getPredictedTime() {
		return predicted_time;
	}
	public long getActualTime() {
		return actual_time;
	}
	public Alliance getBlueAlliance() {
		return alliances.get("blue");
	}
	
	public Alliance getRedAlliance() {
		return alliances.get("red");
	}
	
	public class Alliance {

		private int score;
		private String[] team_keys, surrogate_team_keys;
		public int getScore() {
			return score;
		}
		
		public String[] getTeamKeys() {
			return team_keys;
		}
		public String[] getSurrogateTeamKeys() {
			return surrogate_team_keys;
		}
		
	}
	
			
		


	
	
	
}
