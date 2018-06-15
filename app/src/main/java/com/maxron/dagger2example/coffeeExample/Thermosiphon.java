package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

public class Thermosiphon implements Pump {

    private static final String TAG = Thermosiphon.class.getSimpleName();

    public Thermosiphon() {
    }

    @Override
    public void pump() {
        Log.d(TAG, "=> => pumping => =>");
    }
}
