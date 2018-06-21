package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

import com.maxron.dagger2example.coffeeExample.DI.CoffeeComponent;
import com.maxron.dagger2example.coffeeExample.DI.DaggerCoffeeComponent;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;

public class CoffeeMaker {
    private static final String TAG = CoffeeMaker.class.getSimpleName();

    @Inject Heater heater;
    @Inject Lazy<Pump> pump;
    @Inject Provider<IceBox> iceBox;
    @Inject @Named("shuiguo") Milk milk;

    public CoffeeMaker() {
        // Should build before use DaggerCoffeeComponent
        // DaggerCoffeeComponent: Auto create after build by Dagger2 library
        CoffeeComponent component = DaggerCoffeeComponent.create();
        component.inject(this);

        /* Or use the follow code:
        DaggerCoffeeComponent.builder()
                .coffeeModule(new CoffeeModule())
                .build()
                .inject(this);
        */

    }

    public void brew() {
        Log.d(TAG, " [_]P coffee! [_]P ");
        /*
            Result:
                provideHeater:
                provideString:
                provideShuiGuoMilk:
                [_]P coffee! [_]P
         */
    }
}
