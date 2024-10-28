package com.dianaqa.classesandobjects.autoservicetask;

public class Car {

    String plateNumber;

    int kmWhenEnterTheService;

    String color;

    String make;

    String model;

    public Car(String modelOfTheCar, String makeOfTheCar, String colorOfTheCar) {
        color = colorOfTheCar;
        make = makeOfTheCar;
        model = modelOfTheCar;

    }

    public Car(String make, String model, String color, String plateNumber, int km) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.plateNumber = plateNumber;
        kmWhenEnterTheService = km;

        System.out.println("This car object has been created with all te details.");

    }

}
