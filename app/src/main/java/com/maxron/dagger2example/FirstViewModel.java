package com.maxron.dagger2example;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.maxron.dagger2example.coffeeExample.DI.DaggerHeaterComponent;
import com.maxron.dagger2example.coffeeExample.DI.HeaterComponent;
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
        Log.d(TAG, "injectComponent: ");

        HeaterComponent component = DaggerHeaterComponent.builder()
                .baseComponent(BaseApplication.getInstance().getBaseComponent())
                .build();
        component.inject(this   );

        Log.d(TAG, "injectComponent: heater1: " + heater1);
        Log.d(TAG, "injectComponent: heater2: " + heater2);
        /*
            Result:
                heater1: com.maxron.dagger2example.coffeeExample.ElectricHeater@d28e23f
                heater2: com.maxron.dagger2example.coffeeExample.ElectricHeater@d28e23f
         */
    }
}
