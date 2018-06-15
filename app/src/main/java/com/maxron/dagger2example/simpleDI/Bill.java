package com.maxron.dagger2example.simpleDI;

public class Bill implements Man {

    private Car car;

    public Bill() {
    }

    @Override
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String showCar() {
        return car.brand();
    }
}
