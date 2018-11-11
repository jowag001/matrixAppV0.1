package com.example.ivany4.matrixapp.Fragments;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

public abstract class BaseAbstractFragment extends Fragment {

    private String title;
    protected Context context;
    protected View view;


    @Nullable
    @Override
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }


}
