package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

public class NajiIce implements Ice {
    private static final String TAG = NajiIce.class.getSimpleName();

    public NajiIce() {
    }

    @Override
    public void add() {
        Log.d(TAG, "@@ ~~ Ice ~~ @@");
    }
}
