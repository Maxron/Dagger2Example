package com.maxron.dagger2example;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.maxron.dagger2example.simpleDI.Bill;
import com.maxron.dagger2example.simpleDI.Man;

public class MainViewModel extends ViewModel {

    private MutableLiveData<String> message = new MutableLiveData<>();
    private final Man man;

    public MainViewModel() {
        man = new Bill();
        message.setValue(man.showCar());
    }

    public LiveData<String> getMessage() {
        return message;
    }
}
