package com.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListView extends AppCompatActivity {


    ListView listView;


    String strLang[]={"Android","Java",".net","PHP","C","C++","IOS"};
    int imgLang[]={R.mipmap.ic_launcher_round,R.drawable.java,R.drawable.net,
            R.drawable.php,R.drawable.cpp,R.drawable.c_lang,R.drawable.net};


    ArrayList<DataModel> dataModelArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        listView=findViewById(R.id.list_view);

        dataModelArrayList=new ArrayList<DataModel>();

        for (int i=0;i<strLang.length;i++)
        {
            DataModel dataModel=new DataModel(strLang[i],imgLang[i]);
            dataModelArrayList.add(dataModel);
        }

        DataAdapter dataAdapter=new DataAdapter(this,dataModelArrayList);
        listView.setAdapter(dataAdapter);

    }
}