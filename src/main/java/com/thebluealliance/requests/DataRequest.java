package com.thebluealliance.requests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.thebluealliance.Constants;


public class DataRequest {
	
	private String AUTH_KEY;
	
	
	public DataRequest(String authKey){
		AUTH_KEY = authKey;
		
	}
	
    private APIResponse getData(HttpURLConnection con) throws Exception {
        try {
            con.setRequestMethod("GET");
            con.addRequestProperty("User-Agent", "Desktop");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) 
                response.append(inputLine);
            
            in.close();
            
            return new APIResponse(response.toString(), con.getHeaderField("Last-Modified"), con.getResponseCode());
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


    public APIResponse getDataTBA(String urlDirectory) {
        try {
            URL url = new URL(Constants.TBA_BASE_URL+urlDirectory);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.addRequestProperty(Constants.HEADER_AUTH, AUTH_KEY);
            return getData(con);
        }
        catch (Exception e) { e.printStackTrace(); }
        return null;
    }
    
    public APIResponse getDataTBA(String urlDirectory, String lastModified) {
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
