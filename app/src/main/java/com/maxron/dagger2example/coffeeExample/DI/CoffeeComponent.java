package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.CoffeeMaker;
import com.maxron.dagger2example.coffeeExample.annotation.HeaterScope;

import dagger.Component;

@HeaterScope
@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {

    void inject(CoffeeMaker maker);
}
