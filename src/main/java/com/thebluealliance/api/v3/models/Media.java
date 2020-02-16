package com.thebluealliance.api.v3.models;

import lombok.Value;

/**
 * A reference for most any media associated with a team or event on TBA.
 */
@Value
public class Media {

	/**
	 * TBA identifier for this media.
	 */
	String key;
	/**
	 * String type of the media element. Value is in
	 * <code>[ youtube, cdphotothread, imgur, facebook-profile, youtube-channel, twitter-profile, github-profile, instagram-profile, periscope-profile, grabcad, pinterest-profile, snapchat-profile,twitch-channel ]</code>
	 */
	String type;
	/**
	 * The key used to identify this media on the media site.
	 */
	String foreign_key;
	/**
	 * <code>true</code> if the media is of high quality.
	 */
	boolean preferred;

}
