package com.gl.navigationapplication.application;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import com.gl.navigationapplication.model.Person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomApplication extends Application {

    public static List<Person> personList;

    @Override
    public void onCreate() {
        super.onCreate();

        personList = new ArrayList<>();
        personList.add(new Person("Pratik", "Mitra", "Kolkata", "B.Tech"));
        personList.add(new Person("Pranay", "Kamble", "Nagpur", "M.Tech"));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        Log.i("onConfiguration:::",personList.toString());
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {

        Log.i("OnLowMemory",personList.toString());
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        personList.clear();
        super.onTerminate();
    }
}
