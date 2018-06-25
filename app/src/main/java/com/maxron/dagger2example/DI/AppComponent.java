package com.maxron.dagger2example.DI;

import android.app.Application;

import com.maxron.dagger2example.AppApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Singleton
@Component(
        modules = {
                AppModule.class,
                ActivityBindingModule.class,
                AndroidInjectionModule.class
        })
public interface AppComponent  extends AndroidInjector<AppApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

}
