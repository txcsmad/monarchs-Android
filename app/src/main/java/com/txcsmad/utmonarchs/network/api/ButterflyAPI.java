package com.txcsmad.utmonarchs.network.api;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jacob on 4/23/16.
 *
 * Singleton class to obtain the {@link ButterflyService} REST service class.
 */
public class ButterflyAPI {

    private static final String API_BASE_URL = "https://www.txcsmad.com/fake/url"; // FIXME

    private static ButterflyAPI instance;

    private ButterflyService service;

    private ButterflyAPI() {

        // JSON handling
        Gson gson = getGson();
        GsonConverterFactory butterflyConverter = GsonConverterFactory.create(gson);

        // HTTP client
        OkHttpClient butterflyClient = new OkHttpClient.Builder()
                .addInterceptor(new ButterflyInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(butterflyConverter)
                .client(butterflyClient)
                .build();

        this.service = retrofit.create(ButterflyService.class);
    }

    public static ButterflyAPI getInstance() {
        if(instance == null) {
            instance = new ButterflyAPI();
        }

        return instance;
    }

    public ButterflyService getService() {
        return service;
    }

    /**
     * Define the JSON format that the API will use.
     *
     * @return a Gson object that specifies the monarch application's JSON style.
     */
    private Gson getGson() {
        String dateTimeFormat = ""; // FIXME: check DateFormat docs

        GsonBuilder builder = new GsonBuilder()
                .setDateFormat(dateTimeFormat)
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);

        return builder.create();
    }

    /**
     * Used to intercept all network requests. Useful for authentication headers/logging/etc.
     */
    private static class ButterflyInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();

            // TODO: modify request as necessary

            return chain.proceed(request);
        }
    }
}
