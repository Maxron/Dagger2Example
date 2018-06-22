package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.Player;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public class GameModule {

    @Provides
    @IntoMap
    @StringKey(value = "1") // Map<String,Player> , also provide @IntKey, @ClassKey, @ActivityKey
    Player providePlayer1() {
        return new Player("1");
    }

    @Provides
    @IntoMap
    @StringKey(value = "2")
    Player providePlayer2() {
        return new Player("2");
    }
}
