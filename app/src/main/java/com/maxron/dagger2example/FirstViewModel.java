package com.maxron.dagger2example;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

public class FirstViewModel extends ViewModel {

    private static final String TAG = FirstViewModel.class.getSimpleName();

    public FirstViewModel() {
        injectComponent();
    }

    private void injectComponent() {
        Log.d(TAG, "injectComponent: ");

    }
}
