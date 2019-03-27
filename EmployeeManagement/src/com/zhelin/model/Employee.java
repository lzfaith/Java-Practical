package com.zhelin.model;

public class Employee {

    // Employee: Name, Gender, Age and workID
    private String name;
    private String gender;
    private int age;
    private String workID;
    private Departments dept;
    private Duties duty;


    /**
     * Constructor - Employee
     * @param name: Employees' name
     * @param workID: Employees' work ID
     * @param gender: Emloyees' gender
     * @param age: Employees' age
     * @param duty: Employess' duty;
     */
    public Employee(String name, String workID, String gender, int age, Departments dept, Duties duty){
        this.setName(name);
        this.setWorkID(workID);
        this.setGender(gender);
        this.setAge(age);
        this.setDuty(duty);
        this.setDept(dept);

    }


    // Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Gender
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        if(!(gender.equals("男") || gender.equals("女"))){
            this.gender = "男";
        }else {
            this.gender = gender;
        }
    }

    // Age
    public int getAge() {
        return age;
    }
    // Condition: Employee's age only accept range from 18 to 65, otherwise it was 18
    public void setAge(int age) {
        if(age < 18 || age >65){
            this.age = 18;
        }else {
            this.age = age;
        }
    }

    // workID
    public String getWorkID() {
        return workID;
    }
    public void setWorkID(String workID) {
        this.workID = workID;
    }

    // Duty
    public Duties getDuty() {
        return duty;
    }

    public void setDuty(Duties duty) {
        this.duty = duty;
    }

    // Departments
    public Departments getDept() {
        return dept;
    }

    public void setDept(Departments dept) {
        this.dept = dept;
    }

    /**
     * Introduction
     * @return: Employees' name, workID, gender, age, duty and department
     */
    public String introduction(){
        String str = "姓名：" + this.getName() + "\n工号：" + this.getWorkID() + "\n性别：" + this.getGender()
                + "\n年龄：" + this.getAge() + "\n部门：" + this.getDept().getDepartName()
                + this.getDuty().getTitle();

        return str;
    }
}
