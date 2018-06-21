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
        Log.d(TAG, "brew: ");
        heater.on();
        Log.d(TAG, " heater on");
        heater.on();
        Log.d(TAG, " heater on");
        pump.get().pump();
        Log.d(TAG, " pump pump");
        pump.get().pump();
        Log.d(TAG, " pump pump");
        Log.d(TAG, " [_]P coffee! [_]P ");
        iceBox.get().addIce();
        Log.d(TAG, " iceBox addIce");
        iceBox.get().addIce();
        Log.d(TAG, " iceBox addIce");
        milk.addMilk();
        heater.off();
        /*
            Result:
                D/CoffeeModule: provideHeater:  // Provide once
                D/CoffeeModule: provideString:
                                provideShuiGuoMilk:
                D/CoffeeMaker: brew:
                D/ElectricHeater: ~ ~ ~ heating ~ ~ ~
                D/CoffeeMaker:  heater on
                D/ElectricHeater: ~ ~ ~ heating ~ ~ ~
                D/CoffeeMaker:  heater on
                D/CoffeeModule: providePump:    // Provide once
                D/Thermosiphon: => => pumping => =>
                D/CoffeeMaker:  pump pump
                D/Thermosiphon: => => pumping => =>
                D/CoffeeMaker:  pump pump
                                [_]P coffee! [_]P
                D/CoffeeModule: provideIce: // First provide
                D/CoffeeModule: provideIceBox: // First provide
                D/NajiIce: @@ ~~ Ice ~~ @@
                D/CoffeeMaker:  iceBox addIce
                 D/CoffeeModule: provideIce: // Second provide
                D/CoffeeModule: provideIceBox: // Second provide
                D/NajiIce: @@ ~~ Ice ~~ @@
                D/CoffeeMaker:  iceBox addIce
                D/Milk: ** Add Milk: caomei **
                D/ElectricHeater: off
         */
    }
}
