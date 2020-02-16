package com.thebluealliance.api.v3.models;

import lombok.Value;

@Value
public class MatchScoreBreakdown2020Alliance {
	String initLineRobot1;
	String endgameRobot1;
	String initLineRobot2;
	String endgameRobt2;
	String initLineRobot3;
	int autoCellsBottom;
	int autoCellsOuter;
	int autoCellsInner;
	int teleopCellsBottom;
	int teleopCellsOuter;
	int teleopCellsInner;
	boolean stage1Activated;
	boolean stage2Activated;
	boolean stage3Activated;
	String stage3TargetColor;
	String endgameRungIsLevel;
	int autoInitLinePoints;
	int autoCellPoints;
	int teleopCellPoints;
	int controlPanelPoints;
	int endgamePoints;
	int teleopPoints;
	boolean shieldOperationRankingPoint;
	boolean shieldEnergizedRankingPoint;
	boolean tba_shieldEnergizedRankingPointFromFoul;
	int foulCount;
	int techFoulPoints;
	int adjustPoints;
	int foulPoints;
	int rp;
	int totalPoints;

}
