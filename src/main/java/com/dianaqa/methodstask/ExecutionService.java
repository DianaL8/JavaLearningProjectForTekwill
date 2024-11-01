package com.dianaqa.methodstask;

public class ExecutionService {
    public static void main(String[]  args){

            Customer customer001 = new Customer();
            customer001.setName("Gabriel");
            customer001.setEmail(DataGeneratorUtil.getRandomEmail("gabriel+", "@gmail.com"));
            customer001.setAge(DataGeneratorUtil.getRandomInt(18, 100));

//        System.out.println(customer001.getName());
//        System.out.println(customer001.getEmail());
//        System.out.println(customer001.getAge());


            System.out.println(customer001.getTheObjectInformation());

            Customer customer002 = new Customer("Vasile", DataGeneratorUtil.getRandomEmail("vasile++", "@gmail.com"), DataGeneratorUtil.getRandomInt(18, 100));
            System.out.println(customer002.getTheObjectInformation());

            System.out.println(DataGeneratorUtil.getRandomInt(18)); // pentru  random Age
            System.out.println(DataGeneratorUtil.getRandomString()); // pentru random UUID
            System.out.println(DataGeneratorUtil.getRandomEmail("@gmail.com"));

            System.out.println(DataGeneratorUtil.getRandomEmail("andrei+", "@gmail.com"));

        }

    }
