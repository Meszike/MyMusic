package com.example.popey.mymucic.Lists;

/**
 * Created by POPEY on 2018. 03. 06..
 */

public class Music {

    /**
     * Player of the song
     */
    private String mPlayer;

    /**
     * Title of the song
     */
    private String mTitle;

    public Music(String player, String title) {
        mPlayer = player;
        mTitle = title;
    }

    /**
     * Get the player of the song
     */
    public String getplayer() {
        return mPlayer;
    }

    /**
     * Get the title of the song
     */
    public String gettitle() {
        return mTitle;
    }

}


