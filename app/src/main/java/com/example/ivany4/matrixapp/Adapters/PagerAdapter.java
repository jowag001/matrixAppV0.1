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
import java.util.Map;

public class PagerAdapter extends FragmentPagerAdapter {
    private Context context;
    private Map<Integer, BaseAbstractFragment> pages;

    public PagerAdapter(Context context, FragmentManager fm, Map<Integer, BaseAbstractFragment> pages) {
        super(fm);
        this.context = context;
        this.pages = pages;
        initFragments(context);
    }

   /* public PagerAdapter(FragmentManager fm, ArrayList<FirstFragment> pages) {
        super(fm);
        this.pages = pages;
    }
*/
    @Override
    public Fragment getItem(int position) {
        /*Fragment fragment = new FirstFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("count", position+1);
        fragment.setArguments(bundle);
        return fragment;*/
       return pages.get(position);
    }

    @Override
    public int getCount() {
        return pages.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return (CharSequence) pages.get(position).getTitle();
    }
    //Das nötige Fragment initialisieren
    private void initFragments(Context context){
        pages = new HashMap<>();
        pages.put(0, FirstFragment.getInstance(context));
        pages.put(1, SecondFragment.getInstance(context));
        pages.put(2, ResultFragment.getInstance(context));

    }
}


