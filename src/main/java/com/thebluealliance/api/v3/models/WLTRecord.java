package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * A Win-Loss-Tie record for a team, or an alliance.
 */
@Value
public class WLTRecord {
	int losses;
	int wins;
	int ties;
}
