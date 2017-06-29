package com.thebluealliance.requests;

import com.thebluealliance.Deserializer;
import com.thebluealliance.models.*;

public class TeamRequest {
	
	TBA tba;
	
	public TeamRequest(TBA tba){
		this.tba = tba;
	}
	
	public Team getTeam(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/"+teamKey;
		return Deserializer.jsonToTeam(tba
				.getDataFromTBA(directory).getJsonContent());
	}
	
	public SimpleTeam getSimpleTeam(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/"+teamKey+"/simple";
		return Deserializer.jsonToSimpleTeam(tba
				.getDataFromTBA(directory)
				.getJsonContent());
	}
	
	public int[] getYearsParticipated(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/years_participated";
		return Deserializer.jsonToIntArray(tba
				.getDataFromTBA(directory)
				.getJsonContent());
	}
	
	public DistrictEntry[] getDistricts(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/districts";
		return Deserializer.jsonToDistrictEntryArray(tba
				.getDataFromTBA(directory)
				.getJsonContent());
	}
	
	public Robot[] getRobots(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/robots";
		return Deserializer.jsonToRobotArray(tba
				.getDataFromTBA(directory)
				.getJsonContent());
	}
	
	public Event[] getEvents(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events";
		return Deserializer.jsonToEventArray(tba
				.getDataFromTBA(directory)
				.getJsonContent());
	}
	
	public SimpleEvent[] getSimpleEvents(int teamNumber){
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events/simple";
		return Deserializer.jsonToSimpleEventArray(tba
				.getDataFromTBA(directory)
				.getJsonContent());
	}
	
	public String[] getEventKeys(int teamNumber){
		//TODO write this
		return null;
	}
	
	
}
