package com.maxron.dagger2example.DI;

import com.maxron.dagger2example.Car;

import dagger.Module;
import dagger.Provides;

@Module
public class DummyFragmentModule {

    @Provides
    Car provideCar() {
        return new Car();
    }

}
