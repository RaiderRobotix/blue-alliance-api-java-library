package com.thebluealliance.models;

import java.util.HashMap;

public class Team extends SimpleTeam{
	
	private String postal_code, website, motto;
	private int rookie_year;
	
	private HashMap<String, String> home_championship;

	public String getPostalCode() {
		return postal_code;
	}

	public String getWebsite() {
		return website;
	}

	public String getMotto() {
		return motto;
	}

	
	public int getRookieYear() {
		return rookie_year;
	}

	public String getHomeChampionship(int year) {
		return home_championship.get(Integer.toString(year));
	}

	
}
