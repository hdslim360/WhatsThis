package edu.selu.teamtron.whatsthis2.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

import edu.selu.teamtron.whatsthis2.R;

public class RecentsFragment extends BaseFragment{

    public static RecentsFragment create() {
        return new RecentsFragment();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_recents;
    }

    @Override
    public void inOnCreateView(View root, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    }
}
