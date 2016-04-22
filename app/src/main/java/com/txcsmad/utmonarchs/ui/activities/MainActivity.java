package com.txcsmad.utmonarchs.ui.activities;

import android.os.Bundle;

import com.txcsmad.utmonarchs.BaseActivity;

/**
 * Created by Jacob on 4/21/16.
 *
 * Camera with access to app options.
 *
 * Opens note taking/submit activity after picture is taken and approved.
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Activity code goes here
    }

    @Override
    public void onPause() {
        // Pause camera/rendering/etc.

        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();

        // Resume camera/rendering/etc.
    }
}
