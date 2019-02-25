package com.thebluealliance.api.v3.models;

/**
 * Represents an alliance of teams during the elimination tournament
 */
public class EliminationAlliance {
    private String name;
    private AllianceBackup backup;
    private String[] declines, picks;
    private PlayoffStatus status;

    /**
     * @return Alliance name, may be null.
     */
    public String getName() {
        return name;
    }

    /**
     * @return Backup team called in, may be null.
     */
    public AllianceBackup getBackup() {
        return backup;
    }

    /**
     * @return List of team keys that declined the alliance.
     */
    public String[] getDeclines() {
        return declines;
    }

    /**
     * @return List of team keys picked for the alliance. First pick is captain.
     */
    public String[] getPicks() {
        return picks;
    }

    /**
     * @return A {@link PlayoffStatus} object with current statistics of the alliance.
     */
    public PlayoffStatus getStatus() {
        return status;
    }

    /**
     * Represents a backup team called in by an {@link EliminationAlliance}
     */
    public class AllianceBackup {
        private String out, in;

        /**
         * @return Team key that was replaced by the backup team.
         */
        public String getOut() {
            return out;
        }

        /**
         * @return Team key that was called in as the backup.
         */
        public String getIn() {
            return in;
        }

    }

    /**
     * Represents the statistics and status of a {@link EliminationAlliance}
     */
    public class PlayoffStatus {
        private String level, status;
        private WLTRecord current_level_record, record;
        private double playoff_average;

        /**
         * @return The level of the bracket that an alliance is currently in or was eliminated in.
         * Value may be <code>qf</code>, <code>sf</code>, or <code>f</code>
         */
        public String getLevel() {
            return level;
        }

        /**
         * @return The current playing status of an alliance.
         * Value may be <code>eliminated</code>, <code>won</code>, or <code>playing</code>.
         */
        public String getStatus() {
            return status;
        }

        /**
         * @return The average of all playoff matches of an alliance. May be <code>null</code>.
         */
        public double getPlayoffAverage() {
            return playoff_average;
        }

        /**
         * @return A {@link WLTRecord} for the alliance at the current level of the playoff tournament
         */
        public WLTRecord getCurrentLevelRecord() {
            return current_level_record;
        }

        /**
         * @return A {@link WLTRecord} for the alliance during the entire playoff tournament
         */
        public WLTRecord getRecord() {
            return record;
        }
    }
}
