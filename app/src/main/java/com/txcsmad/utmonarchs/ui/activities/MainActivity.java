package com.txcsmad.utmonarchs.ui.activities;

import android.os.Bundle;

import com.txcsmad.utmonarchs.BaseActivity;
import com.txcsmad.utmonarchs.R;

/**
 * Created by Jacob on 4/21/16.
 *
 * Camera with access to app options.
 *
 * Opens note taking/submit activity after picture is taken and approved.
 */
public class MainActivity extends BaseActivity {

    // Don't use findViewById - instead...
    // uncomment, change var name, change view id

    // @Bind(R.id.some_user_view) View someUserView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
