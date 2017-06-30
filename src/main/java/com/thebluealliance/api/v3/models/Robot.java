package com.thebluealliance.api.v3.models;

/** Represents a particular robot in FIRST Robotics Competition
 *
 */
public class Robot {
	
	private String key, robot_name, team_key;
	private int year;
	
	/**
	 * @return Internal TBA identifier for this robot.
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * @return Name of the robot as provided by the team.
	 */
	public String getRobotName() {
		return robot_name;
	}
	
	/**
	 * @return TBA team key for this robot.
	 */
	public String getTeamKey() {
		return team_key;
	}
	
	/**
	 * @return Year this robot competed in.
	 */
	public int getYear() {
		return year;
	}
	

}
