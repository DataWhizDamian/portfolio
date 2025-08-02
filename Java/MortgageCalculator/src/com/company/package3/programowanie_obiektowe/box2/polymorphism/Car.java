package com.company.package3.programowanie_obiektowe.box2.polymorphism;

public class Car {

    protected String color;

    private Engine engine = new Engine();

    public Car(final String color) {this.color = color;}

    public void describe() { System.out.println("Car color: " + color);}
}
