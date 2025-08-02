package com.company.package3.programowanie_obiektowe.box1.initBlocks;

public class Car {
    private String productionYear;

    {
        this.productionYear = "2020";
         printDuringInitBlock();
    }

    public Car() {
        System.out.println(Car.class + " constructor called");
    }

    private void printDuringInitBlock() {
        System.out.println("I'm printing during init block" + Car.class);
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear='" + productionYear + '\'' +
                '}';
    }
}
