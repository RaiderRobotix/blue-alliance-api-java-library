package com.thebluealliance.requests;

import com.thebluealliance.Deserializer;
import com.thebluealliance.models.Match;
import com.thebluealliance.models.SimpleMatch;

public class MatchRequest {

	DataRequest tba;
	
	public MatchRequest(DataRequest tba){
		this.tba = tba;
	}
	
	public Match getMatch(String matchKey){
		String directory = "/match/" + matchKey;
		return Deserializer.toMatch(tba
				.getDataTBA(directory)
				.getJson());
	}
	
	public SimpleMatch getSimpleMatch(String matchKey){
		String directory = "/match/" + matchKey + "/simple";
		return Deserializer.toSimpleMatch(tba
				.getDataTBA(directory)
				.getJson());
	}
	
}
