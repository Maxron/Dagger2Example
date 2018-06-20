package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

import javax.inject.Inject;

public class B {
    private static final String TAG = B.class.getSimpleName();

    @Inject
    public B() {
        Log.d(TAG, "create B: ");
    }
}
