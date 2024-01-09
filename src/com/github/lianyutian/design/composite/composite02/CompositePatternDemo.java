package com.github.lianyutian.design.composite.composite02;

/**
 * @author liming
 * @version 1.0
 * @since 2024/1/9 10:32
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        // 创建员工
        OrganizationComponent employee1 = new Employee("Alice", "Developer");
        OrganizationComponent employee2 = new Employee("Bob", "Designer");

        // 创建部门，并添加员工
        Department developmentDepartment = new Department("Development");
        developmentDepartment.addMember(employee1);
        developmentDepartment.addMember(employee2);

        // 创建更复杂的组织结构
        OrganizationComponent employee3 = new Employee("Charlie", "Manager");
        Department managementDepartment = new Department("Management");
        managementDepartment.addMember(employee3);
        managementDepartment.addMember(developmentDepartment);

        // 显示整个组织结构
        managementDepartment.display();
    }
}
