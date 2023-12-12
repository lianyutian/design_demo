package com.github.lianyutian.design.decorator.decorator02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/11 10:21
 */
public class SugarDecorator implements CoffeeDecorator {
    private final Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
}
