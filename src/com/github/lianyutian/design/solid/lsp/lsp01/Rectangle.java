package com.github.lianyutian.design.solid.lsp.lsp01;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 13:33
 */
public class Rectangle {
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
