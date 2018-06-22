package com.maxron.dagger2example.DI;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = MainActivityComponent.class)
public class AppModule {

    @Singleton
    @Provides
    Context provideContext(Application application) {
        return application;
    }
}
