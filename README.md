# The Blue Alliance API Java Library [![Build Status](https://travis-ci.org/spencerng/blue-alliance-api-java-library.svg?branch=master)](https://travis-ci.org/spencerng/blue-alliance-api-java-library)

Java client library to retrieve data from The Blue Alliance using TBA API com.thebluealliance.api.v3

Full Javadoc documentation can be found [here](http://spencerng.github.io/blue-alliance-api-java-library/)

## Usage

Begin by creating a TBA object with your Read TBA API Key. This can be found or generated on your [account dashboard](https://www.thebluealliance.com/account).

    String authKey = // your TBA API read key
    TBA tba = new TBA(authKey);

### Regular Usage

The library allows access to almost all of the calls in [The Blue Alliance API com.thebluealliance.api.v3 documentation](https://www.thebluealliance.com/apidocs/com.thebluealliance.api.v3). 

They are grouped into requests with team, event, district, or match parameters, and you will need to use the `teamRequest`, `eventRequest`, or `matchRequest` instance variables found in the [`TBA` class](http://spencerng.github.io/blue-alliance-api-java-library/com/thebluealliance/api/com.thebluealliance.api.v3/TBA.html).

Here is an example of retrieving an array of teams in the FIRST Mid-Atlantic district in 2017:

    Team[] midAtlanticTeams = tba.districtRequest.getTeams("2017mar");

A list of request methods for each request object can be found [here](http://spencerng.github.io/blue-alliance-api-java-library/com/thebluealliance/api/com.thebluealliance.api.v3/requests/package-summary.html).

### Advanced Usage

If you want to utilize the `If-Modified-Since` and `Last-Modified` headers, you will need to make a direct URL request with the [`getDataTBA(String urlDirectory, String ifModifiedSince)` method](http://spencerng.github.io/blue-alliance-api-java-library/com/thebluealliance/api/com.thebluealliance.api.v3/requests/DataRequest.html#getDataTBA-java.lang.String-java.lang.String-) in the [`DataRequest` class](http://spencerng.github.io/blue-alliance-api-java-library/com/thebluealliance/api/com.thebluealliance.api.v3/requests/DataRequest.html). This will return an [`APIResponse`](http://spencerng.github.io/blue-alliance-api-java-library/com/thebluealliance/api/com.thebluealliance.api.v3/requests/APIResponse.html) object with JSON data, the HTTP response code, and the `Last-Modified` header. 

The JSON data will need to be deserialized into an object model with a method in the [`Deserializer` class](http://spencerng.github.io/blue-alliance-api-java-library/com/thebluealliance/api/com.thebluealliance.api.v3/Deserializer.html) before being used.

Here is an example of continuously fetching the `Match` objects for the 2017 Mount Olive District Event, if they have been updated. Note that this is very inefficient.

	APIResponse resp = tba.dataRequest.getDataTBA("/event/2017njfla/matches");
	String lastModified = resp.getLastModified();
	Match[] matchList = Deserializer.toMatchArray(resp.getJson());

	while(true){
		resp = tba.dataRequest.getDataTBA("/event/2017njfla/matches", lastModified);

		if(resp.getResponseCode()!=304){ // HTTP code 304 indicates no change
			teamList = Deserializer.jsonToTeamArray(resp.getJson());
			lastModified = resp.getLastModified();
		}
	}

## Models

A list of object model classes and their getter methods for instance variables can be found [here](http://spencerng.github.io/blue-alliance-api-java-library/com/thebluealliance/api/com.thebluealliance.api.v3/models/package-summary.html)

## Dependencies

You will need [Gson](https://github.com/google/gson) to use the released compiled TBA API JAR file in your project. Gson can be installed with [Maven](https://maven-badges.herokuapp.com/maven-central/com.google.code.gson/gson), via a [JAR file](http://repo1.maven.org/maven2/com/google/code/gson/gson/2.8.1/), or with Gradle if you include the following in your `build.gradle`

    dependencies {
    	compile 'com.google.code.gson:gson:2.2.4'
    }

Note that you will need Gradle to compile this repository's source code if you do not get Gson.

## Examples


## Contact

Feel free to contact me at sng1488@gmail.com or create a pull request if you have any questions, fixes, or suggestions. 
