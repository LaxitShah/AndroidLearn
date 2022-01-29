package com.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    ListView listView;

    String strLang[]={"android","java","php",".net","android","java","php",".net","android","java","php",".net",".net","android","java","php",".net","android","java","php",".net",".net"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView=findViewById(R.id.list_view);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, R.layout.raw_list_simple,R.id.tv_data,strLang);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String strData=parent.getItemAtPosition(position).toString();
                Toast.makeText(ListActivity.this, ""+strData, Toast.LENGTH_SHORT).show();
            }
        });
    }
}