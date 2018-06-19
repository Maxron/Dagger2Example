package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.ElectricHeater;
import com.maxron.dagger2example.coffeeExample.Heater;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BaseModule {

    @Singleton
    @Provides
    public Heater provideHeater() {
        return new ElectricHeater();
    }
}
