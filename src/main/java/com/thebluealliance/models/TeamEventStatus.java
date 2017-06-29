package com.thebluealliance.models;


public class TeamEventStatus {
	
	private Rank qual;
	private Alliance alliance;
	private PlayoffStatus playoff;
	private String alliance_status_str, playoff_status_str, overall_status_str;
	
	public class Rank{
		private int num_teams;
		private String status;
		private Ranking ranking;


		public int getNumTeams() {
			return num_teams;
		}


		public String getStatus() {
			return status;
		}


		public Ranking getRanking() {
			return ranking;
		}
		
	}
	
	public class Alliance{
		private String name;
		private int number, pick;
		private AllianceBackup backup;
		
		public class AllianceBackup{
			private String out, in;

			public String getOut() {
				return out;
			}

			public String getIn() {
				return in;
			}
			
		}

		public String getName() {
			return name;
		}

		public int getNumber() {
			return number;
		}

		public int getPick() {
			return pick;
		}

		public AllianceBackup getBackup() {
			return backup;
		}
		
	}
	
	public class PlayoffStatus{
		private String level, record, status;

		public String getLevel() {
			return level;
		}

		public String getRecord() {
			return record;
		}

		public String getStatus() {
			return status;
		}
	}

	public Rank getQual() {
		return qual;
	}

	public Alliance getAlliance() {
		return alliance;
	}

	public PlayoffStatus getPlayoffStatus() {
		return playoff;
	}

	public String getAllianceStatusStr() {
		return alliance_status_str;
	}

	public String getPlayoffStatusStr() {
		return playoff_status_str;
	}

	public String getOverallStatusStr() {
		return overall_status_str;
	}

}
