package com.maxron.dagger2example.coffeeExample.DI;

import android.util.Log;

import com.maxron.dagger2example.coffeeExample.GameMode;

import dagger.Module;
import dagger.Provides;

@Module
public class GameModeModule {

    private static final String TAG = GameModeModule.class.getSimpleName();

    @Provides
    GameMode provideGameMode(String mode) {
        Log.d(TAG, "provideGameMode: " + mode);
        return new GameMode(mode);
    }

}
