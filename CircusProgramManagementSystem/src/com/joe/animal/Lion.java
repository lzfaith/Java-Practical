package com.joe.animal;

public class Lion extends Animal implements IAct{
    private String color;
    private String sex;
    /**
     * Constructor
     * @param name: lion's name
     * @param age: lion's age
     */
    public Lion(String name, int age, String color, String sex){
        this.setAge(age);
        this.setName(name);
        this.setColor(color);
        this.setSex(sex);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢吃各种肉类");

    }

    @Override
    public void skill() {
        System.out.println("技能：擅长钻火圈");
    }

    @Override
    public void act() {
        String str = "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁" + "\n性别：" + this.getSex()
                     + "\n毛色：" + this.getColor();
        System.out.println(str);
        skill();
        love();

    }
}
