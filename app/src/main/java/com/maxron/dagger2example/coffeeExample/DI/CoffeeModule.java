package com.maxron.dagger2example.coffeeExample.DI;

import android.util.Log;

import com.maxron.dagger2example.coffeeExample.ElectricHeater;
import com.maxron.dagger2example.coffeeExample.HaierIceBox;
import com.maxron.dagger2example.coffeeExample.Heater;
import com.maxron.dagger2example.coffeeExample.Ice;
import com.maxron.dagger2example.coffeeExample.IceBox;
import com.maxron.dagger2example.coffeeExample.Milk;
import com.maxron.dagger2example.coffeeExample.NajiIce;
import com.maxron.dagger2example.coffeeExample.Pump;
import com.maxron.dagger2example.coffeeExample.Thermosiphon;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    private static final String TAG = CoffeeModule.class.getSimpleName();

    @Provides
    Heater provideHeater() {
        Log.d(TAG, "provideHeater: ");
        return new ElectricHeater();
    }

    @Provides
    Pump providePump() {
        Log.d(TAG, "providePump: ");
        return new Thermosiphon();
    }

    @Provides
    Ice provideIce() {
        Log.d(TAG, "provideIce: ");
        return new NajiIce();
    }

    @Provides
    IceBox provideIceBox(Ice ice) {
        Log.d(TAG, "provideIceBox: ");
        return new HaierIceBox(ice);
    }

    @Provides
    @Named("normal")
    Milk provideNormalMilk() {
        Log.d(TAG, "provideNormalMilk: ");
        return new Milk();
    }

    @Provides
    @Named("shuiguo")
    Milk provideShuiGuoMilk(String type) {
        Log.d(TAG, "provideShuiGuoMilk: ");
        return new Milk(type);
    }

    @Provides
    public String provideString() {
        Log.d(TAG, "provideString: ");
        // return new String();
        return "caomei";
    }
}
