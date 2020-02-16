package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * Represents a team's status during an event
 */
public class TeamEventStatus {

	/**
	 * The team's {@link Rank} during the qualification matches
	 */
	Rank qual;
	/**
	 * The team's alliance selection information
	 */
	Alliance alliance;
	/**
	 * Playoff status for this team, may be null if the team did not make playoffs, or playoffs have not begun.
	 */
	PlayoffStatus playoff;
	/**
	 * An HTML formatted string suitable for display to the user containing the team's alliance pick status.
	 */
	String alliance_status_str;
	/**
	 * An HTML formatter string suitable for display to the user containing the team�s playoff status.
	 */
	String playoff_status_str;
	/**
	 * An HTML formatted string suitable for display to the user containing the team�s overall status summary of the event.
	 */
	String overall_status_str;

	/**
	 * Holds rank information of a team during an event
	 */
	@Value
	public class Rank {
		/**
		 * Number of teams ranked.
		 */
		int num_teams;
		/**
		 * Either <code>completed</code> or <code>ongoing</code>
		 */
		String status;
		/**
		 * A {@link Ranking} describing the team's status in the qualification tournament
		 */
		Ranking ranking;

	}

	/**
	 * Describes a team's alliance during the playoff tournament
	 */
	@Value
	public class Alliance {
		/**
		 * Alliance name, may be null.
		 */
		String name;
		/**
		 * Alliance number
		 */
		int number;
		/**
		 * Order the team was picked in the alliance from 0-2, with 0 being alliance captain.
		 */
		int pick;
		/**
		 * Backup status, may be null
		 */
		AllianceBackup backup;

		/**
		 * Describes the backup status of an alliance
		 */
		@Value
		public class AllianceBackup {
			/**
			 * TBA key for the team replaced by the backup.
			 */
			String out;

			/**
			 * TBA key for the backup team called in.
			 */
			String in;

		}

	}

	@Value
	public class PlayoffStatus {
		String level;
		String record;
		String status;
	}

}
