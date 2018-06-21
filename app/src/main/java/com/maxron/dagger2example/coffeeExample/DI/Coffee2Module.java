package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.ElectricHeater;
import com.maxron.dagger2example.coffeeExample.Heater;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class Coffee2Module {
    @Binds public abstract Heater bindHeater(ElectricHeater heater);
}
