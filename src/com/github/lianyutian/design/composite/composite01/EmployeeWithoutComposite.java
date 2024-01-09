package com.github.lianyutian.design.composite.composite01;

/**
 * @author liming
 * @version 1.0
 * @since 2024/1/9 9:16
 */
public class EmployeeWithoutComposite {
    private String name;
    private String position;

    public EmployeeWithoutComposite(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void display() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}
