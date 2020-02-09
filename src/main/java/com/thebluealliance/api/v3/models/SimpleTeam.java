package com.thebluealliance.api.v3.models;

import lombok.Value;
import lombok.experimental.NonFinal;

/**
 * Shortform representation of a FIRST Robotics Competition team
 */
@Value
@NonFinal
public class SimpleTeam {

	/**
	 * @return TBA team key with the format <code>frcXXXX</code> with <code>XXXX</code> representing the team number.
	 */
	String key;
	/**
	 * @return Team nickname provided by FIRST.
	 */
	String nickname;
	/**
	 * @return Official long name registered with FIRST.
	 */
	String name;
	/**
	 * @return City of team derived from parsing the address registered with FIRST.
	 */
	String city;
	/**
	 * @return State of team derived from parsing the address registered with FIRST.
	 */
	String state_prov;
	/**
	 * @return Country of team derived from parsing the address registered with FIRST.
	 */
	String country;
	/**
	 * @return Official team number issued by FIRST.
	 */

	int team_number;
}
