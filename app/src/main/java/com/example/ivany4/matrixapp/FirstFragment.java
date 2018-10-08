package com.example.ivany4.matrixapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        Bundle bundle = getArguments();
        String message = Integer.toString(bundle.getInt("count"));
       // ((TextView)view.findViewById(R.id.tvResult)).setText("PageNumber: " + message);

        return view;
    }


}
