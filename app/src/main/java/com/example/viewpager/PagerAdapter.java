package com.example.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    int count;
    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.count=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                RecentFragment logInFragment=new RecentFragment();
                return logInFragment;
            case 2:
                AboutFragment aboutFragment=new AboutFragment();
                return aboutFragment;
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return count;
    }
}
