package com.thebluealliance.api.v3.requests;

import java.io.IOException;

import com.thebluealliance.api.v3.Deserializer;
import com.thebluealliance.api.v3.models.*;

/**
 * Makes requests with team-specific information
 */
public class TeamRequest {

	private DataRequest tba;

	/**
	 * Creates a TeamRequest object
	 *
	 * @param dataRequest A {@link DataRequest} object with the appropriate auth key
	 */
	public TeamRequest(DataRequest dataRequest) {
		tba = dataRequest;
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @return The {@link Team} object referenced by the given team number
	 * @throws IOException
	 */
	public Team getTeam(int teamNumber) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey;
		return Deserializer.toTeam(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/simple</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @return The {@link SimpleTeam} object referenced by the given team number
	 * @throws IOException
	 */
	public SimpleTeam getSimpleTeam(int teamNumber) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/simple";
		return Deserializer.toSimpleTeam(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/years_participated</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @return A list of years in which the team participated in at least one competition
	 * @throws IOException
	 */
	public int[] getYearsParticipated(int teamNumber) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/years_participated";
		return Deserializer.toIntArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/districts</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @return A list of {@link District}s that the team was part of, for each year
	 * @throws IOException
	 */
	public District[] getDistricts(int teamNumber) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/districts";
		return Deserializer.toDistrictEntryArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/robots</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @return A list of {@link Robot}s for each year that a robot name was provided. WIll be null if the team never named a robot.
	 * @throws IOException
	 */
	public Robot[] getRobots(int teamNumber) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/robots";
		return Deserializer.toRobotArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/events</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @return A list of all events the team competed at
	 * @throws IOException
	 */
	public Event[] getEvents(int teamNumber) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events";
		return Deserializer.toEventArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/events/{year}</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @param year
	 *                       Competition year (or season). Must be four digits
	 * @return A list of all events the team competed at in the given year
	 * @throws IOException
	 */
	public Event[] getEvents(int teamNumber, int year) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events/" + year;
		return Deserializer.toEventArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/events/simple</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @return A short-form list of all events the team competed at
	 * @throws IOException
	 */
	public SimpleEvent[] getSimpleEvents(int teamNumber) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events/simple";
		return Deserializer.toSimpleEventArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/events/{year}/simple</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @param year
	 *                       Competition year (or season). Must be four digits
	 * @return A short-form list of all events the team competed at in the given year
	 * @throws IOException
	 */
	public SimpleEvent[] getSimpleEvents(int teamNumber, int year) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events/" + year + "/simple";
		return Deserializer.toSimpleEventArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/events/keys</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @return A list of all event keys for events that the team competed at
	 * @throws IOException
	 */
	public String[] getEventKeys(int teamNumber) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events/keys";
		return Deserializer.toStringArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/events/{year}/keys</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @param year
	 *                       Competition year (or season). Must be four digits
	 * @return A list of all event keys for events that the team competed at in the given year
	 * @throws IOException
	 */
	public String[] getEventKeys(int teamNumber, int year) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/events/" + year + "/keys";
		return Deserializer.toStringArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/event/{eventKey}/matches</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @param eventKey
	 *                       TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of all {@link Match}s that the given team participated in the given event
	 * @throws IOException
	 */
	public Match[] getMatches(int teamNumber, String eventKey) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/event/" + eventKey + "/matches";
		return Deserializer.toMatchArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/event/{eventKey}/matches/simple</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of all {@link SimpleMatch}s that the given team participated in the given event
	 * @throws IOException
	 */
	public SimpleMatch[] getSimpleMatches(int teamNumber, String eventKey) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/event/" + eventKey + "/matches/simple";
		return Deserializer.toSimpleMatchArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/event/{eventKey}/matches/keys</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of all match keys that the given team participated in the given event
	 * @throws IOException
	 */
	public String[] getMatchKeys(int teamNumber, String eventKey) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/event/" + eventKey + "/matches/keys";
		return Deserializer.toStringArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/event/{eventKey}/awards</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of all {@link Award}s won by the given team at the given event
	 * @throws IOException
	 */
	public Award[] getAwards(int teamNumber, String eventKey) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/event/" + eventKey + "/awards";
		return Deserializer.toAwardArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/event/{eventKey}/status</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return The competition rank and status of the team at the given event.
	 * @throws IOException
	 */
	public TeamEventStatus getEventStatus(int teamNumber, String eventKey) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/event/" + eventKey + "/status";
		return Deserializer.toTeamEventStatus(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/awards</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @return A list of all {@link Award}s that the given team has won
	 * @throws IOException
	 */
	public Award[] getAwards(int teamNumber) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/awards";
		return Deserializer.toAwardArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/awards/{year}</code>
	 *
	 * @param teamNumberThe FRC team number issued by FIRST
	 * @param year Competition year (or season). Must be four digits
	 * @return A list of all {@link Award}s that the given team won in the given year
	 * @throws IOException
	 */
	public Award[] getAwards(int teamNumber, int year) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/awards/" + year;
		return Deserializer.toAwardArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/matches/{year}</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @param year Competition year (or season). Must be four digits
	 * @return A list of all {@link Match}s that the given team participated in during the given year
	 * @throws IOException
	 */
	public Match[] getMatches(int teamNumber, int year) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/matches/" + year;
		return Deserializer.toMatchArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/matches/{year}/simple</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @param year Competition year (or season). Must be four digits
	 * @return A list of all {@link SimpleMatch}s that the given team participated in during the given year
	 * @throws IOException
	 */
	public SimpleMatch[] getSimpleMatches(int teamNumber, int year) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/matches/" + year + "/simple";
		return Deserializer.toSimpleMatchArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/matches/{year}/keys</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @param year Competition year (or season). Must be four digits
	 * @return A list of all match keys for matches that the given team participated in during the given year
	 * @throws IOException
	 */
	public String[] getMatchKeys(int teamNumber, int year) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/matches/" + year + "/keys";
		return Deserializer.toStringArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/media/{year}</code>
	 *
	 * @param teamNumber The FRC team number issued by FIRST
	 * @param year Competition year (or season). Must be four digits
	 * @return A list of all {@link Media} for the given team and year
	 * @throws IOException
	 */
	public Media[] getMedia(int teamNumber, int year) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/media/" + year;
		return Deserializer.toMediaArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/team/frc{teamNumber}/social_media</code>
	 *
	 * @param teamNumber
	 *                       The FRC team number issued by FIRST
	 * @return A list of all (social) {@link Media} for the given team
	 * @throws IOException
	 */
	public Media[] getSocialMedia(int teamNumber) throws IOException {
		String teamKey = "frc" + teamNumber;
		String directory = "/team/" + teamKey + "/social_media/";
		return Deserializer.toMediaArray(tba.getDataTBA(directory).getJson());
	}

}
