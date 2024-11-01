package com.dianaqa.methodstask;

public class Customer {
    private String name;
    private String email;
    private int age;


    public  Customer(String name, String email, int age) {
        this.name = name;
        this.email = email;
        if (age >= 18 && age <= 100) {
            this.age = age;
        }
    }

    public Customer() {
    }

    public void setName(String enteredName) {
        this.name = enteredName;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setAge(int age) {
        if (age > 100 || age < 18) {
            this.age = 0;
            System.out.println("The entered Age is not valid!");
        } else {
            //// (age>=18 && age <=100)
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getTheObjectInformation() {
        return "The Name of customer is [" + this.name +"] with e-mail [" + this.email +"] and the Age [" + this.age + "]";
    }
}