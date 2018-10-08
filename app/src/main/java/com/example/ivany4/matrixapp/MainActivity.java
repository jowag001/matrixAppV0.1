package com.example.ivany4.matrixapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    PagerAdapter collectionPagerAdapter;
    GridViewAdapter adapter;
    private ViewPager viewPager;
    private GridView gridView;
    private ArrayList<String> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        collectionPagerAdapter = new PagerAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(collectionPagerAdapter);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);

        setContentView(R.layout.fragment_first);
        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 2; j++)
                list.add(i + "-" + j);

        }

        GridViewAdapter adapter = new GridViewAdapter(list, this);
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(adapter);



    }
}
