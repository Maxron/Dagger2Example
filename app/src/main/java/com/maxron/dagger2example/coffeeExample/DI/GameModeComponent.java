package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.FirstViewModel;

import dagger.Component;

@Component(modules = GameModeModule.class)
public interface GameModeComponent {

    void inject(FirstViewModel viewModel);
}
