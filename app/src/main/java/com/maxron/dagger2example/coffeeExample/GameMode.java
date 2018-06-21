package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

import javax.inject.Inject;

public class GameMode {

    private static final String TAG = GameMode.class.getSimpleName();
    private final String mode;

    @Inject
    public GameMode(String mode) {
        Log.d(TAG, "GameMode: ");
        this.mode = mode;
    }

    public String getMode() {
        return this.mode;
    }
}
