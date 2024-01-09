package com.github.lianyutian.design.composite.composite01;

/**
 * @author liming
 * @version 1.0
 * @since 2024/1/9 9:15
 */
public class OrganizationWithoutComposite {
    public static void main(String[] args) {
        // 创建员工
        EmployeeWithoutComposite employee1 = new EmployeeWithoutComposite("Alice", "Developer");
        EmployeeWithoutComposite employee2 = new EmployeeWithoutComposite("Bob", "Designer");

        // 创建部门，并添加员工
        DepartmentWithoutComposite developmentDepartment = new DepartmentWithoutComposite("Development");
        developmentDepartment.addMember(employee1);
        developmentDepartment.addMember(employee2);

        // 创建更复杂的组织结构
        EmployeeWithoutComposite employee3 = new EmployeeWithoutComposite("Charlie", "Manager");
        DepartmentWithoutComposite managementDepartment = new DepartmentWithoutComposite("Management");
        managementDepartment.addMember(employee3);
        managementDepartment.addDepartMent(developmentDepartment);

        DepartmentWithoutComposite company = new DepartmentWithoutComposite("Company");
        company.addDepartMent(managementDepartment);

        // 显示整个组织结构
        company.display();
    }
}
