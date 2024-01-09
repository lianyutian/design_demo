package com.github.lianyutian.design.composite.composite01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liming
 * @version 1.0
 * @since 2024/1/9 9:16
 */
public class DepartmentWithoutComposite {
    private String name;
    private List<EmployeeWithoutComposite> members = new ArrayList<>();
    private List<DepartmentWithoutComposite> departments = new ArrayList<>();

    public DepartmentWithoutComposite(String name) {
        this.name = name;
    }

    public void addMember(EmployeeWithoutComposite member) {
        members.add(member);
    }

    public void addDepartMent(DepartmentWithoutComposite department) {
        departments.add(department);
    }

    public void display() {
        for (DepartmentWithoutComposite department : departments) {
            System.out.println("Department: " + department.name);
            for (EmployeeWithoutComposite member : department.members) {
                System.out.println("Members:");
                member.display();
            }
            department.display();
        }
    }
}
