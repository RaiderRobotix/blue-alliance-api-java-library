package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * A <code>Award</code> object represents an award won at a FIRST Robotics Competition event and its associated descriptors.
 */
@Value
public class Award {

	/**
	 * The name of the award as provided by FIRST. May vary for the same award type.
	 */
	String name;

	/**
	 * The <code>event_key</code> of the event the award was won at.
	 */
	String event_key;

	/**
	 * Integer representing the type of award given.
	 * 
	 * @see <a href="https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/award_type.py#L6">award_type.py</a>
	 */
	int award_type;

	/**
	 * The year this award was won.
	 */
	int year;

	/**
	 * A list of recipients of the award at the event.
	 */
	AwardRecipient[] recipient_list;

	/**
	 * An <code>AwardRecipient</code> object represents the team and/or person who received an award at an event.
	 */
	@Value
	public class AwardRecipient {

		/**
		 * The TBA team key for the team that was given the award. May be <code>null</code>.
		 */
		String team_key;

		/**
		 * The name of the individual given the award. May be <code>null</code>.
		 */
		String awardee;
	}

}
