package com.github.lianyutian.design.composite.composite02;

/**
 * @author liming
 * @version 1.0
 * @since 2024/1/9 10:31
 */
public class Employee implements OrganizationComponent {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void display() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}
