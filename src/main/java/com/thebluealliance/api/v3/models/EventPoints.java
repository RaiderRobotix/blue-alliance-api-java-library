package com.thebluealliance.api.v3.models;

/**
 * Holds district point contributions and breakdown for a team at an event
 */
public class EventPoints {
    private String event_key;
    private boolean district_cmp;
    private int alliance_points, award_points, qual_points, elim_points, total;

    /**
     * @return TBA Event key for this event.
     */
    public String getEventKey() {
        return event_key;
    }

    /**
     * @return <code>true</code> if this event is a District Championship event
     */
    public boolean isDistrictCmp() {
        return district_cmp;
    }

    /**
     * @return Points awarded for alliance selection
     */
    public int getAlliancePoints() {
        return alliance_points;
    }

    /**
     * @return Points awarded for event awards.
     */
    public int getAwardPoints() {
        return award_points;
    }

    /**
     * @return Points awarded for qualification match performance.
     */
    public int getQualPoints() {
        return qual_points;
    }

    /**
     * @return Points awarded for elimination match performance.
     */
    public int getElimPoints() {
        return elim_points;
    }

    /**
     * @return Total points awarded at this event.
     */
    public int getTotal() {
        return total;
    }
}