package com.thebluealliance.api.v3.requests;

import java.io.IOException;

import com.thebluealliance.api.v3.Deserializer;
import com.thebluealliance.api.v3.models.Match;
import com.thebluealliance.api.v3.models.SimpleMatch;

/**
 * Makes requests with match-specific information
 */
public class MatchRequest {

	private DataRequest tba;

	/**
	 * Creates a MatchRequest object
	 *
	 * @param tba A {@link DataRequest} object with the appropriate auth key
	 */
	public MatchRequest(DataRequest tba) {
		this.tba = tba;
	}

	/**
	 * Makes API requests with the subdirectory <code>/match/{matchKey}</code>
	 *
	 * @param matchKey TBA Match Key, e.g. <code>2016nytr_qm1</code>
	 * @return A {@link Match} object for the given match key
	 * @throws IOException
	 */
	public Match getMatch(String matchKey) throws IOException {
		String directory = "/match/" + matchKey;
		return Deserializer.toMatch(tba.getDataTBA(directory).getJson());
	}

	/**
	 * Makes API requests with the subdirectory <code>/match/{matchKey}/simple</code>
	 *
	 * @param matchKey TBA Match Key, e.g. <code>2016nytr_qm1</code>
	 * @return A {@link SimpleMatch} object for the given match key
	 * @throws IOException
	 */
	public SimpleMatch getSimpleMatch(String matchKey) throws IOException {
		String directory = "/match/" + matchKey + "/simple";
		return Deserializer.toSimpleMatch(tba.getDataTBA(directory).getJson());
	}

}
