package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.FirstViewModel;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {GameModeModule.class, Coffee2Module.class})
public interface GameModeComponent {

    void inject(FirstViewModel viewModel);

    @Component.Builder
    interface Builder {
        GameModeComponent build();

        @BindsInstance Builder gameModeName(String mode);
    }
}
