package com.dianaqa.classesandobjects.autoservicetask;

public class ManageAutoService {

    public static void main(String[] args) {

        Car car0001 = new Car( "Q5","Audi", "Black");
        Car car0002 = new Car( "508", "Peugeot","Grey");

        System.out.println(car0002.make + " " + car0002.model + " " + car0002.color + " " + car0002.plateNumber);

        Car car00003 = new Car("BMW", "X5", "White", "BOSS 007", 10200);
        Car car00004 = new Car("BMW", "X3", "Red", "NOI 02", 11700);

        Tool tool001 = new Tool("Hammer", 2);
        System.out.println("The name of the tool is: " + tool001.name + " and its weight is: " + tool001.weight + "kg");

        System.out.println(tool001);


        Garage garage0001 = new Garage();
        System.out.println(garage0001.name + " on address " + garage0001.address);
        garage0001.name = "Auto-Detailing";
        System.out.println(garage0001.name + " on address " + garage0001.address);
        garage0001.address = "Stefan cel Mare 132";
        System.out.println(garage0001.name + " on address " + garage0001.address);

        Worker worker001 = new Worker();
        System.out.println(worker001.name);
        worker001.name = "Radu";
        worker001.salary = 50000;
        worker001.age = 18;
        System.out.println(worker001.name);
        System.out.println(worker001.age);
        System.out.println(garage0001.name);

    }
}
