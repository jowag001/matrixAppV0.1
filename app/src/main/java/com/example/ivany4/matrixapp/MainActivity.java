package com.example.ivany4.matrixapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
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
    private Map<Integer, BaseAbstractFragment> fragments = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragment();

    }

   private void initFragment() {
       viewPager = (ViewPager) findViewById(R.id.pager);
       pagerAdapter = new PagerAdapter(this, getSupportFragmentManager(), this.fragments);
       viewPager.setAdapter(pagerAdapter);
       CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
       indicator.setViewPager(viewPager);

       /*FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
       transaction.replace( R.id.pager, (Fragment) fragments);
       transaction.addToBackStack(null);
       transaction.commit();*/

       /*setContentView(R.layout.fragment_first);

        for (int i = 0; i < 2 ; i++) {
            for (int j = 0; j < 2; j++)
                list.add(i + "-" +  j);

        }

        gridViewAdapter = new GridViewAdapter(list, this);
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(gridViewAdapter);*/

    }
}
