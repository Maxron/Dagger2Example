package com.maxron.dagger2example;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @BindView(R.id.textview_message)
    TextView message;

    @Inject Computer computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        computer.show();
        addFragment();
    }

    private void addFragment() {
        DummyFragment fragment =
                (DummyFragment) getSupportFragmentManager().findFragmentById(R.id.layout_content);
        if (fragment == null) {
            fragment = DummyFragment.newInstance();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.add(R.id.layout_content, fragment);
            transaction.commit();
        }
    }

}
