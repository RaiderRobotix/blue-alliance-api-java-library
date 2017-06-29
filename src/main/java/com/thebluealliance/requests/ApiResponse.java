package com.thebluealliance.requests;

public class ApiResponse {

	private final String jsonContent, lastModified;
	
	public String getJsonContent() {
		return jsonContent;
	}

	public String getLastModified() {
		return lastModified;
	}

	public int getResponseCode() {
		return responseCode;
	}

	private final int responseCode;
	
	public ApiResponse(String jsonContent, String lastModified, int responseCode){
		this.jsonContent = jsonContent;
		this.lastModified = lastModified;
		this.responseCode = responseCode;
	}
	
}
