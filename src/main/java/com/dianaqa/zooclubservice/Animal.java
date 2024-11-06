package com.dianaqa.zooclubservice;

public abstract class Animal implements AnimalInterface{
    private String name;
    private int age;


    public Animal (String name){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();
}
