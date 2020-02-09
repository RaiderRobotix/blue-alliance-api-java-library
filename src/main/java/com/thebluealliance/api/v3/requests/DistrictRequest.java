package com.thebluealliance.api.v3.requests;

import java.io.IOException;

import com.thebluealliance.api.v3.Deserializer;
import com.thebluealliance.api.v3.models.*;

/**
 * Makes requests with district-specific information
 */
public class DistrictRequest {

	private DataRequest tba;

	/**
	 * Creates a DistrictRequest object
	 *
	 * @param tba A {@link DataRequest} object with the appropriate auth key
	 */
	public DistrictRequest(DataRequest tba) {
		this.tba = tba;
	}

	/**
	 * Makes API requests with the subdirectory <code>/district/{districtKey}/teams</code>
	 *
	 * @param districtKey BA District Key, e.g. <code>2016fim</code>
	 * @return A list of {@link Team} objects in the given district
	 * @throws IOException
	 */
	public Team[] getTeams(String districtKey) throws IOException {
		String directory = "/district/" + districtKey + "/teams";
		return Deserializer.toTeamArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/district/{districtKey}/teams/simple</code>
	 *
	 * @param districtKey TBA District Key, e.g. <code>2016fim</code>
	 * @return A list of {@link SimpleTeam} objects in the given district
	 * @throws IOException
	 */
	public SimpleTeam[] getSimpleTeams(String districtKey) throws IOException {
		String directory = "/district/" + districtKey + "/teams/simple";
		return Deserializer.toSimpleTeamArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/district/{districtKey}/teams/keys</code>
	 *
	 * @param districtKey TBA District Key, e.g. <code>2016fim</code>
	 * @return A list of team keys in the given district
	 * @throws IOException
	 */
	public String[] getTeamKeys(String districtKey) throws IOException {
		String directory = "/district/" + districtKey + "/teams/keys";
		return Deserializer.toStringArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/district/{districtKey}/rankings</code>
	 *
	 * @param districtKey TBA District Key, e.g. <code>2016fim</code>
	 * @return A list of team {@link DistrictRanking}s for the given district
	 * @throws IOException
	 */
	public DistrictRanking[] getRankings(String districtKey) throws IOException {
		String directory = "/district/" + districtKey + "/rankings";
		return Deserializer.toDistrictRankingArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/district/{districtKey}/events</code>
	 *
	 * @param districtKey TBA District Key, e.g. <code>2016fim</code>
	 * @return A list of events in the given district
	 * @throws IOException
	 */
	public Event[] getEvents(String districtKey) throws IOException {
		String directory = "/district/" + districtKey + "/events";
		return Deserializer.toEventArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/district/{districtKey}/events/simple</code>
	 *
	 * @param districtKey
	 *                        TBA District Key, e.g. <code>2016fim</code>
	 * @return A short-form list of events in the given district
	 * @throws IOException
	 */
	public SimpleEvent[] getSimpleEvents(String districtKey) throws IOException {
		String directory = "/district/" + districtKey + "/events/simple";
		return Deserializer.toSimpleEventArray(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/district/{districtKey}/events/keys</code>
	 *
	 * @param districtKey TBA District Key, e.g. <code>2016fim</code>
	 * @return A list of event keys in the given district
	 * @throws IOException
	 */
	public String[] getEventKeys(String districtKey) throws IOException {
		String directory = "/district/" + districtKey + "/events/keys";
		return Deserializer.toStringArray(tba.getDataTBA(directory).getJson());
	}
}
