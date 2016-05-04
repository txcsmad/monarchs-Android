package com.txcsmad.utmonarchs.network.models;

/**
 * Created by Jacob on 5/4/16.
 */
public class UserResponse {
    public String userId;
    public String classId;
    public ErrorResponse error;

    public boolean wasResponseSuccessful() {
        return error == null;
    }
}
