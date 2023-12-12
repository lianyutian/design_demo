package com.github.lianyutian.design.strategy.strategy02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/12 17:14
 */
public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // 默认使用正常计价策略
        PricingStrategy regularStrategy = new RegularPricingStrategy();
        cart.setPricingStrategy(regularStrategy);
        double regularTotal = cart.calculateTotal(100);
        System.out.println("Regular total: $" + regularTotal);

        // 切换为折扣计价策略
        PricingStrategy discountedStrategy = new DiscountedPricingStrategy();
        cart.setPricingStrategy(discountedStrategy);
        double discountedTotal = cart.calculateTotal(100);
        System.out.println("Discounted total: $" + discountedTotal);
    }
}
