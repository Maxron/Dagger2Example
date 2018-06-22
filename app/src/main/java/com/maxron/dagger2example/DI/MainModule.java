package com.maxron.dagger2example.DI;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.maxron.dagger2example.TitleFragment;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    AppCompatActivity appCompatActivity;

    public MainModule(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    @Provides
    FragmentManager provideFragmentManager() {
        return appCompatActivity.getSupportFragmentManager();
    }

    @Provides
    List<String> providesTitles() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add("Page Title: " + i);
        }
        return list;
    }

    @Provides
    List<Fragment> providesFragmentList(List<String> titles) {
        List<Fragment> fragments = new ArrayList<>();
        for (String title: titles) {
            fragments.add(TitleFragment.getInstance(title));
        }
        return fragments;
    }

}
