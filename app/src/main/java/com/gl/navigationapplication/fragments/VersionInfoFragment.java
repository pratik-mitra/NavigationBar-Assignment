package com.gl.navigationapplication.fragments;

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

public class VersionInfoFragment extends Fragment {

    private TextView appVerText;

    public VersionInfoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_version_info, container, false);

        appVerText = view.findViewById(R.id.id_app_ver_text);

        appVerText.setText("Version Code: " + Build.VERSION.RELEASE);
        return view;
    }
}
