package com.example.ivany4.matrixapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.example.ivany4.matrixapp.Adapters.GridViewAdapter;
import com.example.ivany4.matrixapp.Adapters.PagerAdapter;
import com.example.ivany4.matrixapp.Fragments.BaseAbstractFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    PagerAdapter pagerAdapter;
    GridViewAdapter gridViewAdapter;
    private ViewPager viewPager;
    private GridView gridView;
    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*gridViewAdapter = new GridViewAdapter(list, this);
        gridView = findViewById(R.id.gridView);
        gridView.setAdapter(gridViewAdapter);*/

        initFragment();

    }

    private void initFragment() {
        viewPager = findViewById(R.id.pager);
        viewPager.setOffscreenPageLimit(3);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
        CircleIndicator indicator = findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);

    }
}
