package com.company.package3.programowanie_obiektowe.box2.finalKeyword;

public class Car {
    private  String color;

    public Car(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public final void describe() {
        System.out.println("nie można overridować metody final");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }
}
