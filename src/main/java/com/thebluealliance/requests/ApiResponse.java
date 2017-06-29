package com.thebluealliance.requests;

public class APIResponse {

	private final String jsonContent, lastModified;
	
	public String getJson() {
		return jsonContent;
	}

	public String getLastModified() {
		return lastModified;
	}

	public int getResponseCode() {
		return responseCode;
	}

	private final int responseCode;
	
	public APIResponse(String jsonContent, String lastModified, int responseCode){
		this.jsonContent = jsonContent;
		this.lastModified = lastModified;
		this.responseCode = responseCode;
	}
	
}
