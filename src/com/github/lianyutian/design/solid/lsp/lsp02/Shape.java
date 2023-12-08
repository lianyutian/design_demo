package com.github.lianyutian.design.solid.lsp.lsp02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 13:35
 */
public class Shape {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}
