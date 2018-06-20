package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.B;

import dagger.Module;
import dagger.Provides;

@Module
public class BModule {

    @Provides
    public B provideB() {
        return new B();
    }
}
