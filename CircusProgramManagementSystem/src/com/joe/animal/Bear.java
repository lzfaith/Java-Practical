package com.joe.animal;

public class Bear extends Animal implements IAct {

    /**
     * Constructor
     * @param name: bear's name
     * @param age: bear's age
     */
    public Bear(String name, int age){
        this.setAge(age);
        this.setName(name);
    }
    @Override
    public void love() {
        System.out.println("爱好：喜欢卖萌");

    }

    @Override
    public void skill() {
        System.out.println("技能：挽着花篮，打着雨伞，自立走秀");

    }

    @Override
    public void act() {
        String str = "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁";
        System.out.println(str);
        skill();
        love();
    }
}
