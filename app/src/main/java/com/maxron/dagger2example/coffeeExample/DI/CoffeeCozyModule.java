package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.CoffeeCozy;

import dagger.BindsOptionalOf;
import dagger.Module;

@Module
public abstract class CoffeeCozyModule {
    @BindsOptionalOf
    abstract CoffeeCozy coffeeCozy();
}
