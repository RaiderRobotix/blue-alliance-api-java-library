package com.thebluealliance.api.v3.models;

import java.util.HashMap;

/**
 * Contains OPR, DPR, and CCWM for teams at the event.
 */
public class OPRs {

	private HashMap<String, Double> oprs, dprs, ccwms;

	/**
	 * @param teamNumber Team number of the team to query
	 * @return Offensive Power Rating of the team represented by <code>teamNumber</code>
	 */
	public double getOPR(int teamNumber) {
		return oprs.get("frc" + teamNumber);
	}

	/**
	 * @param teamNumber Team number of the team to query
	 * @return Defensive Power Rating of the team represented by <code>teamNumber</code>
	 */
	public double getDPR(int teamNumber) {
		return dprs.get("frc" + teamNumber);
	}

	/**
	 * @param teamNumber
	 *                       Team number of the team to query
	 * @return Calculated Contribution to Winning Margin of the team represented by <code>teamNumber</code>
	 */
	public double getCCWM(int teamNumber) {
		return ccwms.get("frc" + teamNumber);
	}

}
