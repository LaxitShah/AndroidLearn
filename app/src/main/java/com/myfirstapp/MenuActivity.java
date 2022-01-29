package com.myfirstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    TextView tvClickMe;
    Button btnPop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tvClickMe=findViewById(R.id.tv_click);
        registerForContextMenu(tvClickMe);
        btnPop=findViewById(R.id.btn_popup);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.item_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_add:
                Toast.makeText(MenuActivity.this, "Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_update:
                Toast.makeText(MenuActivity.this, "Update", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_setting:
                Toast.makeText(MenuActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onContextItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.item_menu,menu);

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.item_add:
                Toast.makeText(MenuActivity.this, "Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_update:
                Toast.makeText(MenuActivity.this, "Update", Toast.LENGTH_SHORT).show();
                break;
           case R.id.item_setting:
                 Toast.makeText(MenuActivity.this, "Setting", Toast.LENGTH_SHORT).show();
                 break;

        }

        return super.onOptionsItemSelected(item);
    }

    public void popup(View view) {

        PopupMenu popupMenu=new PopupMenu(MenuActivity.this,btnPop);
        MenuInflater menuInflater=getMenuInflater();

        menuInflater.inflate(R.menu.item_menu,popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                    Toast.makeText(MenuActivity.this,"Item Name is "+item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        popupMenu.show();
    }
}