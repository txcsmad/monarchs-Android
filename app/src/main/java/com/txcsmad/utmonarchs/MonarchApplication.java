package com.txcsmad.utmonarchs;

import android.app.Application;

import timber.log.Timber;

import static timber.log.Timber.DebugTree;

/**
 * Created by Jacob on 4/21/16.
 */
public class MonarchApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Base application code

        // only log in debug build
        if(BuildConfig.DEBUG) {
            Timber.plant(new DebugTree());
        }
    }
}
