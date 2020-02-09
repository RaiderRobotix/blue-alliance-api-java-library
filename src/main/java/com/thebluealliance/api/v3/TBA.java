package com.thebluealliance.api.v3;

import com.thebluealliance.api.v3.requests.*;

/**
 * Base class used to access the The Blue Alliance API. A TBA object must be created to use this client library.
 */
public class TBA {

	private static String AUTH_KEY;

	/**
	 * A {@link DataRequest} object to make direct calls to the API
	 */
	public final DataRequest dataRequest;

	/**
	 * A {@link TeamRequest} object to make calls in which a <code>teamNumber</code> is the primary argument
	 */
	public final TeamRequest teamRequest;

	/**
	 * An {@link EventRequest} object to make calls in which an <code>eventKey</code> is the primary argument
	 */
	public final EventRequest eventRequest;

	/**
	 * A {@link DistrictRequest} object to make calls in which a <code>districtKey</code> is the primary argument
	 */
	public final DistrictRequest districtRequest;

	/**
	 * A {@link MatchRequest} object to make calls in which a <code>matchKey</code> is the primary argument
	 */
	public final MatchRequest matchRequest;

	/**
	 * Create a TBA object to make API requests
	 *
	 * @param authKey The Read API Key, generated on your <a href="https://www.thebluealliance.com/account">Account Dashboard</a> on The Blue Alliance
	 */
	public TBA(String authKey) {
		AUTH_KEY = authKey;
		dataRequest = new DataRequest(AUTH_KEY);
		teamRequest = new TeamRequest(dataRequest);
		eventRequest = new EventRequest(dataRequest);
		districtRequest = new DistrictRequest(dataRequest);
		matchRequest = new MatchRequest(dataRequest);
	}

}
