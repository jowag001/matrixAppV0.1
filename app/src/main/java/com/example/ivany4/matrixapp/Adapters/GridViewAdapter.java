package com.example.ivany4.matrixapp.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.ivany4.matrixapp.R;
import com.example.ivany4.matrixapp.TrickyEditText;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {

    private ArrayList<String> items;
    LayoutInflater inflater;

    public GridViewAdapter(ArrayList<String> items, Activity activity) {
        this.items = items;
        inflater = (LayoutInflater) activity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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


        view = inflater.inflate(R.layout.grid_item_matrix, parent, false);

        TrickyEditText editText = (TrickyEditText) view.findViewById(R.id.editText);
        editText.setText(items.get(position));
        return view;

    }
}
