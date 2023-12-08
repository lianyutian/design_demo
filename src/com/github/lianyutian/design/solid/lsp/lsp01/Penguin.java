package com.github.lianyutian.design.solid.lsp.lsp01;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 13:26
 */
public class Penguin extends Bird {
    // 企鹅不会飞，但由于继承关系，不得不实现fly方法
    @Override
    void fly() {
        System.out.println("I can't fly");
    }
}
