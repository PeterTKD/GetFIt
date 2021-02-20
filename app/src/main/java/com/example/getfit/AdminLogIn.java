package com.example.getfit;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;

public class AdminLogIn extends WearableActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_log_in);

        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on
        //test commit not sure
        //I hate git
        setAmbientEnabled();
    }
}