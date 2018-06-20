package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

import javax.inject.Inject;

public class A {
    private static final String TAG = A.class.getSimpleName();

    @Inject
    public A() {
        Log.d(TAG, "create A: ");
    }
}
