package com.maxron.dagger2example;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import com.maxron.dagger2example.DI.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class AppApplication extends Application implements HasActivityInjector {

    private static final String TAG = AppApplication.class.getSimpleName();

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
        DaggerAppComponent.builder()
                .application(this)
                .build()
                .inject(this  );
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
