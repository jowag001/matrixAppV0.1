package com.example.ivany4.matrixapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {

    private ArrayList<String> items;
    LayoutInflater inflater;
    Context context;
    Activity activity;


  //  EditText editText;

    public GridViewAdapter(ArrayList<String> items, Context context) {
        this.items = items;
        //this.activity = activity;
        this.context = context;

        //inflater = (LayoutInflater) activity
          //       .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        if(view == null)
        {
            view = inflater.inflate(R.layout.grid_item_matrix, parent, false);
        }
        EditText editText = (EditText) view.findViewById(R.id.editText);
        editText.setText("huj");

        //gridView.setNumColumns(items.size());


        return view;
    }
}
