package com.maxron.dagger2example;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector {

    @BindView(R.id.textview_message)
    TextView message;

    @Inject Computer computer;

    @Inject
    DispatchingAndroidInjector<Fragment> injector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);  // Need before super.onCreate();
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

    @Override
    public AndroidInjector<android.support.v4.app.Fragment> supportFragmentInjector() {
        return injector;
    }
}
