package com.maxron.dagger2example;

import android.app.Application;

import com.maxron.dagger2example.coffeeExample.DI.BaseComponent;
import com.maxron.dagger2example.coffeeExample.DI.DaggerBaseComponent;

public class BaseApplication extends Application {

    private static BaseApplication application;
    private BaseComponent baseComponent;

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
}
