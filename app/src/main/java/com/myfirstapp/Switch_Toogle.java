package com.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Switch_Toogle extends AppCompatActivity {

    Switch aSwitch;
    SwitchCompat switchCompat;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_toogle);

        aSwitch=findViewById(R.id.a_switch);
        switchCompat=findViewById(R.id.switch_compact);
        toggleButton=findViewById(R.id.btn_toggle);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(Switch_Toogle.this,"On",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(Switch_Toogle.this,"Off",Toast.LENGTH_LONG).show();

                }
            }
        });

        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(Switch_Toogle.this,"On",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(Switch_Toogle.this,"Off",Toast.LENGTH_LONG).show();

                }
            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(Switch_Toogle.this,"On",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(Switch_Toogle.this,"Off",Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}