package com.maxron.dagger2example.DI;

import com.maxron.dagger2example.DummyFragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = DummyFragmentModule.class)
public interface DummyFragmentComponent extends AndroidInjector<DummyFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DummyFragment> {}
}
