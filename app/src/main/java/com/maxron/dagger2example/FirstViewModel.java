package com.maxron.dagger2example;

import android.arch.lifecycle.ViewModel;

import com.maxron.dagger2example.coffeeExample.DI.DaggerGameModeComponent;
import com.maxron.dagger2example.coffeeExample.DI.GameModeComponent;
import com.maxron.dagger2example.coffeeExample.Heater;

import javax.inject.Inject;

public class FirstViewModel extends ViewModel {

    private static final String TAG = FirstViewModel.class.getSimpleName();

    @Inject Heater heater;

    public FirstViewModel() {
        GameModeComponent component = DaggerGameModeComponent.builder().gameModeName("FirstPerson").build();
        component.inject(this);

        heater.on();
        heater.off();
        /*
            Result:
                D/ElectricHeater: ~ ~ ~ heating ~ ~ ~
                D/ElectricHeater: off
         */
    }
}
