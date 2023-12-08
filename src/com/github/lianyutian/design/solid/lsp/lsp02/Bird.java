package com.github.lianyutian.design.solid.lsp.lsp02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 13:27
 */
public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
