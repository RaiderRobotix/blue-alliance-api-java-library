package com.thebluealliance.api.v3.requests;

import java.io.IOException;

import com.thebluealliance.api.v3.Deserializer;
import com.thebluealliance.api.v3.models.*;

/**
 * Makes requests with event-specific information
 */
public class EventRequest {

	private DataRequest tba;

	/**
	 * Creates an EventRequest object
	 *
	 * @param tba A {@link DataRequest} object with the appropriate auth key
	 */
	public EventRequest(DataRequest tba) {
		this.tba = tba;
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return The {@link Event} object referenced by the given key
	 * @throws IOException
	 */
	public Event getEvent(String eventKey) throws IOException {
		String directory = "/event/" + eventKey;
		return Deserializer.toEvent(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}/simple</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return The {@link SimpleEvent} object referenced by the given key
	 * @throws IOException
	 */
	public SimpleEvent getSimpleEvent(String eventKey) throws IOException {
		String directory = "/event/" + eventKey + "/simple";
		return Deserializer.toSimpleEvent(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}/teams</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link Team} objects that competed in the given event.
	 * @throws IOException
	 */
	public Team[] getTeams(String eventKey) throws IOException {
		String directory = "/event/" + eventKey + "/teams";
		return Deserializer.toTeamArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}/teams/simple</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link SimpleTeam} objects that competed in the given event.
	 * @throws IOException
	 */

	public SimpleTeam[] getSimpleTeams(String eventKey) throws IOException {
		String directory = "/event/" + eventKey + "/teams/simple";
		return Deserializer.toSimpleTeamArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}/teams/keys</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link Team} keys that competed in the given event.
	 * @throws IOException
	 */

	public String[] getTeamKeys(String eventKey) throws IOException {
		String directory = "/event/" + eventKey + "/teams/keys";
		return Deserializer.toStringArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/events/{year}</code>
	 *
	 * @param year Competition year (or season). Must be four digits.
	 * @return A list of {@link Event} objects that occurred in a given year
	 * @throws IOException
	 */

	public Event[] getEvents(int year) throws IOException {
		String directory = "/events/" + year;
		return Deserializer.toEventArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/events/{year}/simple</code>
	 *
	 * @param year Competition year (or season). Must be four digits.
	 * @return A list of {@link SimpleEvent} objects that occurred in a given year
	 * @throws IOException
	 */
	public SimpleEvent[] getSimpleEvents(int year) throws IOException {
		String directory = "/events/" + year + "/simple";
		return Deserializer.toSimpleEventArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/events/{year}/keys</code>
	 *
	 * @param year Competition year (or season). Must be four digits.
	 * @return A list of {@link Event} keys that occurred in a given year
	 * @throws IOException
	 */
	public String[] getEventKeys(int year) throws IOException {
		String directory = "/event/" + year + "/keys";
		return Deserializer.toStringArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}/district_points</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of team rankings for the event
	 * @throws IOException
	 */
	public EventDistrictPoints getDistrictPoints(String eventKey) throws IOException {
		String directory = "/event/" + eventKey + "/district_points";
		return Deserializer.toEventDistrictPoints(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}/alliances</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link EliminationAlliance}s for the event
	 * @throws IOException
	 */
	public EliminationAlliance[] getAlliances(String eventKey) throws IOException {
		String directory = "/event/" + eventKey + "/alliances";
		return Deserializer.toEliminationAllianceArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}/oprs</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A set of {@link OPRs} (includeing OPR, DPR, and CCWM) for the event
	 * @throws IOException
	 */
	public OPRs getOPRs(String eventKey) throws IOException {
		String directory = "/event/" + eventKey + "/oprs";
		return Deserializer.toOPRs(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}/rankings</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of team rankings for the event
	 * @throws IOException
	 */
	public EventRankings getRankings(String eventKey) throws IOException {
		String directory = "/event/" + eventKey + "/rankings";
		return Deserializer.toEventRankings(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}/matches</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link Match}es for the event
	 * @throws IOException
	 */
	public Match[] getMatches(String eventKey) throws IOException {
		String directory = "/event/" + eventKey + "/matches";
		return Deserializer.toMatchArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}/matches/simple</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link SimpleMatch}es for the event
	 * @throws IOException
	 */
	public SimpleMatch[] getSimpleMatches(String eventKey) throws IOException {
		String directory = "/event/" + eventKey + "/matches/simple";
		return Deserializer.toSimpleMatchArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}/matches/keys</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of match keys for the event
	 * @throws IOException
	 */
	public String[] getMatchKeys(String eventKey) throws IOException {
		String directory = "/event/" + eventKey + "/matches/keys";
		return Deserializer.toStringArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/event/{eventKey}/awards</code>
	 *
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link Award}s from the given the event
	 * @throws IOException
	 */
	public Award[] getAwards(String eventKey) throws IOException {
		String directory = "/event/" + eventKey + "/awards";
		return Deserializer.toAwardArray(tba.getDataTBA(directory).getJson());
	}

}
