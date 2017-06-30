package com.thebluealliance.api.v3.requests;

import com.thebluealliance.api.v3.Deserializer;
import com.thebluealliance.api.v3.models.*;

/** Makes requests with event-specific information
 */
public class EventRequest {

	DataRequest tba;
	
	/** Creates an EventRequest object
	 * @param tba A {@link DataRequest} object with the appropriate auth key
	 */
	public EventRequest(DataRequest tba){
		this.tba = tba;
	}
	
	/** Makes API requests with the subdirectory <code>/event/{eventKey}/teams</code>
	 * 
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link Team} objects that competed in the given event.
	 */
	public Team[] getTeams(String eventKey){
		String directory = "/event/" + eventKey+"/teams";
		return Deserializer.toTeamArray(tba
				.getDataTBA(directory).getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/event/{eventKey}/teams/simple</code>
	 * 
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link SimpleTeam} objects that competed in the given event.
	 */
	
	public SimpleTeam[] getSimpleTeams(String eventKey){
		String directory = "/event/" + eventKey+"/teams/simple";
		return Deserializer.toSimpleTeamArray(tba
				.getDataTBA(directory).getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/event/{eventKey}/teams/keys</code>
	 * 
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link Team} keys that competed in the given event.
	 */
	
	public String[] getTeamKeys(String eventKey){
		String directory = "/event/" + eventKey+"/teams/keys";
		return Deserializer.toStringArray(tba
				.getDataTBA(directory).getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/events/{year}</code>
	 * 
	 * @param year Competition year (or season). Must be four digits.
	 * @return A list of {@link Event} objects that occurred in a given year
	 */
	
	public Event[] getEvents(int year){
		String directory = "/event/" +year;
		return Deserializer.toEventArray(tba
				.getDataTBA(directory).getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/events/{year}/simple</code>
	 * 
	 * @param year Competition year (or season). Must be four digits.
	 * @return A list of {@link SimpleEvent} objects that occurred in a given year
	 */
	public SimpleEvent[] getSimpleEvents(int year){
		String directory = "/event/" +year+"/simple";
		return Deserializer.toSimpleEventArray(tba
				.getDataTBA(directory).getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/events/{year}/keys</code>
	 * 
	 * @param year Competition year (or season). Must be four digits.
	 * @return A list of {@link Event} keys that occurred in a given year
	 */
	public String[] getEventKeys(int year){
		String directory = "/event/" +year+"/keys";
		return Deserializer.toStringArray(tba
				.getDataTBA(directory).getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/event/{eventKey}/district_points</code>
	 * 
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of team rankings for the event
	 */
	public EventDistrictPoints getDistrictPoints(String eventKey){
		String directory = "/event/" +eventKey+"/district_points";
		return Deserializer.toEventDistrictPoints(tba
				.getDataTBA(directory).getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/event/{eventKey}/alliances</code>
	 * 
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link EliminationAlliance}s for the event
	 */
	public EliminationAlliance[] getAlliances(String eventKey){
		String directory = "/event/" +eventKey+"/alliances";
		return Deserializer.toEliminationAllianceArray(tba
				.getDataTBA(directory).getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/event/{eventKey}/oprs</code>
	 * 
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A set of {@link OPRs} (includeing OPR, DPR, and CCWM) for the event
	 */
	public OPRs getOPRs(String eventKey){
		String directory = "/event/" +eventKey+"/oprs";
		return Deserializer.toOPRs(tba
				.getDataTBA(directory).getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/event/{eventKey}/rankings</code>
	 * 
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of team rankings for the event
	 */
	public EventRankings getRankings(String eventKey){
		String directory = "/event/" +eventKey+"/rankings";
		return Deserializer.toEventRankings(tba
				.getDataTBA(directory).getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/event/{eventKey}/matches</code>
	 * 
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link Match}es for the event
	 */
	public Match[] getMatches(String eventKey){
		String directory =  "/event/" + eventKey + "/matches";
		return Deserializer.toMatchArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/event/{eventKey}/matches/simple</code>
	 * 
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link SimpleMatch}es for the event
	 */
	public SimpleMatch[] getSimpleMatches(String eventKey){
		String directory = "/event/" + eventKey + "/matches/simple";
		return Deserializer.toSimpleMatchArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/event/{eventKey}/matches/keys</code>
	 * 
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of match keys for the event
	 */
	public String[] getMatchKeys(String eventKey){
		String directory = "/event/" + eventKey+"/matches/keys";
		return Deserializer.toStringArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	/** Makes API requests with the subdirectory <code>/event/{eventKey}/awards</code>
	 * 
	 * @param eventKey TBA Event Key, e.g. <code>2016nytr</code>
	 * @return A list of {@link Award}s from the given the event
	 */
	public Award[] getAwards(String eventKey){
		String directory = "/event/" + eventKey+"/awards";
		return Deserializer.toAwardArray(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	
}
