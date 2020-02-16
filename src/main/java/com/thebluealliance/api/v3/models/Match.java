package com.thebluealliance.api.v3.models;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class Match extends SimpleMatch {

	long post_result_time;
	ScoreBreakdown score_breakdown;
	Media[] videos;

	public Match(long post_result_time, ScoreBreakdown score_breakdown, Media[] videos) throws IllegalAccessException {
		super(0, 0, null, null, null, null, 0, 0, 0, null);
		throw new IllegalAccessException("bitch why ru calling this");
	}

}
