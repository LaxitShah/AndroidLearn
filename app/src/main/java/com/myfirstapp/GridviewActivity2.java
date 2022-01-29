package com.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class GridviewActivity2 extends AppCompatActivity {


    private TextView t_name;
    private ImageView t_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview2);

        t_name=findViewById(R.id.text_name);
        ImageView image = (ImageView) findViewById(R.id.img_name);

        Intent extras = getIntent();

        String name_data=extras.getStringExtra("key_data");

        t_name.setText(name_data);
        int bmp = extras.getIntExtra("picture",0);

      /*  byte[] byteArray = extras.getByteArrayExtra("picture");
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
*/
        image.setImageResource(bmp);


    }
}