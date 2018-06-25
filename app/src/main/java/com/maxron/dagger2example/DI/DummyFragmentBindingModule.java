package com.maxron.dagger2example.DI;

import android.support.v4.app.Fragment;

import com.maxron.dagger2example.DummyFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = DummyFragmentComponent.class)
public abstract class DummyFragmentBindingModule {

    @Binds
    @IntoMap
    @FragmentKey(DummyFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindDummyFragment(DummyFragmentComponent.Builder builder);
}
