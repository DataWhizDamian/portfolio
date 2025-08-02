package com.company.package3.programowanie_obiektowe.box2.finalKeyword;

public final class Cabriolet extends Car{ //nie można rozszerzyć klasy z final (klasa Immutable - niezmienialna)
                                                 // interface nie może być final

   private boolean roofOpened;

   private String color;

    public Cabriolet(String color, boolean roofOpened) {
        super(color);
        this.roofOpened = roofOpened;
        this.color = color;
    }

    public boolean isRoofOpened() {
       return roofOpened;
   }

   public String getColor() {
        return color;
   }

   public Cabriolet closeTheRoof() {
        return new Cabriolet(this.color,false);
   }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "roofOpened=" + roofOpened +
                ", color='" + color + '\'' +
                '}';
    }
}
