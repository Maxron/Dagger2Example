package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.FirstViewModel;
import com.maxron.dagger2example.coffeeExample.A;

import dagger.Component;

@Component(modules = AModule.class)
public interface AComponent {

    void inject(FirstViewModel viewModel);

    A provideA();

    BComponent bcomponent();
}
