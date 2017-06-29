package com.thebluealliance.models;

public class SimpleEvent {
	
	private String city, start_date, name, event_code,
		end_date, country, state_prov, event_type, key;
	private District district;
	private int year;
	
	public String getCity() {
		return city;
	}
	public String getStartDate() {
		return start_date;
	}
	public String getName() {
		return name;
	}
	public String getEventCode() {
		return event_code;
	}
	public String getEndDate() {
		return end_date;
	}
	public String getCountry() {
		return country;
	}
	public String getStateProv() {
		return state_prov;
	}
	public String getEventType() {
		return event_type;
	}
	public String getKey() {
		return key;
	}
	public District getDistrict() {
		return district;
	}
	public int getYear() {
		return year;
	}
	

}
