package com.example.ivany4.matrixapp.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ivany4.matrixapp.Fragments.BaseAbstractFragment;
import com.example.ivany4.matrixapp.Fragments.FirstFragment;
import com.example.ivany4.matrixapp.Fragments.ResultFragment;
import com.example.ivany4.matrixapp.Fragments.SecondFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PagerAdapter extends FragmentPagerAdapter {
    private Map<Integer, BaseAbstractFragment> pages;
    private List<BaseAbstractFragment> pagesList;

    public PagerAdapter(FragmentManager fm/*, Map<Integer, BaseAbstractFragment> pages*/) {
        super(fm);
        //this.pages = pages;
        initFragments();
    }

    @Override
    public Fragment getItem(int position) {
        return pagesList.get(position);
    }

    @Override
    public int getCount() {
        return pagesList.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return pagesList.get(position).getTitle();
    }

    //Das nötige Fragment initialisieren
    private void initFragments() {
        /*pages = new HashMap<>();
        pages.put(0, FirstFragment.getInstance());
        pages.put(1, SecondFragment.getInstance());
        pages.put(2, ResultFragment.getInstance());*/

        pagesList = new ArrayList<>();
        pagesList.add(0, FirstFragment.getInstance());
        pagesList.add(1, SecondFragment.getInstance());
        pagesList.add(2, ResultFragment.getInstance());

    }
}


