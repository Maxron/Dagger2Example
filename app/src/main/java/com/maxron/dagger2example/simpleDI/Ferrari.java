package com.maxron.dagger2example.simpleDI;

public class Ferrari implements Car {

    private static final String BRAND = "Ferrari";

    public Ferrari() {
    }

    @Override
    public String brand() {
        return this.BRAND;
    }
}
