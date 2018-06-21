package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.Player;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class GameModule {

    @Provides
    @IntoSet
    Player providePlayer1() {
        return new Player("1");
    }

    @Provides
    @IntoSet
    Player providePlayer2() {
        return new Player("2");
    }
}
