package com.maxron.dagger2example;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.maxron.dagger2example.coffeeExample.CoffeeMaker;

public class MainViewModel extends AndroidViewModel {

    private MutableLiveData<String> message = new MutableLiveData<>();

    public MainViewModel(@NonNull Application application) {
        super(application);
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.brew();
    }

    public LiveData<String> getMessage() {
        return message;
    }

    public void toFirstView() {
        Intent intent = new Intent(getApplication().getApplicationContext(), FirstActivity.class);
        getApplication().getApplicationContext().startActivity(intent);
    }
}
