package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

import javax.inject.Inject;

public class GameMode {

    private static final String TAG = GameMode.class.getSimpleName();

    @Inject
    public GameMode() {
        Log.d(TAG, "GameMode: ");
    }

    public String getMode() {
        return "Normal";
    }
}
