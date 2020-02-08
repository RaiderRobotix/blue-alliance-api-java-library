package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * Shortform representation of a FIRST Robotics Competition event
 */
@Value
public class SimpleEvent {

	/**
	 * @return City, town, village, etc. the event is located in.
	 */
	String city;
	/**
	 * @return Event start date in <code>yyyy-mm-dd</code> format.
	 */
	String start_date;
	/**
	 * @return Official name of event on record either provided by FIRST or organizers of offseason event.
	 */
	String name;
	/**
	 * @return Event short code, as provided by FIRST.
	 */
	String event_code;
	/**
	 * @return Event end date in <code>yyyy-mm-dd</code> format.
	 */
	String end_date;
	/**
	 * @return Country the event is located in.
	 */
	String country;
	/**
	 * @return State or Province the event is located in.
	 */
	String state_prov;
	/**
	 * @return TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event.
	 */
	String key;
	/**
	 * @return A {@link District} object representing the district the event is in. May be null.
	 */
	District district;
	/**
	 * @return Year the event data is for.
	 */
	int year;
	/**
	 * @return Event Type, as defined <a href="https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2">here</a>
	 */
	int event_type;

}
