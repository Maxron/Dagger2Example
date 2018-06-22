package com.maxron.dagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textview_message)
    TextView message;

    @Inject Computer computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);  // Need before super.onCreate();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        computer.show();
    }
}
