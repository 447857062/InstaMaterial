package com.deplink;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by ${kelijun} on 2018/6/2.
 */

public class InstaMaterialApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
