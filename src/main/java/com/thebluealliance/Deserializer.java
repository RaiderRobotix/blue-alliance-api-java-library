package com.thebluealliance;

import com.google.gson.Gson;
import com.thebluealliance.models.*;

public class Deserializer {
	
	final static Gson gson = new Gson();
	
	public static Team toTeam(String jsonData){
		Team team = gson.fromJson(jsonData, Team.class);
		return team;
	}
	
	public static Team[] toTeamArray(String jsonData){
		Team[] teamArray = gson.fromJson(jsonData, Team[].class);
		return teamArray;
	}
	
	public static SimpleTeam toSimpleTeam(String jsonData){
		SimpleTeam team = gson.fromJson(jsonData, SimpleTeam.class);
		return team;
	}
	
	public static SimpleTeam[] toSimpleTeamArray(String jsonData){
		SimpleTeam[] simpleTeamArray = gson.fromJson(jsonData, SimpleTeam[].class);
		return simpleTeamArray;
	}
	
	public static int[] toIntArray(String jsonData){
		int[] intArray = gson.fromJson(jsonData, int[].class);
		return intArray;
	}
	
	public static District[] toDistrictEntryArray(String jsonData){
		District[] districtEntryArray = gson.fromJson(jsonData, District[].class);
		return districtEntryArray;
	}
	
	public static Robot[] toRobotArray(String jsonData){
		Robot[] robotArray = gson.fromJson(jsonData, Robot[].class);
		return robotArray;
	}
	
	public static Event[] toEventArray(String jsonData){
		Event[] eventArray = gson.fromJson(jsonData, Event[].class);
		return eventArray;
	}
	
	public static SimpleEvent[] toSimpleEventArray(String jsonData){
		SimpleEvent[] eventArray = gson.fromJson(jsonData, SimpleEvent[].class);
		return eventArray;
	}
	
	public static String[] toStringArray(String jsonData){
		String[] stringArray = gson.fromJson(jsonData, String[].class);
		return stringArray;
	}
	
	public static Match[] toMatchArray(String jsonData){
		Match[] matchArray = gson.fromJson(jsonData, Match[].class);
		return matchArray;
	}
	
	public static SimpleMatch[] toSimpleMatchArray(String jsonData){
		SimpleMatch[] matchArray = gson.fromJson(jsonData, SimpleMatch[].class);
		return matchArray;
	}
	
	public static Award[] toAwardArray(String jsonData){
		Award[] awardArray = gson.fromJson(jsonData, Award[].class);
		return awardArray;
	}
	
	public static Media[] toMediaArray(String jsonData){
		Media[] mediaArray = gson.fromJson(jsonData, Media[].class);
		return mediaArray;
	}
	
	public static TeamEventStatus toTeamEventStatus(String jsonData){
		TeamEventStatus teamEventStatus = gson.fromJson(jsonData, TeamEventStatus.class);
		return teamEventStatus;
	}
	
	public static DistrictRanking[] toDistrictRankingArray(String jsonData){
		DistrictRanking[] districtRankingArray = gson.fromJson(jsonData, DistrictRanking[].class);
		return districtRankingArray;
	}

	public static EventDistrictPoints toEventDistrictPoints(String jsonData) {
		EventDistrictPoints eventDistrictPoints = gson.fromJson(jsonData, EventDistrictPoints.class);
		return eventDistrictPoints;
	}

	public static EliminationAlliance[] toEliminationAllianceArray(String jsonContent) {
		EliminationAlliance[] eliminationAllianceArray = gson.fromJson(jsonContent, EliminationAlliance[].class);
		return eliminationAllianceArray;
	}
	
	public static OPRs toOPRs(String jsonData) {
		OPRs oprs = gson.fromJson(jsonData, OPRs.class);
		return oprs;
	}
	
	public static EventRankings toEventRankings(String jsonData) {
		EventRankings eventRankings = gson.fromJson(jsonData, EventRankings.class);
		return eventRankings;
	}
	
	public static Match toMatch(String jsonData){
		Match match = gson.fromJson(jsonData, Match.class);
		return match;
	}
	
	public static SimpleMatch toSimpleMatch(String jsonData){
		SimpleMatch match = gson.fromJson(jsonData, SimpleMatch.class);
		return match;
	}

}
