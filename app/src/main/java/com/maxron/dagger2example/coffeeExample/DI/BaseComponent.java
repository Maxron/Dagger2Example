package com.maxron.dagger2example.coffeeExample.DI;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = BaseModule.class)
public interface BaseComponent {
    /*
        BaseComponent 是用來提供別的 Component 所須的 dependency，因此不需要宣告 inject 方法
     */
}
