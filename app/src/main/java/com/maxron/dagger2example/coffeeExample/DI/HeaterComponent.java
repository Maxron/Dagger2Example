package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.FirstViewModel;
import com.maxron.dagger2example.MainViewModel;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(dependencies = BaseComponent.class)
public interface HeaterComponent {
    void inject(MainViewModel maker);
    void inject(FirstViewModel maker);

    /*
        Error Message:
            error: This @Singleton component cannot depend on scoped components:
            @Singleton com.maxron.dagger2example.coffeeExample.DI.BaseComponent
     */
}
