package com.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class A_Activity extends AppCompatActivity {

    Button btnNext;
    String TAG=A_Activity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aactivity);

        btnNext=findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(A_Activity.this,B_Activity.class);
                startActivity(i);
            }
        });
        Log.e(TAG,"A OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"A OnStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"A OnStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"A OnDestroy");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"A OnRestart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"A OnPause");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"A OnResume");

    }
}