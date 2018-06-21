package com.maxron.dagger2example;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.maxron.dagger2example.coffeeExample.DI.DaggerGameModeComponent;
import com.maxron.dagger2example.coffeeExample.DI.GameModeComponent;
import com.maxron.dagger2example.coffeeExample.GameMode;

import javax.inject.Inject;

public class FirstViewModel extends ViewModel {

    private static final String TAG = FirstViewModel.class.getSimpleName();
    @Inject
    GameMode gameMode;

    public FirstViewModel() {
        GameModeComponent component = DaggerGameModeComponent.create();
        component.inject(this);

        Log.d(TAG, "FirstViewModel: " + gameMode.getMode());
        /*
            Result:
                D/FirstViewModel: FirstViewModel: Normal
         */
    }
}
