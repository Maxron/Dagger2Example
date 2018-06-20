package com.maxron.dagger2example;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;

import com.maxron.dagger2example.coffeeExample.A;
import com.maxron.dagger2example.coffeeExample.B;
import com.maxron.dagger2example.coffeeExample.DI.AComponent;
import com.maxron.dagger2example.coffeeExample.DI.AModule;
import com.maxron.dagger2example.coffeeExample.DI.BComponent;
import com.maxron.dagger2example.coffeeExample.DI.BModule;
import com.maxron.dagger2example.coffeeExample.DI.DaggerAComponent;
import com.maxron.dagger2example.coffeeExample.DI.DaggerBComponent;

import javax.inject.Inject;

public class MainViewModel extends AndroidViewModel {

    private static final String TAG = MainViewModel.class.getSimpleName();
    private MutableLiveData<String> message = new MutableLiveData<>();

    @Inject B b;
    @Inject A a;

    public MainViewModel(@NonNull Application application) {
        super(application);
        injectComponent();
    }

    private void injectComponent() {
        Log.d(TAG, "injectComponent: ");

        AComponent aComponent = DaggerAComponent.builder()
                                                .aModule(new AModule())
                                                .build();
        BComponent bComponent = DaggerBComponent.builder()
                                                .bModule(new BModule())
                                                .aComponent(aComponent)
                                                .build();
        bComponent.inject(this);
        /*
            Result:
                26700-26700/com.maxron.dagger2example D/B: create B:
                26700-26700/com.maxron.dagger2example D/A: create A:
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
