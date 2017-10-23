package edu.selu.teamtron.whatsthis2.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import edu.selu.teamtron.whatsthis2.fragments.EmptyFragment;
import edu.selu.teamtron.whatsthis2.fragments.RecentsFragment;
import edu.selu.teamtron.whatsthis2.fragments.SettingsFragment;

public class MainPagerAdapter extends FragmentPagerAdapter {

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return SettingsFragment.create();
            case 1:
                return EmptyFragment.create();
            case 2:
                return RecentsFragment.create();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
