package com.github.lianyutian.design.decorator.decorator02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/11 10:38
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        // 创建一个普通的咖啡
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of simple coffee: $" + simpleCoffee.cost());
        System.out.println("Description: " + simpleCoffee.getDescription());

        // 使用装饰器加牛奶
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost of coffee with milk: $" + milkCoffee.cost());
        System.out.println("Description: " + milkCoffee.getDescription());

        // 使用装饰器加牛奶和糖
        Coffee milkAndSugarCoffee = new SugarDecorator(new MilkDecorator(simpleCoffee));
        System.out.println("Cost of coffee with milk and sugar: $" + milkAndSugarCoffee.cost());
        System.out.println("Description: " + milkAndSugarCoffee.getDescription());
    }
}
