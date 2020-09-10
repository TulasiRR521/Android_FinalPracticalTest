package com.example.tabsnavigation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MyAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment> fragments=new ArrayList<>();
    ArrayList<String> strings=new ArrayList<>();
    public MyAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new CallsFragment();
            case 1:
                return new ChatFragment();
            case 2:
                return new OnlineFragment();
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
    public void add (Fragment frg,String str)
    {
        fragments.add(frg);
        strings.add(str);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return strings.get(position);
    }
}
