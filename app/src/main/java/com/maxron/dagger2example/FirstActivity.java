package com.maxron.dagger2example;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FirstActivity extends AppCompatActivity {

    private static final String TAG = FirstActivity.class.getSimpleName();
    private FirstViewModel viewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d(TAG, "onCreate: ");

        subscribe();
    }

    private void subscribe() {
        Log.d(TAG, "subscribe: ");
        viewmodel = ViewModelProviders.of(this).get(FirstViewModel.class);

    }
}
