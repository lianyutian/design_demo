package com.github.lianyutian.design.strategy.strategy02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/12 17:12
 */
public class RegularPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double price) {
        return price;
    }
}
