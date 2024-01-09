package com.github.lianyutian.design.factory.simple.simple02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/15 13:43
 */
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        // 创建小轿车
        Car sedan = carFactory.createCar("sedan");
        sedan.assemble();
        sedan.paint();
        sedan.deliver();

        System.out.println();

        // 创建SUV
        Car suv = carFactory.createCar("suv");
        suv.assemble();
        suv.paint();
        suv.deliver();
    }
}
