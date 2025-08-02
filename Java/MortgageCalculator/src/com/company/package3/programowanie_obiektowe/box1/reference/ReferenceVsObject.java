package com.company.package3.programowanie_obiektowe.box1.reference;

public class ReferenceVsObject {
    public static void main(String[] args) {

        Gorilla gorilla1 = new Gorilla("10", "Robert");
        System.out.println(gorilla1.age);
        System.out.println(gorilla1.name);
        System.out.println();


        Monkey gorilla2 = gorilla1;
        Object gorilla3 = gorilla1;

        Gorilla gorilla4 = (Gorilla) gorilla2; //castowanie
        Gorilla gorilla5 = (Gorilla) gorilla3;

        System.out.println(gorilla1 == gorilla3);
        System.out.println(gorilla1 == gorilla4);
    }
}
