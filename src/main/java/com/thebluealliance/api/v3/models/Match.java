package com.thebluealliance.api.v3.models;

/** Represents a match played during an event
 *
 */
public class Match extends SimpleMatch {

	private long post_result_time;
	private Object score_breakdown;
	private Media[] videos;
	
	/**
	 * @return UNIX timestamp (seconds since 1-Jan-1970 00:00:00) when the match result was posted.
	 */
	public long getPostResultTime() {
		return post_result_time;
	}
	
	/**
	 * @return Score breakdown for auto, teleop, etc. points. Varies from year to year. May be null.
	 */
	public Object getScoreBreakdown() {
		return score_breakdown;
	}
	
	/**
	 * @return Array of {@link Media} objects associated with this match.
	 */
	public Media[] getVideos() {
		return videos;
	}
	
	

}
