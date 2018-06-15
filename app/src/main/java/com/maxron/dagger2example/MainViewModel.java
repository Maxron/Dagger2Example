package com.maxron.dagger2example;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.maxron.dagger2example.coffeeExample.CoffeeMaker;

public class MainViewModel extends ViewModel {

    private MutableLiveData<String> message = new MutableLiveData<>();

    public MainViewModel() {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.brew();
    }

    public LiveData<String> getMessage() {
        return message;
    }
}
