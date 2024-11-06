package com.dianaqa.zooclubservice;

public class Cat extends Animal {


    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Fish food - neam neam ");
    }

    @Override
    public String getName() {
        return "Bla bla bla bla";
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
