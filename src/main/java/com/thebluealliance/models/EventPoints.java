package com.thebluealliance.models;

public class EventPoints{
	private String event_key;
	private boolean district_cmp;
	private int alliance_points, award_points, qual_points, elim_points, total;
	
	public String getEventKey() {
		return event_key;
	}
	public boolean isDistrictCmp() {
		return district_cmp;
	}
	public int getAlliancePoints() {
		return alliance_points;
	}
	public int getAwardPoints() {
		return award_points;
	}
	public int getQualPoints() {
		return qual_points;
	}
	public int getElimPoints() {
		return elim_points;
	}
	public int getTotal() {
		return total;
	}
}