package com.github.lianyutian.design.factory.simple.simple02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/15 13:43
 */
public class CarFactory {
    public Car createCar(String carType) {
        if ("sedan".equalsIgnoreCase(carType)) {
            return new Sedan();
        } else if ("suv".equalsIgnoreCase(carType)) {
            return new Suv();
        } else {
            throw new IllegalArgumentException("Invalid car type");
        }
    }
}
