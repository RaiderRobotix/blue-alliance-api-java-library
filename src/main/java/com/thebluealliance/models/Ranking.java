package com.thebluealliance.models;

import java.util.HashMap;

public class Ranking{
	private int dq, matches_played, qual_average, rank;
	private HashMap<String, WLTRecord> record;
	private String team_key;
	
	
	public int getDq() {
		return dq;
	}

	public int getMatchesPlayed() {
		return matches_played;
	}

	public int getQualAverage() {
		return qual_average;
	}

	public int getRank() {
		return rank;
	}

	public WLTRecord getQualificationsRecord() {
		return record.get("qualifications");
	}
	
	public WLTRecord getOverallRecord(){
		return record.get("overall");
	}

	public String getTeamKey() {
		return team_key;
	}
	
	
}
