package com.thebusyteam.lol.ui.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.thebusyteam.lol.ui.JokeListActivity;

/**
 * Created by MT on 06-Jan-18.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return JokeListActivity.PlaceholderFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
