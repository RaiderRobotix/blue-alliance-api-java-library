package com.thebluealliance.api.v3.requests;

import com.thebluealliance.api.v3.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Used to issue a direct request for data to The Blue Alliance via a URL
 */
public class DataRequest {

    private String AUTH_KEY;

    /**
     * Constructs an object to make a data request
     *
     * @param authKey TBA API com.thebluealliance.api.v3 authentication key
     */
    public DataRequest(String authKey) {
        AUTH_KEY = authKey;

    }

    /**
     * Retrieves data from TBA API using a URL, without a <code>If-Modified-Since</code> header
     *
     * @param urlDirectory URL subdirectory for the query (e.g. <code>/team/frc25</code>)
     * @return An {@link APIResponse} object with the API's response
     */
    public APIResponse getDataTBA(String urlDirectory) throws IOException {

        URL url;
        url = new URL(Constants.TBA_BASE_URL + urlDirectory);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.addRequestProperty(Constants.HEADER_AUTH, AUTH_KEY);
        return getData(con);

    }

    private APIResponse getData(HttpURLConnection con) {
        try {
            con.setRequestMethod("GET");
            con.addRequestProperty("User-Agent", "Desktop");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();

            return new APIResponse(response.toString(), con.getHeaderField("Last-Modified"), con.getResponseCode());
        } catch (IOException ex) {
            if (ex.getMessage().contains("401")) {
                return new APIResponse(null, null, 401);
            }
            if (ex.getMessage().contains("304")) {
                return new APIResponse(null, null, 304);
            }
            if (ex.getMessage().contains("404")) {
                return new APIResponse(null, null, 404);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Retrieves data from TBA API using a URL and a <code>If-Modified-Since</code> header
     *
     * @param urlDirectory    URL subdirectory for the query (e.g. <code>/team/frc25</code>)
     * @param ifModifiedSince Value of the <code>Last-Modified</code> header in the most recently cached response by
     *                        the client.
     * @return An {@link APIResponse} object with the API's response
     */
    public APIResponse getDataTBA(String urlDirectory, String ifModifiedSince) throws IOException {
        URL url = new URL(Constants.TBA_BASE_URL + urlDirectory);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.addRequestProperty(Constants.HEADER_AUTH, AUTH_KEY);
        con.addRequestProperty(Constants.HEADER_MODIFIED, ifModifiedSince);
        return getData(con);


    }


}
