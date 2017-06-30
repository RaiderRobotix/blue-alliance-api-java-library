package com.thebluealliance.api.v3.requests;

/** Holds a response from The Blue Alliance API v3
 *
 */
public class APIResponse {

	private final String jsonContent, lastModified;
	
	/**
	 * @return The JSON string returned by the API. May be null if the <code>
	 * responseCode</code> is not 200.
	 */
	public String getJson() {
		return jsonContent;
	}

	/**
	 * @return 	The date and time the data returned was last updated. Used by clients in the `If-Modified-Since` request header.
	 */
	public String getLastModified() {
		return lastModified;
	}

	/**
	 * @return The HTTP response code given by the API. 
	 * Value is 200 if the response is successful, 304 if data was not modified and the <code>If-Modified-Since</code>
	 *  header is used, 401 if no TBA v3 API Key was provided, or it is not valid, or 404 if the URL or parameter(s) provided is invalid
	 */
	public int getResponseCode() {
		return responseCode;
	}

	private final int responseCode;
	
	/** Creates an APIResponse object
	 * @param jsonContent JSON data returned by the API
	 * @param lastModified The <code>Last-Modified</code> response header
	 * @param responseCode The HTTP response code
	 */
	public APIResponse(String jsonContent, String lastModified, int responseCode){
		this.jsonContent = jsonContent;
		this.lastModified = lastModified;
		this.responseCode = responseCode;
	}
	
}
