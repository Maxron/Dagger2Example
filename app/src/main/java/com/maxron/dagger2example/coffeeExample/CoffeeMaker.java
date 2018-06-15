package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

public class CoffeeMaker {
    private static final String TAG = CoffeeMaker.class.getSimpleName();
    private final Heater heater;
    private final Pump pump;

    public CoffeeMaker() {
        this.heater = new ElectricHeater();
        this.pump = new Thermosiphon();
    }

    public void brew() {
        heater.on();
        pump.pump();
        Log.d(TAG, " [_]P coffee! [_]P ");
        heater.off();
    }
}
