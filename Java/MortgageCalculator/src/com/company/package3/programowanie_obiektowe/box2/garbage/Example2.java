package com.company.package3.programowanie_obiektowe.box2.garbage;

public class Example2 {



    public static void main(String[] args) {
        Cat cat1 = new Cat("Roman");
        Cat cat2 = new Cat("Tomasz");

        cat1 = null;
        cat2 = null;

        System.gc();

    }
}
