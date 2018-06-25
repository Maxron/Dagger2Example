package com.maxron.dagger2example;

import com.maxron.dagger2example.DI.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class AppApplication extends DaggerApplication {
    /*
        Also provide other Super class for extend :
            DaggerService, DaggerIntentService, DaggerBroadcastReceiver, DaggerContentProvider
     */

    private static final String TAG = AppApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
