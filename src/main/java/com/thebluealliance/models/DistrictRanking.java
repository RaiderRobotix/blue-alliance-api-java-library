package com.thebluealliance.models;

public class DistrictRanking {
	
	private String teamKey; 
	private int rank, rookie_bonus, point_total;
	private EventPoints event_points;
	


	public String getTeamKey() {
		return teamKey;
	}

	public int getRank() {
		return rank;
	}

	public int getRookieBonus() {
		return rookie_bonus;
	}

	public int getPointTotal() {
		return point_total;
	}

	public EventPoints getEventPoints() {
		return event_points;
	}

}
