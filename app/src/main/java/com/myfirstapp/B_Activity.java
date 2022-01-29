package com.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class B_Activity extends AppCompatActivity {
    String TAG=B_Activity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bactivity);
        Log.e(TAG,"B OnCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"B OnStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"B OnStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"B OnDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"B OnRestart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"B OnPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"B OnResume");

    }
}