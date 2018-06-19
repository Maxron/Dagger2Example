package com.maxron.dagger2example;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;

import com.maxron.dagger2example.coffeeExample.DI.CoffeeComponent;
import com.maxron.dagger2example.coffeeExample.DI.DaggerCoffeeComponent;
import com.maxron.dagger2example.coffeeExample.Heater;

import javax.inject.Inject;

public class MainViewModel extends AndroidViewModel {

    private static final String TAG = MainViewModel.class.getSimpleName();
    private MutableLiveData<String> message = new MutableLiveData<>();

    @Inject Heater heater1;
    @Inject Heater heater2;

    public MainViewModel(@NonNull Application application) {
        super(application);
        injectComponent();
    }

    private void injectComponent() {
        Log.d(TAG, "injectComponent: ");
        CoffeeComponent component = DaggerCoffeeComponent.create();
        component.inject(this);

        Log.d(TAG, "MainViewModel: heater1: " + heater1.toString());
        Log.d(TAG, "MainViewModel: heater2: " + heater2.toString());
        /*
            Result:
            MainViewModel: heater1: com.maxron.dagger2example.coffeeExample.ElectricHeater@d28e23f
            MainViewModel: heater2: com.maxron.dagger2example.coffeeExample.ElectricHeater@d28e23f
         */
    }

    public LiveData<String> getMessage() {
        return message;
    }

    public void toFirstView() {
        Intent intent = new Intent(getApplication().getApplicationContext(), FirstActivity.class);
        getApplication().getApplicationContext().startActivity(intent);
    }
}
