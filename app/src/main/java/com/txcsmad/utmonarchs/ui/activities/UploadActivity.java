package com.txcsmad.utmonarchs.ui.activities;

import android.os.Bundle;

import com.txcsmad.utmonarchs.BaseActivity;
import com.txcsmad.utmonarchs.R;

/**
 * Created by Jacob on 4/21/16.
 *
 * Create note for upload and submit picture/note/metadata
 */
public class UploadActivity extends BaseActivity {

    // Don't use findViewById - instead...
    // uncomment, change var name, change view id

    // @Bind(R.id.some_user_view) View someUserView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        // Activity code goes here
    }
}
