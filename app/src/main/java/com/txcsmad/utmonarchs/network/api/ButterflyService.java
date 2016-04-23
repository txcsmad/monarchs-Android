package com.txcsmad.utmonarchs.network.api;

import com.txcsmad.utmonarchs.network.models.Butterfly;
import com.txcsmad.utmonarchs.network.models.UploadResponse;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Jacob on 4/23/16.
 *
 * Interface used by retrofit to simplify http requests and JSON serialization/deserialization.
 */
public interface ButterflyService {

    // TODO: May experience issues with image parameter, test and confirm when able.

    @Multipart
    @POST("upload/endpoint/goes/here")
    Call<UploadResponse> uploadButterfly(@Part("body") Butterfly butterfly, @Part("image") RequestBody image);
}
