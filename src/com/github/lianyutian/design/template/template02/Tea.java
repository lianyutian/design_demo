package com.github.lianyutian.design.template.template02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/13 17:12
 */
public class Tea extends BeverageTemplate {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
