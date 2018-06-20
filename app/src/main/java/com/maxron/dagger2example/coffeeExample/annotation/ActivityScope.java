package com.maxron.dagger2example.coffeeExample.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import dagger.releasablereferences.CanReleaseReferences;

@Scope
@Documented
@CanReleaseReferences
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {
}
