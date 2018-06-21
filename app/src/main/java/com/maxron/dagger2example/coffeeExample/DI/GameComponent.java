package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.FirstViewModel;

import dagger.Component;

@Component(modules = GameModule.class)
public interface GameComponent {
    void inject(FirstViewModel viewModel);
}
