package com.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GridviewActivity extends AppCompatActivity {

    GridView gridView;
    String strLang[]={"Android","Java",".net","PHP","C","C++","IOS"};
    int imgLang[]={R.mipmap.ic_launcher_round,R.drawable.java,R.drawable.net,
            R.drawable.php,R.drawable.cpp,R.drawable.c_lang,R.drawable.net};


    ArrayList<LangModel> langModelArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);

        gridView=findViewById(R.id.grid);
        langModelArrayList=new ArrayList<LangModel>();

        for(int i=0;i<strLang.length;i++)
        {
            LangModel langModel=new LangModel(strLang[i],imgLang[i]);
            langModelArrayList.add(langModel);
        }
        GridAdapter gridAdapter=new GridAdapter(this,langModelArrayList);
        gridView.setAdapter(gridAdapter);

    }
}