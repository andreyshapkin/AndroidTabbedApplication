package com.example.tabbedapplication;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tabbedapplication.FragmentTabConnect;
import com.example.tabbedapplication.FragmentTabMain;
import com.example.tabbedapplication.FragmentTabSensors;
import com.example.tabbedapplication.R;

public class MainActivityTabAdapter extends FragmentPagerAdapter {
    private final String TAG = this.getClass().getName();

    private static final int TABS_NUMBER = 3;

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_text_1,
            R.string.tab_text_2,
            R.string.tab_text_3
    };
    private final Context mContext;

    public MainActivityTabAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        if (position == 0) {
            return FragmentTabMain.newInstance();
        } else if (position == 1) {
            return FragmentTabSensors.newInstance();
        } else if (position == 2) {
            return FragmentTabConnect.newInstance();
        }
        throw new AssertionError("mudak blya");
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return TABS_NUMBER;
    }
}