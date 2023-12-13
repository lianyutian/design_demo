package com.github.lianyutian.design.template.template01;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/13 17:13
 */
public class WithoutTemplateMethodDemo {
    public static void main(String[] args) {
        System.out.println("Making tea:");
        TeaWithoutTemplate tea = new TeaWithoutTemplate();
        tea.makeTea();

        System.out.println("\nMaking coffee:");
        CoffeeWithoutTemplate coffee = new CoffeeWithoutTemplate();
        coffee.makeCoffee();
    }
}
