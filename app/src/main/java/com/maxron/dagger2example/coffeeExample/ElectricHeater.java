package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

public class ElectricHeater implements Heater {
    private static final String TAG = ElectricHeater.class.getSimpleName();

    @Override
    public void on() {
        Log.d(TAG, "~ ~ ~ heating ~ ~ ~");
    }

    @Override
    public void off() {
        Log.d(TAG, "off");
    }
}
