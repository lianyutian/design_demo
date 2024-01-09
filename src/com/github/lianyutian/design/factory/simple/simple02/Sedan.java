package com.github.lianyutian.design.factory.simple.simple02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/15 13:41
 */
public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan");
    }

    @Override
    public void paint() {
        System.out.println("Painting Sedan");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering Sedan");
    }
}
