package com.thebluealliance.models;

public class SimpleTeam {
	
	private String key, nickname, name, city, 
		state_prov, country;
	
	public String getKey() {
		return key;
	}
	public String getNickname() {
		return nickname;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public String getState_prov() {
		return state_prov;
	}
	public String getCountry() {
		return country;
	}
	public int getTeam_number() {
		return team_number;
	}
	private int team_number;

}
