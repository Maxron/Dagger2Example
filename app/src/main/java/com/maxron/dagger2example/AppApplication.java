package com.maxron.dagger2example;

import android.app.Application;
import android.util.Log;

public class AppApplication extends Application {

    private static final String TAG = AppApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }
}