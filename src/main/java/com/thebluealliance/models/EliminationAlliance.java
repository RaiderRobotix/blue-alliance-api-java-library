package com.thebluealliance.models;



public class EliminationAlliance {
	private String name;
	private AllianceBackup backup;
	private String[] declines, picks;
	private PlayoffStatus status;
	
	public class AllianceBackup{
		private String out, in;

		public String getOut() {
			return out;
		}

		public String getIn() {
			return in;
		}
		
	}
	
	public class PlayoffStatus{
		private String level, status;
		private WLTRecord current_level_record, record;
		private double playoff_average;

		public String getLevel() {
			return level;
		}

		public String getStatus() {
			return status;
		}
		
		
		public double getPlayoffAverage(){
			return playoff_average;
		}

		public WLTRecord getCurrentLevelRecord() {
			return current_level_record;
		}

		public WLTRecord getRecord() {
			return record;
		}
	}

	public String getName() {
		return name;
	}

	public AllianceBackup getBackup() {
		return backup;
	}

	public String[] getDeclines() {
		return declines;
	}

	public String[] getPicks() {
		return picks;
	}

	public PlayoffStatus getStatus() {
		return status;
	}
}
