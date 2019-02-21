package com.thebluealliance.api.v3.models;

/**
 * Rank of a {@link Team} in a district.
 */
public class DistrictRanking {

    private String teamKey;
    private int rank, rookie_bonus, point_total;
    private EventPoints event_points;


    /**
     * @return TBA team key for the team.
     */
    public String getTeamKey() {
        return teamKey;
    }

    /**
     * @return Numerical rank of the team, 1 being top rank.
     */
    public int getRank() {
        return rank;
    }

    /**
     * @return Any points added to a team as a result of the rookie bonus.
     */
    public int getRookieBonus() {
        return rookie_bonus;
    }

    /**
     * @return Total district points for the team.
     */
    public int getPointTotal() {
        return point_total;
    }

    /**
     * @return List of events and their associated points that contributed to the point total for the team.
     */
    public EventPoints getEventPoints() {
        return event_points;
    }

}
