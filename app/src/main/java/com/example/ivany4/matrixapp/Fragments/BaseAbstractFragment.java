package com.example.ivany4.matrixapp.Fragments;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

public abstract class BaseAbstractFragment extends Fragment {

    private String title;
    protected Context context;
    protected  View view;


    public String getTitle() {
        return title;
    }

    @Nullable
    @Override
    public Context getContext() {
        return context;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setContext(Context context) {
        this.context = context;
    }


}
