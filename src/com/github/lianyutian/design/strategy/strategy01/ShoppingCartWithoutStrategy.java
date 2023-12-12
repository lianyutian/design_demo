package com.github.lianyutian.design.strategy.strategy01;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/12 17:11
 */
public class ShoppingCartWithoutStrategy {
    public static void main(String[] args) {
        double regularTotal = calculateRegularPrice(100);
        System.out.println("Regular total: $" + regularTotal);

        double discountedTotal = calculateDiscountedPrice(100);
        System.out.println("Discounted total: $" + discountedTotal);
    }

    // 正常计价逻辑
    private static double calculateRegularPrice(double price) {
        return price;
    }

    // 折扣计价逻辑
    private static double calculateDiscountedPrice(double price) {
        double discountRate = 0.8;
        return price * discountRate;
    }
}
