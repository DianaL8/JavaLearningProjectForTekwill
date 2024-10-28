package com.dianaqa.accessmodifiers.peopleevidence;

public class Person {

    public static boolean isHuman = true;


    public String firstName;

    protected String lastName;

    public final int ID;

    private int age;

    public boolean isRetired;

    public Person(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;

    }

    public Person(String firstName, String lastName, int id, int age, boolean isRetired){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = id;
        if (age > 0 && age < 100){
            this.age = age;
        } else{
            System.out.println("The entered age is not valid, the property age is still empty");
        }


        // this.age = age;
        this.isRetired = isRetired;

    }


    public int getAge(){
        return this.age;

    }

    public void printRetirementStatus(){
        if (isRetired){
            System.out.println(firstName + "este la pensie");
        } else {
            System.out.println(firstName + " nu este la pensie ");

        }
    }
}
