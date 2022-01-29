package com.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentDemoWithJava extends AppCompatActivity {

    Button btnA,btnB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_demo_with_java);

        btnA=findViewById(R.id.btn_a);
        btnB=findViewById(R.id.btn_b);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AFragment aFragment=new AFragment();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,aFragment);
                fragmentTransaction.commit();
            }
        });


        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BFragment bFragment=new BFragment();
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,bFragment);
                fragmentTransaction.commit();
            }
        });
    }
}