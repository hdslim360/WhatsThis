package edu.selu.teamtron.whatsthis.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

public class SettingsFragment extends BaseFragment {

    public static SettingsFragment create() {
        return new SettingsFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_settings;
    }

    @Override
    public void inOnCreateView(View root, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    }
}
