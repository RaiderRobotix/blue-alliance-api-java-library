package com.thebluealliance.api.v3;

import com.google.gson.Gson;
import com.thebluealliance.api.v3.models.*;
import com.thebluealliance.api.v3.requests.APIResponse;

/**
 * Collection of <code>static</code> methods to convert JSON data from the API into a model or an array of a model found in {@linkplain com.thebluealliance.api.v3.models}
 */
public class Deserializer {

    private final static Gson gson = new Gson();

    /**
     * Converts JSON to a {@link Team} object
     *
     * @param jsonData JSON object from an {@link APIResponse}
     * @return {@link Team} object represented by <code>jsonData</code>
     */
    public static Team toTeam(String jsonData) {
        Team team = gson.fromJson(jsonData, Team.class);
        return team;
    }

    /**
     * Converts JSON to an array of {@link Team} objects
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link Team} objects represented by <code>jsonData</code>
     */
    public static Team[] toTeamArray(String jsonData) {
        Team[] teamArray = gson.fromJson(jsonData, Team[].class);
        return teamArray;
    }

    /**
     * Converts JSON to a {@link SimpleTeam} object
     *
     * @param jsonData JSON object from an {@link APIResponse}
     * @return {@link SimpleTeam} object represented by <code>jsonData</code>
     */
    public static SimpleTeam toSimpleTeam(String jsonData) {
        SimpleTeam team = gson.fromJson(jsonData, SimpleTeam.class);
        return team;
    }

    /**
     * Converts JSON to an array of {@link SimpleTeam} objects
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link SimpleTeam} objects represented by <code>jsonData</code>
     */
    public static SimpleTeam[] toSimpleTeamArray(String jsonData) {
        SimpleTeam[] simpleTeamArray = gson.fromJson(jsonData, SimpleTeam[].class);
        return simpleTeamArray;
    }

    /**
     * Converts JSON to an array of {@link int}s
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link int}s represented by <code>jsonData</code>
     */
    public static int[] toIntArray(String jsonData) {
        int[] intArray = gson.fromJson(jsonData, int[].class);
        return intArray;
    }

    /**
     * Converts JSON to an array of {@link District} objects
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link District} objects represented by <code>jsonData</code>
     */
    public static District[] toDistrictEntryArray(String jsonData) {
        District[] districtEntryArray = gson.fromJson(jsonData, District[].class);
        return districtEntryArray;
    }

    /**
     * Converts JSON to an array of {@link Robot} objects
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link Robot} objects represented by <code>jsonData</code>
     */
    public static Robot[] toRobotArray(String jsonData) {
        Robot[] robotArray = gson.fromJson(jsonData, Robot[].class);
        return robotArray;
    }

    /**
     * Converts JSON to an array of {@link Event} objects
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link Event} objects represented by <code>jsonData</code>
     */
    public static Event[] toEventArray(String jsonData) {
        Event[] eventArray = gson.fromJson(jsonData, Event[].class);
        return eventArray;
    }

    /**
     * Converts JSON to an array of {@link SimpleEvent} objects
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link SimpleEvent} objects represented by <code>jsonData</code>
     */
    public static SimpleEvent[] toSimpleEventArray(String jsonData) {
        SimpleEvent[] eventArray = gson.fromJson(jsonData, SimpleEvent[].class);
        return eventArray;
    }

    /**
     * Converts JSON to an array of {@link String}s
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link String}s represented by <code>jsonData</code>
     */
    public static String[] toStringArray(String jsonData) {
        String[] stringArray = gson.fromJson(jsonData, String[].class);
        return stringArray;
    }

    /**
     * Converts JSON to an array of {@link Match} objects
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link Match} objects represented by <code>jsonData</code>
     */
    public static Match[] toMatchArray(String jsonData) {
        Match[] matchArray = gson.fromJson(jsonData, Match[].class);
        return matchArray;
    }

    /**
     * Converts JSON to an array of {@link SimpleMatch} objects
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link SimpleMatch} objects represented by <code>jsonData</code>
     */
    public static SimpleMatch[] toSimpleMatchArray(String jsonData) {
        SimpleMatch[] matchArray = gson.fromJson(jsonData, SimpleMatch[].class);
        return matchArray;
    }

    /**
     * Converts JSON to an array of {@link Award} objects
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link Award} objects represented by <code>jsonData</code>
     */
    public static Award[] toAwardArray(String jsonData) {
        Award[] awardArray = gson.fromJson(jsonData, Award[].class);
        return awardArray;
    }

    /**
     * Converts JSON to an array of {@link Media} objects
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link Media} objects represented by <code>jsonData</code>
     */
    public static Media[] toMediaArray(String jsonData) {
        Media[] mediaArray = gson.fromJson(jsonData, Media[].class);
        return mediaArray;
    }

    /**
     * Converts JSON to a {@link TeamEventStatus} object
     *
     * @param jsonData JSON object from an {@link APIResponse}
     * @return {@link TeamEventStatus} object represented by <code>jsonData</code>
     */
    public static TeamEventStatus toTeamEventStatus(String jsonData) {
        TeamEventStatus teamEventStatus = gson.fromJson(jsonData, TeamEventStatus.class);
        return teamEventStatus;
    }

    /**
     * Converts JSON to an array of {@link DistrictRanking} objects
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link DistrictRanking} objects represented by <code>jsonData</code>
     */
    public static DistrictRanking[] toDistrictRankingArray(String jsonData) {
        DistrictRanking[] districtRankingArray = gson.fromJson(jsonData, DistrictRanking[].class);
        return districtRankingArray;
    }

    /**
     * Converts JSON to a {@link EventDistrictPoints} object
     *
     * @param jsonData JSON object from an {@link APIResponse}
     * @return {@link EventDistrictPoints} object represented by <code>jsonData</code>
     */
    public static EventDistrictPoints toEventDistrictPoints(String jsonData) {
        EventDistrictPoints eventDistrictPoints = gson.fromJson(jsonData, EventDistrictPoints.class);
        return eventDistrictPoints;
    }


    /**
     * Converts JSON to an array of {@link EliminationAlliance} objects
     *
     * @param jsonData JSON array from an {@link APIResponse}
     * @return Array of {@link EliminationAlliance} objects represented by <code>jsonData</code>
     */
    public static EliminationAlliance[] toEliminationAllianceArray(String jsonData) {
        EliminationAlliance[] eliminationAllianceArray = gson.fromJson(jsonData, EliminationAlliance[].class);
        return eliminationAllianceArray;
    }

    /**
     * Converts JSON to a {@link OPRs} object
     *
     * @param jsonData JSON object from an {@link APIResponse}
     * @return {@link OPRs} object represented by <code>jsonData</code>
     */
    public static OPRs toOPRs(String jsonData) {
        OPRs oprs = gson.fromJson(jsonData, OPRs.class);
        return oprs;
    }

    /**
     * Converts JSON to a {@link EventRankings} object
     *
     * @param jsonData JSON object from an {@link APIResponse}
     * @return {@link EventRankings} object represented by <code>jsonData</code>
     */
    public static EventRankings toEventRankings(String jsonData) {
        EventRankings eventRankings = gson.fromJson(jsonData, EventRankings.class);
        return eventRankings;
    }

    /**
     * Converts JSON to a {@link Match} object
     *
     * @param jsonData JSON object from an {@link APIResponse}
     * @return {@link Match} object represented by <code>jsonData</code>
     */
    public static Match toMatch(String jsonData) {
        Match match = gson.fromJson(jsonData, Match.class);
        return match;
    }

    /**
     * Converts JSON to a {@link SimpleMatch} object
     *
     * @param jsonData JSON object from an {@link APIResponse}
     * @return {@link SimpleMatch} object represented by <code>jsonData</code>
     */
    public static SimpleMatch toSimpleMatch(String jsonData) {
        SimpleMatch match = gson.fromJson(jsonData, SimpleMatch.class);
        return match;
    }

    /**
     * Converts JSON to an {@link Event} object
     *
     * @param jsonData JSON object from an {@link APIResponse}
     * @return {@link Event} object represented by <code>jsonData</code>
     */
    public static Event toEvent(String jsonData) {
        Event event = gson.fromJson(jsonData, Event.class);
        return event;
    }

    /**
     * Converts JSON to a {@link SimpleEvent} object
     *
     * @param jsonData JSON object from an {@link APIResponse}
     * @return {@link SimpleEvent} object represented by <code>jsonData</code>
     */
    public static SimpleEvent toSimpleEvent(String jsonData) {
        SimpleEvent event = gson.fromJson(jsonData, SimpleEvent.class);
        return event;
    }

}
