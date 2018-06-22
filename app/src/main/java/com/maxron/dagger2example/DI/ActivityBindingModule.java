package com.maxron.dagger2example.DI;

import android.app.Activity;

import com.maxron.dagger2example.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainActivityComponent.class)
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
        bindMainActivityInjectorFactory(MainActivityComponent.Builder builder);
}
