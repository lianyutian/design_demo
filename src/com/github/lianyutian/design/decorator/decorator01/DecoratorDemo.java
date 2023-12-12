package com.github.lianyutian.design.decorator.decorator01;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/11 10:36
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        // 创建一个普通的咖啡
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of simple coffee: $" + simpleCoffee.cost());
        System.out.println("Description: " + simpleCoffee.getDescription());

        // 牛奶咖啡
        Coffee milkCoffee = new MilkCoffee();
        System.out.println("Cost of coffee with milk: $" + milkCoffee.cost());
        System.out.println("Description: " + milkCoffee.getDescription());

        // 牛奶加糖咖啡
        Coffee milkAndSugarCoffee = new MilkSugarCoffee();
        System.out.println("Cost of coffee with milk and sugar: $" + milkAndSugarCoffee.cost());
        System.out.println("Description: " + milkAndSugarCoffee.getDescription());
    }
}
