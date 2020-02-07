package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * Rank of a {@link Team} in a district.
 */
@Value public class DistrictRanking {

	/**
	* @return TBA team key for the team.
	*/
    String team_key;

	/**
	* @return Numerical rank of the team, 1 being top rank.
	*/
    int rank;

	/**
	* @return Any points added to a team as a result of the rookie bonus.
	*/
    int rookie_bonus;

	/**
	* @return Total district points for the team.
	*/
    int point_total;

	/**
	* @return List of events and their associated points that contributed to the point total for the team.
	*/
    EventPoints[] event_points;

}
