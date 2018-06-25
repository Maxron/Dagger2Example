package com.maxron.dagger2example.DI;

import com.maxron.dagger2example.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {MainActivityModule.class, DummyFragmentBindingModule.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}
