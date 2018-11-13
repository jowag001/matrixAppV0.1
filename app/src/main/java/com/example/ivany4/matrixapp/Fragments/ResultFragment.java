package com.example.ivany4.matrixapp.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ivany4.matrixapp.R;

public class ResultFragment extends BaseAbstractFragment {

    public static final int layout = R.layout.fragment_result;

    public ResultFragment() {
        // Required empty public constructor
    }

    // getInstance constructor for creating fragment with arguments
    public static ResultFragment getInstance() {
        Bundle bundle = new Bundle();
        ResultFragment resultFragment = new ResultFragment();
        resultFragment.setArguments(bundle);
        resultFragment.setTitle("result");
        return resultFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (view == null) {
            view = inflater.inflate(layout, container, false);
        }
        //Bundle bundle = getArguments();
        //String message = Integer.toString(bundle.getInt("count"));
        ((TextView) view.findViewById(R.id.tvResult)).setText("Result");
        return view;
    }


}
