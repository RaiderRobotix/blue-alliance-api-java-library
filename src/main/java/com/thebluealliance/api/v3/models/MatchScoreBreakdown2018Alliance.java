package com.thebluealliance.api.v3.models;

import lombok.Value;

@Value
class MatchScoreBreakdown2018Alliance {

	int adjustPoints;
	int autoOwnershipPoints;
	int autoPoints;
	int foulCount;
	int foulPoints;
	int rp;
	int techFoulCount;
	int teleopOwnershipPoints;
	int teleopPoints;
	int teleopScaleBoostSec;
	int teleopScaleForceSec;
	int teleopScaleOwnershipSec;
	int teleopSwitchBoostSec;
	int teleopSwitchForceSec;
	int teleopSwitchOwnershipSec;
	int totalPoints;
	int vaultBoostPlayed;
	int vaultBoostTotal;
	int vaultForcePlayed;
	int vaultForceTotal;
	int vaultLevitatePlayed;
	int vaultLevitateTotal;
	int vaultPoints;
	int autoSwitchOwnershipSec;
	int endgamePoints;
	int autoRunPoints;
	int autoScaleOwnershipSec;
	boolean autoQuestRankingPoints;
	boolean autoSwitchAtZero;
	boolean faceTheBossRankingPoint;
	String autoRobot1;
	String autoRobot2;
	String autoRobot3;
	String endgameRobot1;
	String endgameRobot2;
	String endgameRobot3;
	String tba_gameData;
}
