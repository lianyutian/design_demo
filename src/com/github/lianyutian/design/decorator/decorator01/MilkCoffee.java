package com.github.lianyutian.design.decorator.decorator01;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/11 10:27
 */
public class MilkCoffee extends SimpleCoffee {

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
