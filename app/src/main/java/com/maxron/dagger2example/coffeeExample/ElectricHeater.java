package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

import javax.inject.Inject;

public class ElectricHeater implements Heater {
    private static final String TAG = ElectricHeater.class.getSimpleName();

    @Inject
    public ElectricHeater() {
    }

    @Override
    public void on() {
        Log.d(TAG, "~ ~ ~ heating ~ ~ ~");
    }

    @Override
    public void off() {
        Log.d(TAG, "off");
    }
}
