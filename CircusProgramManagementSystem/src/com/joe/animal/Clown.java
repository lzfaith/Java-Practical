package com.joe.animal;

public class Clown extends Animal implements IAct{

    /**
     * Constructor
     * @param name: clown's name
     * @param age: clown's age
     */
    public Clown(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public void dress(){
        System.out.println("着装：身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆");
    }
    @Override
    public void love() {

    }

    @Override
    public void skill() {
        System.out.println("技能：脚踩高跷，进行杂技魔术表演");

    }

    @Override
    public void act() {
        String str = "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁";
        System.out.println(str);
        dress();
        skill();

    }


}
