package com.thebluealliance.api.v3.models;

/** A Win-Loss-Tie record for a team, or an alliance.
 *
 */
public class WLTRecord{
	private int losses, wins, ties;

	/**
	 * @return Number of losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * @return Number of wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * @return Number of ties
	 */
	public int getTies() {
		return ties;
	}
}
