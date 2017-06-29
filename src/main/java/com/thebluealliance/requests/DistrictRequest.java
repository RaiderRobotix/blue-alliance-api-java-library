package com.thebluealliance.requests;

import com.thebluealliance.Deserializer;
import com.thebluealliance.models.*;

public class DistrictRequest {

	DataRequest tba;
	
	public DistrictRequest(DataRequest tba){
		this.tba = tba;
	}
	
	public Team[] getTeams(String districtKey){
		String directory = "/district/" + districtKey+"/teams";
		return Deserializer.toTeamArray(tba
				.getDataTBA(directory).getJson());
	}
	
	public SimpleTeam[] getSimpleTeams(String districtKey){
		String directory = "/district/" + districtKey+"/teams/simple";
		return Deserializer.toSimpleTeamArray(tba
				.getDataTBA(directory).getJson());
	}
	
	public String[] getTeamKeys(String districtKey){
		String directory = "/district/" + districtKey+"/teams/keys";
		return Deserializer.toStringArray(tba
				.getDataTBA(directory).getJson());
	}
	
	public DistrictRanking[] getRankings(String districtKey){
		String directory = "/district/" + districtKey+"/rankings";
		return Deserializer.toDistrictRankingArray(tba
				.getDataTBA(directory).getJson());
	}
	
	public Event[] getEvents(String districtKey){
		String directory = "/district/" + districtKey + "/events";
		return Deserializer.toEventArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public SimpleEvent[] getSimpleEvents(String districtKey){
		String directory = "/district/" + districtKey + "/events/simple";
		return Deserializer.toSimpleEventArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public String[] getEventKeys(String districtKey){
		String directory = "/district/" + districtKey + "/events/keys";
		return Deserializer.toStringArray(tba
				.getDataTBA(directory)
				.getJson());
	}
}
