package com.thebluealliance;

import com.google.gson.Gson;
import com.thebluealliance.models.*;

public class Deserializer {
	
	final static Gson gson = new Gson();
	
	public static Team jsonToTeam(String jsonData){
		Team team = gson.fromJson(jsonData, Team.class);
		return team;
	}
	
	public static SimpleTeam jsonToSimpleTeam(String jsonData){
		SimpleTeam team = gson.fromJson(jsonData, SimpleTeam.class);
		return team;
	}
	
	public static int[] jsonToIntArray(String jsonData){
		int[] intArray = gson.fromJson(jsonData, int[].class);
		return intArray;
	}
	
	public static DistrictEntry[] jsonToDistrictEntryArray(String jsonData){
		DistrictEntry[] districtEntryArray = gson.fromJson(jsonData, DistrictEntry[].class);
		return districtEntryArray;
	}
	
	public static Robot[] jsonToRobotArray(String jsonData){
		Robot[] robotArray = gson.fromJson(jsonData, Robot[].class);
		return robotArray;
	}
	
	public static Event[] jsonToEventArray(String jsonData){
		Event[] eventArray = gson.fromJson(jsonData, Event[].class);
		return eventArray;
	}
	
	public static SimpleEvent[] jsonToSimpleEventArray(String jsonData){
		SimpleEvent[] eventArray = gson.fromJson(jsonData, SimpleEvent[].class);
		return eventArray;
	}

}
