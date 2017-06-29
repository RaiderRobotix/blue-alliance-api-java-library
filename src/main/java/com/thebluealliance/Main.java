package com.thebluealliance;

import com.thebluealliance.models.*;
import com.thebluealliance.requests.TBA;

public class Main {
	
	public static void main(String[] args){
    	
    	TBA tba = new TBA("GpVWedeGV5OcpHRNy5cF7OOttSMGmSzVHiGvgOp87TIlvWqsAclCdAcwr2iEkRbw");
    	SimpleEvent[] events = tba.teamRequest.getSimpleEvents(25);
    	System.out.println(events[events.length-1].getKey());
    			
    }
}
