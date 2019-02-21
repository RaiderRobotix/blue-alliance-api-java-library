package com.thebluealliance.api.v3.models;

import java.util.HashMap;

/**
 * Represents the ranking of a team at an event
 */
public class Ranking {
    private int dq, matches_played, qual_average, rank;
    private HashMap<String, WLTRecord> record;
    private String team_key;

    /**
     * @return Number of times disqualified
     */
    public int getDq() {
        return dq;
    }

    /**
     * @return Number of matches played by this team
     */
    public int getMatchesPlayed() {
        return matches_played;
    }

    /**
     * @return The average match score during qualifications. Year specific. May be null if not relevant for a given year.
     */
    public int getQualAverage() {
        return qual_average;
    }

    /**
     * @return The team�s rank at the event as provided by FIRST.
     */
    public int getRank() {
        return rank;
    }

    /**
     * @return Win-Loss-Tie record information for qualification matches, if available. May be null
     */
    public WLTRecord getQualificationsRecord() {
        return record.get("qualifications");
    }

    /**
     * @return Win-Loss-Tie record information for the event, if available. May be null
     */
    public WLTRecord getOverallRecord() {
        return record.get("overall");
    }

    /**
     * @return The team with this rank.
     */
    public String getTeamKey() {
        return team_key;
    }


}
