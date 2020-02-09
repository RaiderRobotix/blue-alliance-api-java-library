package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * Represents a team's status during an event
 */
public class TeamEventStatus {

	/**
	 * @return The team's {@link Rank} during the qualification matches
	 */
	Rank qual;
	/**
	 * @return The team's alliance selection information
	 */
	Alliance alliance;
	/**
	 * @return Playoff status for this team, may be null if the team did not make playoffs, or playoffs have not begun.
	 */
	PlayoffStatus playoff;
	/**
	 * @return An HTML formatted string suitable for display to the user containing the team's alliance pick status.
	 */
	String alliance_status_str;
	/**
	 * @return An HTML formatter string suitable for display to the user containing the team�s playoff status.
	 */
	String playoff_status_str;
	/**
	 * @return An HTML formatted string suitable for display to the user containing the team�s overall status summary of the event.
	 */
	String overall_status_str;

	/**
	 * Holds rank information of a team during an event
	 */
	@Value
	public class Rank {
		/**
		 * @return Number of teams ranked.
		 */
		int num_teams;
		/**
		 * @return Either <code>completed</code> or <code>ongoing</code>
		 */
		String status;
		/**
		 * @return A {@link Ranking} describing the team's status in the qualification tournament
		 */
		Ranking ranking;

	}

	/**
	 * Describes a team's alliance during the playoff tournament
	 */
	@Value
	public class Alliance {
		/**
		 * @return Alliance name, may be null.
		 */
		String name;
		/**
		 * @return Alliance number
		 */
		int number;
		/**
		 * @return Order the team was picked in the alliance from 0-2, with 0 being alliance captain.
		 */
		int pick;
		/**
		 * @return Backup status, may be null
		 */
		AllianceBackup backup;

		/**
		 * Describes the backup status of an alliance
		 */
		@Value
		public class AllianceBackup {
			String out, in;

			/**
			 * @return TBA key for the team replaced by the backup.
			 */
			public String getOut() {
				return out;
			}

			/**
			 * @return TBA key for the backup team called in.
			 */
			public String getIn() {
				return in;
			}

		}

	}

	@Value
	public class PlayoffStatus {
		String level;
		String record;
		String status;
	}

}
