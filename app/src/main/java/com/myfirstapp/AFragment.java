package com.myfirstapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class AFragment extends Fragment {

    ListView wpListView;


    String strLang[]={"Android","Java",".net","PHP","C","C++","IOS"};
    int imgLang[]={R.mipmap.ic_launcher_round,R.drawable.java,R.drawable.net,
            R.drawable.php,R.drawable.cpp,R.drawable.c_lang,R.drawable.net};
    ArrayList<DataModel> dataModelArrayList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView =inflater.inflate(R.layout.fragment_a,container,false);
        wpListView=rootView.findViewById(R.id.l_view);


        dataModelArrayList=new ArrayList<DataModel>();

        for (int i=0;i<strLang.length;i++)
        {
            DataModel dataModel=new DataModel(strLang[i],imgLang[i]);
            dataModelArrayList.add(dataModel);
        }
        DataAdapter dataAdapter=new DataAdapter(getActivity(),dataModelArrayList);
        wpListView.setAdapter(dataAdapter);

        return rootView;
    }
}
