package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * Represents a FIRST Robotics Competition event and its related descriptors
 */
@Value
public class Event {

	/**
	 * @return A list of webcasts for the event
	 */
	Webcast[] webcasts;

	/**
	 * @return Postal code from the event address.
	 */
	String postal_code;
	/**
	 * @return The TBA Event key that represents the event's parent. Used to link back to the event from a division event. It is also the inverse relation of <code>divison_keys</code>.
	 */
	String parent_event_key;
	/**
	 * @return Same as <code>name</code> but doesn�t include event specifiers, such as �Regional� or 'District�. May be null.
	 */
	String short_name;
	/**
	 * @return Link to address location on Google Maps.
	 */
	String gmaps_url;
	/**
	 * @return String representation of the <code>playoff_type</code>, or null.
	 */
	String playoff_type_string;
	/**
	 * @return Event Type, eg Regional, District, or Offseason.
	 */
	String event_type_string;
	/**
	 * @return Google Maps Place ID for the event address.
	 */
	String gmaps_place_id;
	/**
	 * @return Address of the event�s venue, if available
	 */
	String address;
	/**
	 * @return Name of the location at the address for the event, eg. Blue Alliance High School.
	 */
	String location_name;
	/**
	 * @return Timezone name.
	 */
	String timezone;
	/**
	 * @return The FIRST internal Event ID, used to link to the event on the FRC webpage.
	 */
	String first_event_id;
	/**
	 * @return The event's website, if any.
	 */
	String website;

	/**
	 * @return Latitude for the event address.
	 */
	double lat;
	/**
	 * @return Longitude for the event address.
	 */
	double lng;
	/**
	 * @return An array of event keys for the divisions at this event.
	 */
	String[] division_keys;
	/**
	 * @return Week of the competition season this event is in.
	 */
	int week;
	/**
	 * @return Year the event data is for.
	 */
	int year;
	/**
	 * @return Playoff Type, as defined <a href="https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/playoff_type.py#L4">here</a> , or null.
	 */
	int playoff_type;
	/**
	 * @return Event Type, as defined <a href="https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2">here</a>
	 */
	int event_type;

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
	 * Represents a webcast and its associated descriptors
	 */
	@Value
	public class Webcast {

		/**
		 * @return Type of webcast, typically descriptive of the streaming provider. Value may be <code>youtube</code>, <code>twitch</code>, <code>ustream</code>, <code>iframe</code>, <code>html5</code>,
		 *         <code>rtmp</code>, or <code>livestream</code>
		 */
		String type;
		/**
		 * @return Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case of iframe types, contains HTML to embed the stream in an HTML iframe.
		 */
		String channel;
		/**
		 * @return File identification as may be required for some types. May be null.
		 */
		String file;

	}

}
