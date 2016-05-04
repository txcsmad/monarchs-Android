package com.txcsmad.utmonarchs.network.models;

/**
 * Created by Jacob on 4/23/16.
 *
 * Java object to specify the response JSON from an upload request.
 */
public class UploadResponse {

    public String success;
    public ErrorResponse error;

    public boolean wasRequestSuccessful() {
        return error == null;
    }

}
