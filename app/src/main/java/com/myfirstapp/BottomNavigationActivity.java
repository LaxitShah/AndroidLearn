package com.myfirstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        toolbar=findViewById(R.id.toolbar);
        bottomNavigationView=findViewById(R.id.bottom_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationActivity.this);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int id=item.getItemId();

            if(id==R.id.home)
            {
                Toast.makeText(BottomNavigationActivity.this, "Home", Toast.LENGTH_SHORT).show();
            }
            else if(id==R.id.profile)
            {
                Toast.makeText(BottomNavigationActivity.this, "Profile", Toast.LENGTH_SHORT).show();
            }
            else if(id==R.id.setting)
            {
                Toast.makeText(BottomNavigationActivity.this, "Setting", Toast.LENGTH_SHORT).show();
            }
            else if(id==R.id.logout)
            {
                Toast.makeText(BottomNavigationActivity.this, "LogOut", Toast.LENGTH_SHORT).show();
            }

        return true;
    }
}