package com.maxron.dagger2example.coffeeExample;

public class HaierIceBox implements IceBox {

    private final Ice ice;

    public HaierIceBox(Ice ice) {
        this.ice = ice;
    }

    @Override
    public void addIce() {
        ice.add();
    }
}
