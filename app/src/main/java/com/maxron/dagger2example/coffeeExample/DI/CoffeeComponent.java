package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.CoffeeMaker;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {

    void inject(CoffeeMaker maker);
}
