package com.maxron.dagger2example.DI;

import com.maxron.dagger2example.MainActivity;

import dagger.Component;

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
