package com.example.ivany4.matrixapp.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ivany4.matrixapp.R;


public class FirstFragment extends BaseAbstractFragment {
    public static final int layout = R.layout.fragment_first;
    FirstFragment firstFragment;
    public FirstFragment() {
        // Required empty public constructor
    }

    // getInstance constructor for creating fragment with arguments
    public static FirstFragment getInstance() {
        Bundle bundle = new Bundle();
        FirstFragment firstFragment = new FirstFragment();
        firstFragment.setArguments(bundle);
        firstFragment.setTitle("first");
        return firstFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (view == null) {
            view = inflater.inflate(layout, container, false);
        }

        Bundle bundle = getArguments();

        //fehler beim getTitle..
        //String message = bundle.getString(firstFragment.getTitle());
        ((TextView) view.findViewById(R.id.tvResult)).setText("message");
        return view;
    }
}
