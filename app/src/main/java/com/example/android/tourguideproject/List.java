package com.example.android.tourguideproject;

public class List {

    /**
     * name of the attraction
     */
    private String mName;

    /**
     * location of the attraction
     */
    private String mLocation;

    /**
     * timing of attraction/place
     */
    private String mTime;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * create a new List object
     *
     * @param name            is the name of the attraction/place visited
     * @param location        is the area it is located in
     * @param time            is the time when it operates
     * @param imageResourceId is the image resource id linked with the attraction/place
     */

    public List(String name, String location, String time, int imageResourceId) {
        mName = name;
        mLocation = location;
        mTime = time;
        mImageResourceId = imageResourceId;
    }

    /**
     * get the name of the attraction
     */
    public String getName() {
        return mName;
    }

    /**
     * get the location of the attraction
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * get the time of the attraction
     */
    public String getTime() {
        return mTime;
    }


    /**
     * Get the Image Resource ID of the attraction
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
