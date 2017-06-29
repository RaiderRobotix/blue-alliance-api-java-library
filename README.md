# The Blue Alliance API Java Library [![Build Status](https://travis-ci.org/spencerng/TBA-API-Java-Library.svg?branch=master)](https://travis-ci.org/spencerng/TBA-API-Java-Library)

Java client library to retrieve data from The Blue Alliance using TBA API v3

The library is essentially complete, but documentation is in progress.

## Usage

Begin by creating a TBA object with your Read TBA API Key. This can be found or generated on your [account dashboard](https://www.thebluealliance.com/account).

    String authKey = // your TBA API read key
    TBA tba = new TBA(authKey);

### Regular Usage

The library allows access to almost all of the calls in [The Blue Alliance API v3 documentation](https://www.thebluealliance.com/apidocs/v3). They are grouped into requests with team, event, district, or match parameters:

**`tba.teamRequest`**

 * `getTeam(teamNumber)`: Gets a `Team` object for the team referenced by the given number (an `int`).
 * `getSimpleTeam(teamNumber): Gets a `SimpleTeam` object for the team referenced by the given number.
 * `getYearsParticipated(teamNumber): Gets a list of years in which the team participated in at least one competition.
 * getDistricts(teamNumber): Gets a list of `District` objects for each year the team was in a district. Will return `null` if the team was never in a district.
 * to be continued

**`tba.eventRequest`**

 * to be continued

**`tba.districtRequest`**
 
 * to be continued

**`tba.matchRequest`**

 * to be continued

### Advance Usage

If you want to utilize the `If-Modified-Since` and `Last-Modified` headers, you will need to make a direct URL request (following the documentation). This will return an `APIResponse` object with JSON data, the HTTP response code, and the `Last-Modified` header. 

The JSON data will need to be deserialized into an object model with a method in the `Deserializer` class before being used.

Here is an (extremely inefficient) example of continuously fetching the `Team` objects for an event (`2017njfla`), if they have been updated.

    TBA tba = new TBA(authKey);
	APIResponse resp = tba.dataRequest.getDataTBA("/event/2017njfla/teams");
	String lastModified = resp.getLastModified();
	Team[] teamList = Deserializer.toTeamArray(resp.getJson());
		while(true){
			resp = tba.dataRequest.getDataTBA("/event/2017njfla/teams", lastModified);
			if(resp.getResponseCode()!=304){
				teamList = Deserializer.jsonToTeamArray(resp.getJson());
				lastModified = resp.getLastModified();
			}
		}

## Models

Most of the object models follow those on The Blue Alliance API documentation, with appropriately named getter methods:

**Award**

 * `String getName()`: The name of the award as provided by FIRST. May vary for the same award type.
 * `int getAwardType()`: Type of award given. See [here](https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/award_type.py#L6) for details.
 * `String getEventKey()`: The `event_key` of the event the award was won at.
 * `AwardRecipient[] getRecipientList()`: A list of recipients of the award at the event. Either team_key and/or awardee for individual awards.
 * `int getYear()`: The year this award was won.

## Contact

Feel free to contact me at sng1488@gmail.com or create a pull request if you have any questions, fixes, or suggestions. This library is (currently) unaffiliated with [FRC Team 25](http://raiderrobotix.org).