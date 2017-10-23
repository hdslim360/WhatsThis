package edu.selu.teamtron.whatsthis2.view;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import edu.selu.teamtron.whatsthis2.R;

public class SnapTabsView extends FrameLayout implements ViewPager.OnPageChangeListener {

    private ImageView mCameraButton;
    private ImageView mSettingsButton;
    private ImageView mRecentsButton;
    private ImageView mCloseButton;
    private View mIndicator;

    public SnapTabsView(@NonNull Context context) {
        this(context, null);
    }

    public SnapTabsView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SnapTabsView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_snap_tabs, this, false);

        mCameraButton = findViewById(R.id.vst_camera_button);
        mSettingsButton = findViewById(R.id.vst_settings_button);
        mRecentsButton = findViewById(R.id.vst_recents_button);
        mCloseButton = findViewById(R.id.vst_close_button);
        mIndicator = findViewById(R.id.vst_indicator);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}