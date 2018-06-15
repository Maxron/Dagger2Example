package com.maxron.dagger2example.simpleDI;

public class Bill implements Man {

    private final Car car;

    public Bill(Car car) {
        this.car = car;
    }

    @Override
    public String showCar() {
        return car.brand();
    }
}
