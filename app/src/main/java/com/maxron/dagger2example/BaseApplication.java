package com.maxron.dagger2example;

import android.app.Application;

import com.maxron.dagger2example.coffeeExample.DI.BaseComponent;
import com.maxron.dagger2example.coffeeExample.DI.DaggerBaseComponent;
import com.maxron.dagger2example.coffeeExample.annotation.ActivityScope;

import javax.inject.Inject;

import dagger.releasablereferences.ForReleasableReferences;
import dagger.releasablereferences.ReleasableReferenceManager;

public class BaseApplication extends Application {

    private static BaseApplication application;
    private BaseComponent baseComponent;

    @Inject
    @ForReleasableReferences(ActivityScope.class)
    ReleasableReferenceManager activityScopeReference;

    public static BaseApplication getInstance() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        application = this;

        baseComponent = DaggerBaseComponent.create();
        /* Another way to create
        baseComponent = DaggerBaseComponent.builder()
                .baseModule(new BaseModule())
                .build();
        */
    }

    public BaseComponent getBaseComponent() {
        return baseComponent;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        activityScopeReference.releaseStrongReferences();
        /*
            When high memory, can use:
                activityScopeReference.restoreStrongReferences();
        */
    }
}
