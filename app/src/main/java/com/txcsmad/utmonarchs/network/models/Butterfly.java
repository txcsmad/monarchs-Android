package com.txcsmad.utmonarchs.network.models;

/**
 * Created by Jacob on 4/23/16.
 *
 * Java object to represent the json structure expected by the upload endpoint.
 */
public class Butterfly {

    /**
     * Base-64 encoded image (JPEG).
     */
    public String image;

    /**
     * Identification for user that uploaded the butterfly.
     */
    public String userId;
    public String classId;

    /**
     * Longitude of the butterfly.
     */
    public String longitude;

    /**
     * Latitude of the butterfly.
     */
    public String latitude;

    /**
     * User's notes on the butterfly.
     */
    public String notes;
}
