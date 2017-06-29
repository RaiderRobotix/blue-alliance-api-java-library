package com.thebluealliance.models;

import java.util.HashMap;

public class EventDistrictPoints {

	private HashMap<String, EventPoints> points;
	private HashMap<String,Tiebreaker> tiebreakers;
	
	
	public class Tiebreaker{
		private int qual_wins;
		private int[] highest_qual_scores;
		public int getQual_wins() {
			return qual_wins;
		}
		public int[] getHighest_qual_scores() {
			return highest_qual_scores;
		}
	}
	
	public Tiebreaker getTiebreaker(int teamNumber){
		return tiebreakers.get(Integer.toString(teamNumber));
	}
	
	public EventPoints getEventPoints(int teamNumber){
		return points.get(Integer.toString(teamNumber));
	}
	
}
