package com.github.lianyutian.design.composite.composite02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liming
 * @version 1.0
 * @since 2024/1/9 10:32
 */
public class Department implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> members = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addMember(OrganizationComponent member) {
        members.add(member);
    }

    @Override
    public void display() {
        System.out.println("Department: " + name);
        System.out.println("Members:");
        for (OrganizationComponent member : members) {
            member.display();
        }
    }
}
