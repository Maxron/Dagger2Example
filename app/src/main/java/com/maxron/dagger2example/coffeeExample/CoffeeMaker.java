package com.maxron.dagger2example.coffeeExample;

import android.util.Log;

import com.maxron.dagger2example.coffeeExample.DI.CoffeeComponent;
import com.maxron.dagger2example.coffeeExample.DI.DaggerCoffeeComponent;
import com.maxron.dagger2example.coffeeExample.annotation.ShuiGuoMilk;

import javax.inject.Inject;

public class CoffeeMaker {
    private static final String TAG = CoffeeMaker.class.getSimpleName();

    @Inject Heater heater;
    @Inject Heater heater2;
    @Inject Pump pump;
    @Inject IceBox iceBox;
    @Inject @ShuiGuoMilk Milk milk;

    public CoffeeMaker() {
        // Should build before use DaggerCoffeeComponent
        // DaggerCoffeeComponent: Auto create after build by Dagger2 library
        CoffeeComponent component = DaggerCoffeeComponent.create();
        component.inject(this);

        /* Or use the follow code:
        DaggerCoffeeComponent.builder()
                .coffeeModule(new CoffeeModule())
                .build()
                .inject(this);
        */

    }

    public void brew() {
        heater.on();
        pump.pump();
        Log.d(TAG, " [_]P coffee! [_]P ");
        iceBox.addIce();
        milk.addMilk();
        heater.off();

        Log.d(TAG, "brew: heater :" + heater.toString());
        Log.d(TAG, "brew: heater2:" + heater2.toString());
        /*
          Result: It's different object
            brew: heater :com.maxron.dagger2example.coffeeExample.ElectricHeater@d28e23f
            brew: heater :com.maxron.dagger2example.coffeeExample.ElectricHeater@d28e23f

            Scope 是局部單例，效用範圍僅限於每次在 CoffeeComponent 中所取得的Heater 都是同一個物件；
            若是在別的 Activity 中建立新的 CoffeeComponent，則 Activty1 所取得的 Heater 與 Activity2
            所取得的 Heater 會是不同物件
         */

    }
}
