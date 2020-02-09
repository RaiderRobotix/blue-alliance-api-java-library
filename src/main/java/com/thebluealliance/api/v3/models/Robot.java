package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * Represents a particular robot in FIRST Robotics Competition
 */
@Value
public class Robot {

	/**
	 * @return Internal TBA identifier for this robot.
	 */
	String key;
	/**
	 * @return Name of the robot as provided by the team.
	 */
	String robot_name;
	/**
	 * @return TBA team key for this robot.
	 */
	String team_key;
	/**
	 * @return Year this robot competed in.
	 */
	int year;

}
