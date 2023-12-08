package com.github.lianyutian.design.solid.ocp.ocp02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 11:08
 */
public class Rectangle extends Shape {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    int calculateArea() {
        return width * height;
    }
}
