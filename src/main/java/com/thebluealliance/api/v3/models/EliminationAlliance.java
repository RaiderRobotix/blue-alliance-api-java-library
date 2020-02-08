package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * Represents an alliance of teams during the elimination tournament
 */
@Value
public class EliminationAlliance {

	/**
	 * @return Alliance name, may be null.
	 */
	String name;

	/**
	 * @return Backup team called in, may be null.
	 */
	AllianceBackup backup;

	/**
	 * @return List of team keys that declined the alliance.
	 */
	String[] declines;

	/**
	 * @return List of team keys picked for the alliance. First pick is captain.
	 */
	String[] picks;

	/**
	 * @return A {@link PlayoffStatus} object with current statistics of the alliance.
	 */
	PlayoffStatus status;

	/**
	 * Represents a backup team called in by an {@link EliminationAlliance}
	 */
	@Value
	public class AllianceBackup {

		/**
		 * @return Team key that was replaced by the backup team.
		 */
		String out;

		/**
		 * @return Team key that was called in as the backup.
		 */
		String in;

	}

	/**
	 * Represents the statistics and status of a {@link EliminationAlliance}
	 */
	@Value
	public class PlayoffStatus {

		/**
		 * @return The level of the bracket that an alliance is currently in or was eliminated in. Value may be <code>qf</code>, <code>sf</code>, or <code>f</code>
		 */
		String level;

		/**
		 * @return The current playing status of an alliance. Value may be <code>eliminated</code>, <code>won</code>, or <code>playing</code>.
		 */
		String status;

		/**
		 * @return A {@link WLTRecord} for the alliance at the current level of the playoff tournament
		 */
		WLTRecord current_level_record;

		/**
		 * @return A {@link WLTRecord} for the alliance during the entire playoff tournament
		 */
		WLTRecord record;

		/**
		 * @return The average of all playoff matches of an alliance. May be <code>null</code>.
		 */
		double playoff_average;

	}
}
