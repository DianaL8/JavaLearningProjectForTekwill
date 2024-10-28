package com.dianaqa.accessmodifiers;

import com.dianaqa.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person ion001 = new Person("Ion","Busuioc", "678453");
        System.out.println(ion001.ID);
        System.out.println(ion001.getAge());

        Person olga001 = new Person("Olga","Grozavu", 7865433, "18", false);
        System.out.println(olga001.getAge());

        Person person001 = new Person("Valoare", "Valoare", 678229, 564, true);
        System.out.println(person.getAge());


        if (ion001.isRetired){
            System.out.println(ion001.firstName + "este pensionat");
        } else {
            System.out.println(ion001.firstName + "nu este pensionat");
        }

 //       if (olga001.isRetired){
        //       System.out.println(olga001.firstName + "este pensionat");
  //      } else {
  //          System.out.println(olga001.firstName + "nu este pensionat");
   //     }
        ion001.printRetirementStatus();

        olga001.printRetirementStatus();

        person.printRetirementStatus();

        Person.isHuman = false;

    }
}
