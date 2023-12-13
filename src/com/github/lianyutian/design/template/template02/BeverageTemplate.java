package com.github.lianyutian.design.template.template02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/13 17:11
 */
public abstract class BeverageTemplate {
    // 制作饮料的模板方法
    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 抽象方法，由子类实现
    protected abstract void brew();

    // 抽象方法，由子类实现
    protected abstract void addCondiments();

    // 具体方法
    private void boilWater() {
        System.out.println("Boiling water");
    }

    // 具体方法
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
