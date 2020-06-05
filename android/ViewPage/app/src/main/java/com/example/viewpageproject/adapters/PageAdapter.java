package com.example.viewpageproject.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class PageAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragments;

    public PageAdapter(@NonNull FragmentManager fm, List<Fragment> listfrag) {
        super(fm);
        this.fragments = listfrag;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
