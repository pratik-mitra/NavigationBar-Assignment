package com.gl.navigationapplication.fragments;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gl.navigationapplication.R;
import com.gl.navigationapplication.application.CustomApplication;
import com.gl.navigationapplication.model.Person;

public class AppInfoFragment extends Fragment {

    private TextView appNameText;

    public AppInfoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_app_info, container, false);

        appNameText = view.findViewById(R.id.id_app_name_text);

        ApplicationInfo applicationInfo = new ApplicationInfo();
        String name = applicationInfo.packageName;

        appNameText.setText("com.gl.navigationapplication");
        return view;
    }

}


