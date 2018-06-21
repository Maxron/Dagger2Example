package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.MainViewModel;
import com.maxron.dagger2example.coffeeExample.B;

import dagger.Subcomponent;

@Subcomponent(modules = BModule.class)
public interface BComponent {

    void inject(MainViewModel viewModel);

    B provideB();
}