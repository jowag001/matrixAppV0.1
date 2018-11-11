package com.example.ivany4.matrixapp.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ivany4.matrixapp.R;

public class SecondFragment extends BaseAbstractFragment {

    public static final int layout = R.layout.fragment_second;

    public SecondFragment() {
        // Required empty public constructor
    }

    // getInstance constructor for creating fragment with arguments
    public static SecondFragment getInstance() {
        Bundle bundle = new Bundle();
        SecondFragment secondFragment = new SecondFragment();
        secondFragment.setArguments(bundle);
        secondFragment.setTitle("second");
        return secondFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (view == null) {
            view = inflater.inflate(layout, container, false);
        }
        Bundle bundle = getArguments();
        String message = Integer.toString(bundle.getInt("count"));
        ((TextView) view.findViewById(R.id.tvResult)).setText(message);
        return view;
    }
}
