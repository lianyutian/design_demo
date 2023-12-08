package com.github.lianyutian.design.solid.ocp.ocp02;

/**
 * @author liming
 * @version 1.0
 * @since 2023/12/8 11:09
 */
public class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    int calculateArea() {
        return (int) (Math.PI * radius * radius);
    }
}
