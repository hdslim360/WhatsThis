package edu.selu.teamtron.whatsthis2;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import edu.selu.teamtron.whatsthis2.adapter.MainPagerAdapter;
import edu.selu.teamtron.whatsthis2.fragments.Camera2BasicFragment;

public class MainActivity extends AppCompatActivity {

    private Camera2BasicFragment mCameraFragment;
    private View mBackground;
    private ImageView mCameraButton;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        if(null == savedInstanceState) {
            mCameraFragment = Camera2BasicFragment.newInstance();
            getFragmentManager().beginTransaction()
                    .replace(R.id.am_background_layout, mCameraFragment)
                    .commit();
        }

        SnapTabsView tabsView = (SnapTabsView) findViewById(R.id.am_snap_tabs);
        mCameraButton = tabsView.getCenterView();

        mBackground = findViewById(R.id.am_background_view);
        mCameraButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mViewPager.getCurrentItem() != 1) {
                    mViewPager.setCurrentItem(1, true);
                } else if (mCameraFragment != null)
                    mCameraFragment.takePicture();
            }

        });
        */

        final View background = findViewById(R.id.am_background_view);
        ViewPager viewPager = (ViewPager) findViewById(R.id.am_view_pager);
        MainPagerAdapter adapter = new MainPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        final int colorBlue = ContextCompat.getColor(this, R.color.light_blue);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if(position == 0) {
                    background.setBackgroundColor(colorBlue);
                    background.setAlpha(1 - positionOffset);
                }
                else if(position == 1) {
                    background.setBackgroundColor(colorBlue);
                    background.setAlpha(positionOffset);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }

        });
    }

}

