package com.github.lianyutian.design.template.template01;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/13 16:51
 */
public class CoffeeWithoutTemplate {
    public void makeCoffee() {
        boilWater();
        dripCoffeeThroughFilter();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void dripCoffeeThroughFilter() {
        System.out.println("Dripping coffee through filter");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }
}
