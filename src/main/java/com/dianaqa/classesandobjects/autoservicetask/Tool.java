package com.dianaqa.classesandobjects.autoservicetask;

public class Tool {

    String name;

    double price;

    double weight;

    public Tool(String nameOfTheTool, double weight);{
        name = nameOfTool;
        this.weight = weight;

        System.out.println("The tool has been created");
    }

    public Tool(String name, double price, double weight){
        this.name = name;
        this.price = price;
        this.weight = weight;

    }

}
