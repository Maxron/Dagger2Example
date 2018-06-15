package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.ElectricHeater;
import com.maxron.dagger2example.coffeeExample.Heater;
import com.maxron.dagger2example.coffeeExample.Pump;
import com.maxron.dagger2example.coffeeExample.Thermosiphon;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    @Provides
    Heater provideHeater() {
        return new ElectricHeater();
    }

    @Provides
    Pump providePump() {
        return new Thermosiphon();
    }
}
