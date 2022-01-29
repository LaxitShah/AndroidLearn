package com.myfirstapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

    Context context;
    ArrayList<LangModel> langModelArrayList;
    public GridAdapter(Context context, ArrayList<LangModel> langModelArrayList) {
        this.context=context;
        this.langModelArrayList=langModelArrayList;
    }

    @Override
    public int getCount() {
        return langModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return langModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=layoutInflater.inflate(R.layout.raw_grid,null);
        ImageView imgData=convertView.findViewById(R.id.img_data);
        TextView tvData=convertView.findViewById(R.id.tv_data);

        imgData.setImageResource(langModelArrayList.get(position).getImgLang());
        tvData.setText(langModelArrayList.get(position).getStrLang());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str=langModelArrayList.get(position).getStrLang();
                int img=langModelArrayList.get(position).getImgLang();

              /*  Bitmap bmp = BitmapFactory.decodeResource(context.getResources(), R.drawable.cpp);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 0, stream);
                byte[] byteArray = stream.toByteArray();
*/
                Intent intent=new Intent(context,GridviewActivity2.class);
                intent.putExtra("key_data",str);
                intent.putExtra("picture",img);
                context.startActivity(intent);

            }
        });

        return convertView;
    }
}
