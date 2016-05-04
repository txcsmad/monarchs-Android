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
    public String userId;
    public String classId;
    public String longitude;
    public String latitude;
    public String notes;
}
