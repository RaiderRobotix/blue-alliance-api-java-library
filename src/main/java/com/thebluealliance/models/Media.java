package com.thebluealliance.models;

public class Media {

	private String key, type, foreign_key;
	private boolean preferred;
	
	public String getKey() {
		return key;
	}
	public String getType() {
		return type;
	}
	public String getForeignKey() {
		return foreign_key;
	}
	public boolean isPreferred() {
		return preferred;
	}
	
}