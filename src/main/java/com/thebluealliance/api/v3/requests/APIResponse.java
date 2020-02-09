package com.thebluealliance.api.v3.requests;

import lombok.Value;

/**
 * A response from The Blue Alliance API com.thebluealliance.api.v3
 */
@Value
public class APIResponse {

	/**
	 * @return The JSON string returned by the API. May be null if the <code>
	 * responseCode</code> is not 200.
	 */
	String json;
	/**
	 * @return The date and time the data returned was last updated. Used by clients in the `If-Modified-Since` request header.
	 */
	String lastModified;
	/**
	 * @return The HTTP response code given by the API. Value is 200 if the response is successful, 304 if data was not modified and the <code>If-Modified-Since</code> header is used, 401 if no TBA
	 *         com.thebluealliance.api.v3 API Key was provided, or it is not valid, or 404 if the URL or parameter(s) provided is invalid
	 */
	int responseCode;
}
