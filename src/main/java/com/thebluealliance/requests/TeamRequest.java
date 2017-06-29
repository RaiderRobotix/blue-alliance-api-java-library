package com.thebluealliance.requests;

import com.thebluealliance.Deserializer;
import com.thebluealliance.models.*;

public class TeamRequest {
	
	DataRequest tba;
	
	public TeamRequest(DataRequest dataRequest){
		tba = dataRequest;
	}
	
	public Team getTeam(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/"+teamKey;
		return Deserializer.toTeam(tba
				.getDataTBA(directory).getJson());
	}
	
	public SimpleTeam getSimpleTeam(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/"+teamKey+"/simple";
		return Deserializer.toSimpleTeam(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public int[] getYearsParticipated(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/years_participated";
		return Deserializer.toIntArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public District[] getDistricts(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/districts";
		return Deserializer.toDistrictEntryArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public Robot[] getRobots(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/robots";
		return Deserializer.toRobotArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public Event[] getEvents(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events";
		return Deserializer.toEventArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public Event[] getEvents(int teamNumber, int year){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events/"+year;
		return Deserializer.toEventArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public SimpleEvent[] getSimpleEvents(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events/simple";
		return Deserializer.toSimpleEventArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public SimpleEvent[] getSimpleEvents(int teamNumber, int year){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events/" + year + "/simple";
		return Deserializer.toSimpleEventArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public String[] getEventKeys(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events/keys";
		return Deserializer.toStringArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public String[] getEventKeys(int teamNumber, int year){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events/" + year + "/keys";
		return Deserializer.toStringArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public Match[] getMatches(int teamNumber, String eventKey){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/event/" + eventKey + "/matches";
		return Deserializer.toMatchArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public SimpleMatch[] getSimpleMatches(int teamNumber, String eventKey){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/event/" + eventKey + "/matches/simple";
		return Deserializer.toSimpleMatchArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public String[] getMatchKeys(int teamNumber, String eventKey){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/event/" + eventKey+"/matches/keys";
		return Deserializer.toStringArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public Award[] getAwards(int teamNumber, String eventKey){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/event/" + eventKey+"/awards";
		return Deserializer.toAwardArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public TeamEventStatus getEventStatus(int teamNumber, String eventKey){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/"+teamKey+"/event/"+eventKey+"/status";
		return Deserializer.toTeamEventStatus(tba
				.getDataTBA(directory).getJson());
	}
	
	public Award[] getAwards(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/awards";
		return Deserializer.toAwardArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public Award[] getAwards(int teamNumber, int year){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/awards/" + year;
		return Deserializer.toAwardArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public Match[] getMatches(int teamNumber, int year){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/matches/" + year;
		return Deserializer.toMatchArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public SimpleMatch[] getSimpleMatches(int teamNumber, int year){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/matches/" + year + "/simple";
		return Deserializer.toSimpleMatchArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public String[] getMatchKeys(int teamNumber, int year){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/matches/" + year + "/keys";
		return Deserializer.toStringArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public Media[] getMedia(int teamNumber, int year){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/media/" + year;
		return Deserializer.toMediaArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public Media[] getSocialMedia(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/social_media/";
		return Deserializer.toMediaArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	
}
