package com.joe.animal;

public class Parrot extends Animal implements IAct {
    private String type;

    /**
     * Constructor
     * @param name: parrot's name
     * @param age: parrot's age
     * @param type: parrot's type
     */
    public Parrot(String name, int age, String type){
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
        System.out.println("爱好：喜欢吃坚果和松子");

    }

    @Override
    public void skill() {
        System.out.println("技能：擅长模仿");

    }

    @Override
    public void act() {
        String str = "表演者：" + this.getName()
                + "\n年龄：" + this.getAge()
                + "岁"  + "\n品种："
                + this.getType();
        System.out.println(str);
        skill();
        love();

    }
}
