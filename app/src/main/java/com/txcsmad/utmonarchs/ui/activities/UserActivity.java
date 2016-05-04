package com.txcsmad.utmonarchs.ui.activities;

import android.os.Bundle;

import com.txcsmad.utmonarchs.BaseActivity;
import com.txcsmad.utmonarchs.R;

/**
 * Created by Jacob on 4/21/16.
 *
 * Handle user preferences/login/logout/etc.
 */
public class UserActivity extends BaseActivity {

    // Don't use findViewById - instead...
    // uncomment, change var name, change view id

    // @Bind(R.id.some_user_view) View someUserView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        // Activity code goes here
    }
}
