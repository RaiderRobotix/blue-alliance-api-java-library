package com.thebluealliance.api.v3.models;


/**
 * A <code>Award</code> object represents an award won at a FIRST Robotics Competition event and its associated descriptors.
 */
public class Award {

    private String name, event_key;
    private int award_type, year;
    private AwardRecipient[] recipient_list;

    /**
     * @return The name of the award as provided by FIRST. May vary for the same award type.
     */
    public String getName() {
        return name;
    }

    /**
     * @return The <code>event_key</code> of the event the award was won at.
     */
    public String getEventKey() {
        return event_key;
    }

    /**
     * @return Integer representing the type of award given.
     * @see <a href="https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/award_type.py#L6">award_type.py</a>
     */
    public int getAwardType() {
        return award_type;
    }

    /**
     * @return The year this award was won.
     */
    public int getYear() {
        return year;
    }

    /**
     * @return A list of recipients of the award at the event.
     */
    public AwardRecipient[] getRecipientList() {
        return recipient_list;
    }

    /**
     * An <code>AwardRecipient</code> object represents the team and/or person who received an award at an event.
     */
    public class AwardRecipient {
        private String team_key, awardee;

        /**
         * @return The TBA team key for the team that was given the award. May be <code>null</code>.
         */
        public String getTeamKey() {
            return team_key;
        }

        /**
         * @return The name of the individual given the award. May be <code>null</code>.
         */
        public String getAwardee() {
            return awardee;
        }
    }

}
