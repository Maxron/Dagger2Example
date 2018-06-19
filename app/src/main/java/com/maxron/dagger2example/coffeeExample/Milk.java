package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

public class Milk {

    private static final String TAG = Milk.class.getSimpleName();
    private final String type;

    public Milk() {
        type = "";
    }

    public Milk(String type) {
        this.type = type;
    }

    public void addMilk() {
        Log.d(TAG, "** Add Milk: " + this.type + " **");
    }
}
