package com.thebluealliance.api.v3.models;

/**
 * Shortform representation of a FIRST Robotics Competition event
 */
public class SimpleEvent {

    private String city, start_date, name, event_code,
            end_date, country, state_prov, key;
    private District district;
    private int year, event_type;


    /**
     * @return Event Type, as defined
     * <a href="https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2">here</a>
     */
    public int getEventType() {
        return event_type;
    }

    /**
     * @return Year the event data is for.
     */
    public int getYear() {
        return year;
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


}
