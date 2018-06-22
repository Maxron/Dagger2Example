package com.maxron.dagger2example.DI;

import android.util.Log;

import com.maxron.dagger2example.Computer;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    private static final String TAG = MainActivityModule.class.getSimpleName();

    @Provides
    Computer provideComputer() {
        Log.d(TAG, "provideComputer: ");
        return new Computer();
    }
}
