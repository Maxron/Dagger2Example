package com.maxron.dagger2example;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.maxron.dagger2example.coffeeExample.DI.DaggerGameComponent;
import com.maxron.dagger2example.coffeeExample.DI.GameComponent;
import com.maxron.dagger2example.coffeeExample.Player;

import java.util.Map;
import java.util.function.Consumer;

import javax.inject.Inject;

public class FirstViewModel extends ViewModel {

    private static final String TAG = FirstViewModel.class.getSimpleName();
    @Inject
    Map<String, Player> player;

    public FirstViewModel() {
        GameComponent component = DaggerGameComponent.create();
        component.inject(this);

        player.keySet().forEach(new Consumer<String>() {
            @Override
            public void accept(String key) {
                Log.d(TAG, "accept: key: " + key);
                /*
                    Result:
                        D/FirstViewModel: accept: key: 1
                        D/FirstViewModel: accept: key: 2
                 */
            }
        });

        player.values().forEach(new Consumer<Player>() {
            @Override
            public void accept(Player player) {
                Log.d(TAG, "accept: name:" + player.getName());
                /*
                    Result:
                        D/FirstViewModel: accept: name:1
                                          accept: name:2
                 */
            }
        });
    }
}
