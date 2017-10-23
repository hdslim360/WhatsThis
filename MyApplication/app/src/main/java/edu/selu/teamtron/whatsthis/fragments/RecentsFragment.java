package edu.selu.teamtron.whatsthis.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;

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
