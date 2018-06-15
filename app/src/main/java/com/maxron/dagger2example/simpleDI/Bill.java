package com.maxron.dagger2example.simpleDI;

public class Bill implements Man {

    private final Car car;

    public Bill() {
        this.car = new Ferrari();
    }

    @Override
    public String showCar() {
        return car.brand();
    }
}
