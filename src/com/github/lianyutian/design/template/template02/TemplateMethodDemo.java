package com.github.lianyutian.design.template.template02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/13 17:13
 */
public class TemplateMethodDemo {
    public static void main(String[] args) {
        System.out.println("Making tea:");
        Tea tea = new Tea();
        tea.makeBeverage();

        System.out.println("\nMaking coffee:");
        Coffee coffee = new Coffee();
        coffee.makeBeverage();
    }
}
