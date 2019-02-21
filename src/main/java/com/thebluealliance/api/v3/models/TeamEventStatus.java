package com.thebluealliance.api.v3.models;

/**
 * Represents a team's status during an event
 */
public class TeamEventStatus {

    private Rank qual;
    private Alliance alliance;
    private PlayoffStatus playoff;
    private String alliance_status_str, playoff_status_str, overall_status_str;

    /**
     * @return The team's {@link Rank} during the qualification matches
     */
    public Rank getQual() {
        return qual;
    }

    /**
     * @return The team's alliance selection information
     */
    public Alliance getAlliance() {
        return alliance;
    }

    /**
     * @return Playoff status for this team, may be null if the team did not make playoffs, or playoffs have not begun.
     */
    public PlayoffStatus getPlayoffStatus() {
        return playoff;
    }

    /**
     * @return An HTML formatted string suitable for display to the user containing the team�s alliance pick status.
     */
    public String getAllianceStatusStr() {
        return alliance_status_str;
    }

    /**
     * @return An HTML formatter string suitable for display to the user containing the team�s playoff status.
     */
    public String getPlayoffStatusStr() {
        return playoff_status_str;
    }

    /**
     * @return An HTML formatted string suitable for display to the user containing the team�s overall status summary of the event.
     */
    public String getOverallStatusStr() {
        return overall_status_str;
    }

    /**
     * Holds rank information of a team during an event
     */
    public class Rank {
        private int num_teams;
        private String status;
        private Ranking ranking;


        /**
         * @return Number of teams ranked.
         */
        public int getNumTeams() {
            return num_teams;
        }


        /**
         * @return Either <code>completed</code> or <code>ongoing</code>
         */
        public String getStatus() {
            return status;
        }

        /**
         * @return A {@link Ranking} describing the team's status in the qualification tournament
         */
        public Ranking getRanking() {
            return ranking;
        }

    }

    /**
     * Describes a team's alliance during the playoff tournament
     */
    public class Alliance {
        private String name;
        private int number, pick;
        private AllianceBackup backup;

        /**
         * @return Alliance name, may be null.
         */
        public String getName() {
            return name;
        }

        /**
         * @return Alliance number
         */
        public int getNumber() {
            return number;
        }

        /**
         * @return Order the team was picked in the alliance from 0-2, with 0 being alliance captain.
         */
        public int getPick() {
            return pick;
        }

        /**
         * @return Backup status, may be null
         */
        public AllianceBackup getBackup() {
            return backup;
        }

        /**
         * Describes the backup status of an alliance
         */
        public class AllianceBackup {
            private String out, in;

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

    public class PlayoffStatus {
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

}
