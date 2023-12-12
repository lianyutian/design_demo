package com.github.lianyutian.design.decorator.decorator02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/11 10:20
 */
public class MilkDecorator implements CoffeeDecorator {
    private final Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
}
