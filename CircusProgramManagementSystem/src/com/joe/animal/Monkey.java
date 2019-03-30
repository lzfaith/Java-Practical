package com.joe.animal;

public class Monkey extends Animal implements IAct{
    private String type;

    /**
     * Constructor
     * @param name: monkey's name
     * @param age: monkey's age
     * @param type; monkey's type
     */
    public Monkey(String name, int age, String type){
        this.setAge(age);
        this.setName(name);
        this.setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢模仿人的动作表情");

    }

    @Override
    public void skill() {
        System.out.println("技能：骑独轮车过独木桥");

    }

    @Override
    public void act() {
        String str = "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁" + "\n品种：" + this.getType();
        System.out.println(str);
        skill();
        love();
    }
}
