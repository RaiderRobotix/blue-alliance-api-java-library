package com.thebluealliance.models;

public class Award {
	
	private String name, event_key;
	private int award_type, year;
	private AwardRecipient[] recipient_list;
	
	public class AwardRecipient{
		private String team_key, awardee;

		public String getTeam_key() {
			return team_key;
		}

		public String getAwardee() {
			return awardee;
		}
	}

	public String getName() {
		return name;
	}

	public String getEventKey() {
		return event_key;
	}

	public int getAwardType() {
		return award_type;
	}

	public int getYear() {
		return year;
	}

	public AwardRecipient[] getRecipientList() {
		return recipient_list;
	}

}
