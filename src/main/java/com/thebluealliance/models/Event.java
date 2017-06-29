package com.thebluealliance.models;

public class Event {
	
	private Webcast[] webcasts;
	
	private String postal_code, parent_event_key,
		short_name, gmaps_url, playoff_type_string, event_type_string,
		gmaps_place_id, address, location_name, timezone, first_event_id, website;
	
	private double lat, lng;
	private String[] division_keys;
	private int  week, year, playoff_type, event_type;
	
	private String city, start_date, name, event_code,
	end_date, country, state_prov, key;
	private DistrictEntry district;
	
	public Webcast[] getWebcasts() {
		return webcasts;
	}
	public String getPostalCode() {
		return postal_code;
	}
	public String getParentEventKey() {
		return parent_event_key;
	}
	public String getShortName() {
		return short_name;
	}
	public String getGmapsUrl() {
		return gmaps_url;
	}
	public String getPlayoffTypeString() {
		return playoff_type_string;
	}
	public String getEventTypeString() {
		return event_type_string;
	}
	public String getGmapsPlaceId() {
		return gmaps_place_id;
	}
	public String getAddress() {
		return address;
	}
	public String getLocationName() {
		return location_name;
	}
	public String getTimezone() {
		return timezone;
	}
	public String getWebsite() {
		return website;
	}
	public double getLat() {
		return lat;
	}
	public double getLng() {
		return lng;
	}
	public String[] getDivisionKeys() {
		return division_keys;
	}
	public String getFirstEventId() {
		return first_event_id;
	}
	public int getWeek() {
		return week;
	}
	public int getYear() {
		return year;
	}
	public int getPlayoffType() {
		return playoff_type;
	}
	public int getEventType() {
		return event_type;
	}
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
	public String getKey() {
		return key;
	}
	public DistrictEntry getDistrict() {
		return district;
	}


}
