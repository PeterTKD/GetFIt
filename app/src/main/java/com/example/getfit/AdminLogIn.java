package com.example.getfit;

import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AdminLogIn extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_log_in);

        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on
        //test commit not sure
        //I hate git

    }
}