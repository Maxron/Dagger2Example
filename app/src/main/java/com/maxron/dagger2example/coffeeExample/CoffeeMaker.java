package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

import com.maxron.dagger2example.coffeeExample.DI.CoffeeComponent;
import com.maxron.dagger2example.coffeeExample.DI.DaggerCoffeeComponent;

import javax.inject.Inject;
import javax.inject.Named;

public class CoffeeMaker {
    private static final String TAG = CoffeeMaker.class.getSimpleName();

    @Inject Heater heater;
    @Inject Pump pump;
    @Inject IceBox iceBox;
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
        heater.on();
        pump.pump();
        Log.d(TAG, " [_]P coffee! [_]P ");
        iceBox.addIce();
        milk.addMilk();
        heater.off();
    }
}
