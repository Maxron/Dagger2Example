package com.maxron.dagger2example;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.maxron.dagger2example.coffeeExample.DI.CoffeeComponent;
import com.maxron.dagger2example.coffeeExample.DI.DaggerCoffeeComponent;
import com.maxron.dagger2example.coffeeExample.Heater;

import javax.inject.Inject;

public class FirstViewModel extends ViewModel {

    private static final String TAG = FirstViewModel.class.getSimpleName();
    @Inject Heater heater1;
    @Inject Heater heater2;

    public FirstViewModel() {
        injectComponent();
    }

    private void injectComponent() {
        CoffeeComponent component = DaggerCoffeeComponent.create();
        component.inject(this);

        Log.d(TAG, "MainViewModel: heater1: " + heater1.toString());
        Log.d(TAG, "MainViewModel: heater2: " + heater2.toString());
        /*
            Result:
                MainViewModel: heater1: com.maxron.dagger2example.coffeeExample.ElectricHeater@d68f28
                MainViewModel: heater2: com.maxron.dagger2example.coffeeExample.ElectricHeater@d68f28
         */
    }
}
