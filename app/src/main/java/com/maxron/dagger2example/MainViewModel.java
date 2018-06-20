package com.maxron.dagger2example;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;

import com.maxron.dagger2example.coffeeExample.B;
import com.maxron.dagger2example.coffeeExample.DI.BComponent;
import com.maxron.dagger2example.coffeeExample.DI.DaggerBComponent;

import javax.inject.Inject;

public class MainViewModel extends AndroidViewModel {

    private static final String TAG = MainViewModel.class.getSimpleName();
    private MutableLiveData<String> message = new MutableLiveData<>();

    @Inject B b;

    public MainViewModel(@NonNull Application application) {
        super(application);
        injectComponent();
    }

    private void injectComponent() {
        Log.d(TAG, "injectComponent: ");

        BComponent component = DaggerBComponent.create();
        component.inject(this);
    }

    public LiveData<String> getMessage() {
        return message;
    }

    public void toFirstView() {
        Intent intent = new Intent(getApplication().getApplicationContext(), FirstActivity.class);
        getApplication().getApplicationContext().startActivity(intent);
    }
}
