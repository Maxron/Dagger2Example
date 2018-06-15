package com.maxron.dagger2example.simpleDI;

public class Bill implements Man, CarInjector {

    private Car car;

    public Bill() {
    }

    @Override
    public String showCar() {
        return car.brand();
    }

    @Override
    public void injectCar(Car car) {
        this.car = car;
    }
}
