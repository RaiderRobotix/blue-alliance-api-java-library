package com.thebluealliance.api.v3.models;

/**
 * Represents the ranking of a team at an event
 */
public class Ranking {
    private int dq, matches_played, qual_average, rank;
    private WLTRecord record;
    private String team_key;
    private double[] sort_orders;

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
     * @return The average match score during qualifications. Year specific. May be null if not relevant for a given
     * year.
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
     * @return Win-Loss-Tie object model for all matches
     */
    public WLTRecord getRecord() {
        return record;
    }

    /**
     * @return The team with this rank.
     */
    public String getTeamKey() {
        return team_key;
    }

    /**
     * @return Sorting criteria values for the current season
     */
    public double[] getSortOrders() {
        return sort_orders;
    }


}
