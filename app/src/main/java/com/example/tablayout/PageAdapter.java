package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public PageAdapter(@NonNull FragmentManager fragmentManager, int behavior) {
        super(fragmentManager, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new BlankFragment();
            case 1: return new BlankFragment2();
            case 2: return new BlankFragment3();
            case 3: return new BlankFragment4();
        }
        return null;
    }

    @Override
    public int getCount() {
        // Return the total number of tabs
        return tabCount;
    }
}
