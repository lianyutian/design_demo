package com.github.lianyutian.design.strategy.strategy02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/12 17:13
 */
public class DiscountedPricingStrategy implements PricingStrategy {
    private static final double DISCOUNT_RATE = 0.8;

    @Override
    public double calculatePrice(double price) {
        return price * DISCOUNT_RATE;
    }
}
