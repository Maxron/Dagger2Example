package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.GameMode;

import dagger.Module;
import dagger.Provides;

@Module
public class GameModeModule {

    @Provides
    GameMode provideGameMode() {
        return new GameMode();
    }
}
