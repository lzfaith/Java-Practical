package com.zhelin.test;

import com.zhelin.model.Departments;
import com.zhelin.model.Duties;
import com.zhelin.model.Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        Duties d1 = new Duties("经理", "D01");
        Duties d2 = new Duties("助理", "D02");
        Duties d3 = new Duties("职员", "D03");
        Departments p1 = new Departments("人事部", "R");
        Departments p2 = new Departments("市场部", "S");
        Employee e1 = new Employee("张铭", "S001", "男", 29, p1, d1);
        Employee e2 = new Employee("李艾爱", "S002", "女", 21, p1, d2);
        Employee e3 = new Employee("孙超", "S003", "男", 29, p1, d3);
        Employee e4 = new Employee("张美美", "S004", "女", 26, p2, d3);
        Employee e5 = new Employee("蓝迪", "S005", "男", 37, p2, d1);
        Employee e6 = new Employee("米莉", "S006", "女", 24, p2, d3);
        p1.addEmployee(e1);
        p1.addEmployee(e2);
        p1.addEmployee(e3);
        p1.addEmployee(e4);
        p1.addEmployee(e5);
        p1.addEmployee(e6);
        System.out.println(p1.showInfo());
    }
}
