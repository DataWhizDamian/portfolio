package com.company.package3.programowanie_obiektowe.box2.polymorphism;

public class Cabriolet extends Car {
    public boolean roofOpened;

    public Cabriolet(final String color, final boolean roofOpened) {
        super(color);
        this.roofOpened = roofOpened;
    }

    public boolean isRoofOpened() {return roofOpened;}
    public void setRoofOpened(final boolean roofOpened) {this.roofOpened = roofOpened;}

    @Override
    public void describe() {
        System.out.println("Cabriolet description start");
        super.describe();
        System.out.println("Cabriolet has opened roof: " + roofOpened);
        System.out.println("Cabriolet description end");
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "roofOpened=" + roofOpened +
                ", color='" + color + '\'' +
                '}';
    }
}
