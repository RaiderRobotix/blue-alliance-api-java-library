package com.thebluealliance.api.v3.models;

import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value public class Match extends SimpleMatch {

     long post_result_time;
     ScoreBreakdown score_breakdown;
     Media[] videos;

}
