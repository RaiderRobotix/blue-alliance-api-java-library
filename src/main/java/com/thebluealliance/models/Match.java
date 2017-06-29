package com.thebluealliance.models;

public class Match extends SimpleMatch {

	private long post_result_time;
	private Object score_breakdown;
	private Media[] videos;
	
	public long getPostResultTime() {
		return post_result_time;
	}
	public Object getScoreBreakdown() {
		return score_breakdown;
	}
	public Media[] getVideos() {
		return videos;
	}
	
	

}
