package com.thebluealliance.api.v3.models;

/**
 * Contains a reference for most any media associated with a team or event on TBA.
 */
public class Media {

    private String key, type, foreign_key;
    private boolean preferred;

    /**
     * @return TBA identifier for this media.
     */
    public String getKey() {
        return key;
    }

    /**
     * @return String type of the media element.
     * Value is in <code>[ youtube, cdphotothread, imgur, facebook-profile, youtube-channel, twitter-profile, github-profile, instagram-profile, periscope-profile, grabcad, pinterest-profile, snapchat-profile, twitch-channel ]</code>
     */
    public String getType() {
        return type;
    }

    /**
     * @return The key used to identify this media on the media site.
     */
    public String getForeignKey() {
        return foreign_key;
    }

    /**
     * @return <code>true</code> if the media is of high quality.
     */
    public boolean isPreferred() {
        return preferred;
    }

}