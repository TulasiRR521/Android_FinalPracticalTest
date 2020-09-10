package com.example.tabsnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tb1;
    ViewPager vp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb1=findViewById(R.id.tab1);
        vp1=findViewById(R.id.viewpager1);
        MyAdapter adapter=new MyAdapter(getSupportFragmentManager());
        adapter.add(new CallsFragment(),"About RGUKT");
        adapter.add(new ChatFragment(),"About academics");
        adapter.add(new OnlineFragment(),"News and gallery");
        vp1.setAdapter(adapter);
        tb1.setupWithViewPager(vp1);

    }
}
