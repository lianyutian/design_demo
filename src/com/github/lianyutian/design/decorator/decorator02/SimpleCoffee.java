package com.github.lianyutian.design.decorator.decorator02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/11 10:19
 */
public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "coffee";
    }
}
