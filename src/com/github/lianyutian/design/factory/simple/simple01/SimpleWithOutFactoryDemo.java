package com.github.lianyutian.design.factory.simple.simple01;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/15 13:42
 */
public class SimpleWithOutFactoryDemo {
    public static void main(String[] args) {
        // 创建小轿车
        Sedan sedan = new Sedan();
        sedan.assemble();
        sedan.paint();
        sedan.deliver();

        System.out.println();

        // 创建SUV
        Suv suv = new Suv();
        suv.assemble();
        suv.paint();
        suv.deliver();
    }
}
