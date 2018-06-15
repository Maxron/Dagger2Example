package com.maxron.dagger2example;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<String> message = new MutableLiveData<>();

    public MainViewModel() {
        message.setValue("Message");
    }

    public LiveData<String> getMessage() {
        return message;
    }
}
