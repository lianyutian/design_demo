package com.github.lianyutian.design.template.template01;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/13 16:27
 */
public class TeaWithoutTemplate {
    public void makeTea() {
        boilWater();
        steepTea();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void steepTea() {
        System.out.println("Steeping the tea");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void addLemon() {
        System.out.println("Adding lemon");
    }
}
