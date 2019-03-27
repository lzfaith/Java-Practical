package com.zhelin.model;

public class Departments {

    // Department: Name, ID
    private String departName;
    private String departID;
    private Employee[] myEmployee;
    private int humanNum;
    private int marketNum;

    /**
     * Constructor - Departments
     * @param departName: Departments' Name
     * @param departID: Departments' ID
     */
    public Departments(String departName, String departID){
        this.setDepartName(departName);
        this.setDpartID(departID);

    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDpartID() {
        return departID;
    }

    public void setDpartID(String departID) {
        this.departID = departID;
    }

    public Employee[] getMyEmployee() {
        if(this.myEmployee == null){
            this.myEmployee = new Employee[200];
        }
        return myEmployee;
    }

    public void setMyEmployee(Employee[] myEmployee) {
        this.myEmployee = myEmployee;
    }

    public int getHumanNum() {
        return humanNum;
    }

    public void setHumanNum(int humanNum) {
        this.humanNum = humanNum;
    }

    public int getMarketNum() {
        return marketNum;
    }

    public void setMarketNum(int marketNum) {
        this.marketNum = marketNum;
    }

    public void addEmployee(Employee emp){
        /**
         * 1. Save employee in the list
         * 2. Count employee number = employeeNum
         */
        for(int i=0; i<this.getMyEmployee().length; i++){
            if(this.getMyEmployee()[i] == null){
                this.getMyEmployee()[i] = emp;
                if(this.getMyEmployee()[i].getDept().getDepartName().equals("人事部")){
                    this.humanNum += 1;
                }else{
                    this.marketNum +=1;
                }
                return;
            }
        }
    }

    /**
     * Show Employees' information in the same department
     * @return Employees' name, workID, gender, age, duty and department
     */
    public StringBuffer showInfo(){
        StringBuffer buf = new StringBuffer();
        for(int i=0; i<this.getMyEmployee().length; i++){
            if(this.getMyEmployee()[i] != null) {
                buf.append("姓名：" + this.getMyEmployee()[i].getName() + "\n工号：" + this.getMyEmployee()[i].getWorkID()
                        + "\n性别：" + this.getMyEmployee()[i].getGender() + "\n年龄：" + this.getMyEmployee()[i].getAge()
                        + "\n部门：" + this.getMyEmployee()[i].getDept().getDepartName()
                        + this.getMyEmployee()[i].getDuty().getTitle()
                        + "\n=============================================\n");
            }else{
                break;
            }
        }
        buf.append("人事部总共有：" + this.getHumanNum() + "员工\n"
                    + "市场部总共有：" + this.getMarketNum() + "员工");
        return buf;
    }
}
