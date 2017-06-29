package com.thebluealliance;

import com.thebluealliance.requests.DataRequest;
import com.thebluealliance.requests.DistrictRequest;
import com.thebluealliance.requests.EventRequest;
import com.thebluealliance.requests.MatchRequest;
import com.thebluealliance.requests.TeamRequest;

public class TBA {
	
	public static String AUTH_KEY;
	public final DataRequest dataRequest;
	public final TeamRequest teamRequest;
	public final EventRequest eventRequest;
	public final DistrictRequest districtRequest;
	public final MatchRequest matchRequest;
	
	
	public TBA(String authKey){
		AUTH_KEY = authKey;
		dataRequest = new DataRequest(AUTH_KEY);
		teamRequest = new TeamRequest(dataRequest);
		eventRequest = new EventRequest(dataRequest);
		districtRequest = new DistrictRequest(dataRequest);
		matchRequest = new MatchRequest(dataRequest);
	}

}
