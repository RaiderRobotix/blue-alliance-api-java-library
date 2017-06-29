package com.thebluealliance.requests;

import com.thebluealliance.Deserializer;
import com.thebluealliance.models.*;

public class EventRequest {

	DataRequest tba;
	
	public EventRequest(DataRequest tba){
		this.tba = tba;
	}
	
	public Team[] getTeams(String eventKey){
		String directory = "/event/" + eventKey+"/teams";
		return Deserializer.toTeamArray(tba
				.getDataTBA(directory).getJson());
	}
	
	public SimpleTeam[] getSimpleTeams(String eventKey){
		String directory = "/event/" + eventKey+"/teams/simple";
		return Deserializer.toSimpleTeamArray(tba
				.getDataTBA(directory).getJson());
	}
	
	public String[] getTeamKeys(String eventKey){
		String directory = "/event/" + eventKey+"/teams/keys";
		return Deserializer.toStringArray(tba
				.getDataTBA(directory).getJson());
	}
	
	public Event[] getEvents(int year){
		String directory = "/event/" +year;
		return Deserializer.toEventArray(tba
				.getDataTBA(directory).getJson());
	}
	
	public SimpleEvent[] getSimpleEvents(int year){
		String directory = "/event/" +year+"/simple";
		return Deserializer.toSimpleEventArray(tba
				.getDataTBA(directory).getJson());
	}
	
	public String[] getEventKeys(int year){
		String directory = "/event/" +year+"/keys";
		return Deserializer.toStringArray(tba
				.getDataTBA(directory).getJson());
	}
	
	public EventDistrictPoints getDistrictPoints(String eventKey){
		String directory = "/event/" +eventKey+"/district_points";
		return Deserializer.toEventDistrictPoints(tba
				.getDataTBA(directory).getJson());
	}
	
	public EliminationAlliance[] getAlliances(String eventKey){
		String directory = "/event/" +eventKey+"/alliances";
		return Deserializer.toEliminationAllianceArray(tba
				.getDataTBA(directory).getJson());
	}
	
	public OPRs getOPRs(String eventKey){
		String directory = "/event/" +eventKey+"/oprs";
		return Deserializer.toOPRs(tba
				.getDataTBA(directory).getJson());
	}
	
	public EventRankings getRankings(String eventKey){
		String directory = "/event/" +eventKey+"/rankings";
		return Deserializer.toEventRankings(tba
				.getDataTBA(directory).getJson());
	}
	
	public Match[] getMatches(String eventKey){
		String directory =  "/event/" + eventKey + "/matches";
		return Deserializer.toMatchArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public SimpleMatch[] getSimpleMatches(String eventKey){
		String directory = "/event/" + eventKey + "/matches/simple";
		return Deserializer.toSimpleMatchArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public String[] getMatchKeys(String eventKey){
		String directory = "/event/" + eventKey+"/matches/keys";
		return Deserializer.toStringArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public Award[] getAwards(String eventKey){
		String directory = "/event/" + eventKey+"/awards";
		return Deserializer.toAwardArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	
}
