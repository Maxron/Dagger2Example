package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.A;

import dagger.Module;
import dagger.Provides;

@Module
public class AModule {

    @Provides
    public A provideA() {
        return new A();
    }
}
