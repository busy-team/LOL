package com.thebusyteam.lol.data;

/**
 * Created by MT on 18-Jan-18.
 */

public class Joke {

    //member variables
    private String mContent;
    private int mLikesCount;
    private int mReportsCount;
    private String mUsername;

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public int getLikesCount() {
        return mLikesCount;
    }

    public int getReportsCount() {
        return mReportsCount;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }
}
