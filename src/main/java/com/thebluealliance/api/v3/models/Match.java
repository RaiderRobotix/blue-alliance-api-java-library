package com.thebluealliance.api.v3.models;

public class Match extends SimpleMatch {

    private long post_result_time;
    private ScoreBreakdown score_breakdown;
    private Media[] videos;

    public long getPostResultTime() {
        return post_result_time;
    }

    public ScoreBreakdown getScoreBreakdown() {
        return score_breakdown;
    }

    public Media[] getVideos() {
        return videos;
    }


}
