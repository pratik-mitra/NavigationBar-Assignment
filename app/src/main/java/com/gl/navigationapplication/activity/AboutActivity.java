package com.gl.navigationapplication.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gl.navigationapplication.R;
import com.gl.navigationapplication.adapter.CustomViewPagerAdapter;
import com.gl.navigationapplication.fragments.AppInfoFragment;
import com.gl.navigationapplication.fragments.DeviceInfoFragment;
import com.gl.navigationapplication.fragments.VersionInfoFragment;

import java.util.ArrayList;
import java.util.List;

public class AboutActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private CustomViewPagerAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        viewPager = (ViewPager) findViewById(R.id.id_view_pager);
        adapter = new CustomViewPagerAdapter(getSupportFragmentManager(),getAllFragment());
        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.id_tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private List<Fragment> getAllFragment(){

        List<Fragment> fragments = new ArrayList<>();

        fragments.add(new AppInfoFragment());
        fragments.add(new DeviceInfoFragment());
        fragments.add(new VersionInfoFragment());

        return fragments;
    }
}
