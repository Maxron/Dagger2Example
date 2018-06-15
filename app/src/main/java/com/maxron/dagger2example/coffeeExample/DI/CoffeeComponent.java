package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.CoffeeMaker;

import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {

    void inject(CoffeeMaker maker);
}
