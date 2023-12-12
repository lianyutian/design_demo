package com.github.lianyutian.design.strategy.strategy02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/12 17:13
 */
public class ShoppingCart {
    private PricingStrategy pricingStrategy;

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateTotal(double price) {
        return pricingStrategy.calculatePrice(price);
    }
}
