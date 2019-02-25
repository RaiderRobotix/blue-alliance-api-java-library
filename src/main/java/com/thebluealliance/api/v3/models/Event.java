package com.thebluealliance.api.v3.models;

/**
 * Represents a FIRST Robotics Competition event and its related descriptors
 */
public class Event {

    private Webcast[] webcasts;

    private String postal_code, parent_event_key,
            short_name, gmaps_url, playoff_type_string, event_type_string,
            gmaps_place_id, address, location_name, timezone, first_event_id, website;

    private double lat, lng;
    private String[] division_keys;
    private int week, year, playoff_type, event_type;

    private String city, start_date, name, event_code,
            end_date, country, state_prov, key;
    private District district;

    /**
     * @return A list of webcasts for the event
     */
    public Webcast[] getWebcasts() {
        return webcasts;
    }

    /**
     * @return Postal code from the event address.
     */
    public String getPostalCode() {
        return postal_code;
    }

    /**
     * @return The TBA Event key that represents the event�s parent. Used to link back to the event from a division
     * event. It is also the inverse relation of <code>divison_keys</code>.
     */
    public String getParentEventKey() {
        return parent_event_key;
    }

    /**
     * @return Same as <code>name</code> but doesn�t include event specifiers, such as �Regional� or 'District�. May
     * be null.
     */
    public String getShortName() {
        return short_name;
    }

    /**
     * @return Link to address location on Google Maps.
     */
    public String getGmapsUrl() {
        return gmaps_url;
    }

    /**
     * @return String representation of the <code>playoff_type</code>, or null.
     */
    public String getPlayoffTypeString() {
        return playoff_type_string;
    }

    /**
     * @return Event Type, eg Regional, District, or Offseason.
     */
    public String getEventTypeString() {
        return event_type_string;
    }

    /**
     * @return Google Maps Place ID for the event address.
     */
    public String getGmapsPlaceId() {
        return gmaps_place_id;
    }

    /**
     * @return Address of the event�s venue, if available
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return Name of the location at the address for the event, eg. Blue Alliance High School.
     */
    public String getLocationName() {
        return location_name;
    }

    /**
     * @return Timezone name.
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * @return The event�s website, if any.
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @return Latitude for the event address.
     */
    public double getLat() {
        return lat;
    }

    /**
     * @return Longitude for the event address.
     */
    public double getLng() {
        return lng;
    }

    /**
     * @return An array of event keys for the divisions at this event.
     */
    public String[] getDivisionKeys() {
        return division_keys;
    }

    /**
     * @return The FIRST internal Event ID, used to link to the event on the FRC webpage.
     */
    public String getFirstEventId() {
        return first_event_id;
    }

    /**
     * @return Week of the competition season this event is in.
     */
    public int getWeek() {
        return week;
    }

    /**
     * @return Year the event data is for.
     */
    public int getYear() {
        return year;
    }

    /**
     * @return Playoff Type, as defined
     * <a href="https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/playoff_type.py#L4">here</a>
     * , or null.
     */
    public int getPlayoffType() {
        return playoff_type;
    }

    /**
     * @return Event Type, as defined
     * <a href="https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2">here</a>
     */
    public int getEventType() {
        return event_type;
    }

    /**
     * @return City, town, village, etc. the event is located in.
     */
    public String getCity() {
        return city;
    }

    /**
     * @return Event start date in <code>yyyy-mm-dd</code> format.
     */
    public String getStartDate() {
        return start_date;
    }

    /**
     * @return Official name of event on record either provided by FIRST or organizers of offseason event.
     */
    public String getName() {
        return name;
    }

    /**
     * @return Event short code, as provided by FIRST.
     */
    public String getEventCode() {
        return event_code;
    }

    /**
     * @return Event end date in <code>yyyy-mm-dd</code> format.
     */
    public String getEndDate() {
        return end_date;
    }

    /**
     * @return Country the event is located in.
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return State or Province the event is located in.
     */
    public String getStateProv() {
        return state_prov;
    }

    /**
     * @return TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event
     * code of the event.
     */
    public String getKey() {
        return key;
    }

    /**
     * @return A {@link District} object representing the district the event is in. May be null.
     */
    public District getDistrict() {
        return district;
    }

    /**
     * Represents a webcast and its associated descriptors
     */
    public class Webcast {

        private String type, channel, file;

        /**
         * @return Type of webcast, typically descriptive of the streaming provider.
         * Value may be <code>youtube</code>, <code>twitch</code>, <code>ustream</code>, <code>iframe</code>,
         * <code>html5</code>, <code>rtmp</code>, or <code>livestream</code>
         */
        public String getType() {
            return type;
        }

        /**
         * @return Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case
         * of iframe types, contains HTML to embed the stream in an HTML iframe.
         */
        public String getChannel() {
            return channel;
        }

        /**
         * @return File identification as may be required for some types. May be null.
         */
        public String getFile() {
            return file;
        }

    }


}
