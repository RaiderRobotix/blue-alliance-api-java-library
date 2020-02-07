package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * A <code>District</code> object represents a district for a particular year
 */
@Value public class District {

	/**
	* @return The short identifier for the district.
	*/
    String abbreviation;

	/**
	* @return The long name for the district.
	*/
    String display_name;

	/**
	* @return Key for this district, e.g. <code>2016ne</code>.
	*/
    String key;

	/**
	* @return Year this district participated.
	*/
    int year;
}
