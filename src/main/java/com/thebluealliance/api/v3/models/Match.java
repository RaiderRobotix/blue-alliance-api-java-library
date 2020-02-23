package com.thebluealliance.api.v3.models;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class Match extends SimpleMatch {

	long post_result_time;
	ScoreBreakdown score_breakdown;
	Media[] videos;

	public Match() {
		super(0, 0, null, null, null, null, 0, 0, 0, null);
		post_result_time = 0;
		score_breakdown = null;
		videos = null;
	}

}
