package com.github.lianyutian.design.factory.simple.simple01;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/15 13:41
 */
public class Suv implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling SUV");
    }

    @Override
    public void paint() {
        System.out.println("Painting SUV");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering SUV");
    }
}
