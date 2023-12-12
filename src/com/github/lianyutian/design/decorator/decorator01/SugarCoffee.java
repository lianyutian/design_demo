package com.github.lianyutian.design.decorator.decorator01;

import com.github.lianyutian.design.decorator.decorator02.SimpleCoffee;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/11 10:28
 */
public class SugarCoffee extends SimpleCoffee {
    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
