package com.thebluealliance.requests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.thebluealliance.Constants;


public class TBA {
	
	private final String AUTH_KEY;
	public final TeamRequest teamRequest;
	
	public TBA(String authKey){
		this.AUTH_KEY = authKey;
		teamRequest = new TeamRequest(this);
	}
	
    private ApiResponse getData(HttpURLConnection con) throws Exception {
        try {
            con.setRequestMethod("GET");
            con.addRequestProperty("User-Agent", "Desktop");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) 
                response.append(inputLine);
            
            in.close();
            
            return new ApiResponse(response.toString(), con.getHeaderField("Last-Modified"), con.getResponseCode());
        }
        catch(IOException ex) { 
        	if(ex.getMessage().contains("401"))
        		throw new Exception("Auth key invalid.");
        	 
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        return null;
    }


    public ApiResponse getDataFromTBA(String urlDirectory) {
        try {
            URL url = new URL(Constants.TBA_BASE_URL+urlDirectory);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.addRequestProperty(Constants.HEADER_AUTH, AUTH_KEY);
            return getData(con);
        }
        catch (Exception e) { e.printStackTrace(); }
        return null;
    }
    
    public ApiResponse getDataFromTBA(String urlDirectory, String lastModified) {
        try {
            URL url = new URL(Constants.TBA_BASE_URL+urlDirectory);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.addRequestProperty(Constants.HEADER_AUTH, AUTH_KEY);
            con.addRequestProperty(Constants.HEADER_MODIFIED, lastModified);
            return getData(con);
        }
        catch (Exception e) { e.printStackTrace(); }
        return null;
    }
    
    
}
