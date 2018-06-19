package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.FirstViewModel;
import com.maxron.dagger2example.MainViewModel;
import com.maxron.dagger2example.coffeeExample.annotation.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(dependencies = BaseComponent.class)
public interface HeaterComponent {
    void inject(MainViewModel maker);
    void inject(FirstViewModel maker);

}
