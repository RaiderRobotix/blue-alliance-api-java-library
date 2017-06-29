package com.thebluealliance.models;

import java.util.HashMap;

public class OPRs {
	
	private HashMap<String, Double> oprs, dprs, ccwms;
	
	public double getOPR(int teamNumber){
		return oprs.get("frc" + teamNumber);
	}
	
	public double getDPR(int teamNumber){
		return dprs.get("frc" + teamNumber);
	}
	
	public double CCWM(int teamNumber){
		return ccwms.get("frc" + teamNumber);
	}

}
