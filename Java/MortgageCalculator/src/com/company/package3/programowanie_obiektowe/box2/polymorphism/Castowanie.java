package com.company.package3.programowanie_obiektowe.box2.polymorphism;

public class Castowanie {
    public static void main(String[] args) {
        Car car = new Cabriolet("",true);

        Cabriolet cabriolet = (Cabriolet) car; //castowanie
        System.out.println(cabriolet.isRoofOpened());
        System.out.println(cabriolet == car);

//      <obiekt> instanceof <klasa>   -->  Sprawdza czy obiekt stanowi instancje określonej klasy
        if (car instanceof SUV) {
            SUV cabriolet1 = (SUV) car;
        } else {
            Cabriolet cabriolet1 = (Cabriolet) car;
        }


    }
}
