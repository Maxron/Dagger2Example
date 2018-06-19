package com.maxron.dagger2example.coffeeExample.DI;

import com.maxron.dagger2example.coffeeExample.ElectricHeater;
import com.maxron.dagger2example.coffeeExample.HaierIceBox;
import com.maxron.dagger2example.coffeeExample.Heater;
import com.maxron.dagger2example.coffeeExample.Ice;
import com.maxron.dagger2example.coffeeExample.IceBox;
import com.maxron.dagger2example.coffeeExample.Milk;
import com.maxron.dagger2example.coffeeExample.NajiIce;
import com.maxron.dagger2example.coffeeExample.Pump;
import com.maxron.dagger2example.coffeeExample.Thermosiphon;
import com.maxron.dagger2example.coffeeExample.annotation.HeaterScope;
import com.maxron.dagger2example.coffeeExample.annotation.NormalMilk;
import com.maxron.dagger2example.coffeeExample.annotation.ShuiGuoMilk;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    @HeaterScope
    @Provides
    Heater provideHeater() {
        return new ElectricHeater();
    }

    @Provides
    Pump providePump() {
        return new Thermosiphon();
    }

    @Provides
    Ice provideIce() {
        return new NajiIce();
    }

    @Provides
    IceBox provideIceBox(Ice ice) {
        return new HaierIceBox(ice);
    }

    @Provides
    @NormalMilk
    Milk provideNormalMilk() {
        return new Milk();
    }

    @Provides
    @ShuiGuoMilk
    Milk provideShuiGuoMilk(String type) {
        return new Milk(type);
    }

    @Provides
    public String provideString() {
        // return new String();
        return "caomei";
    }
}
