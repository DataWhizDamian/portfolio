package com.company.package3.programowanie_obiektowe.box2.polymorphism;

public class Main {
//Polymorphizm (Wielopostaciowość) - zapisywanie jednej funkcji (metody) pod różnymi postaciami
//(podklasy mogą mieć swoje własne zachowania, a mogą jednocześnie dzielić jakieś funkcjonalności z klasy rodzica)

    public static void main(String[] args) {

        Cabriolet cabriolet1 = new Cabriolet("red", true);
        Car cabriolet2 = new Cabriolet("blue", false);
        Object cabriolet3 = new Cabriolet("white", true);

        System.out.println(cabriolet1);
        System.out.println(cabriolet2);
        System.out.println();

        SUV suv1 = new SUV("yellow", 1.89);
        Car suv2 = new SUV("brown", 1.92);
        Object suv3 = new SUV("black", 1.90);


        Car[] arr = new Car[1000];
        for (int i = 0; i< arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = new Cabriolet("",i % 4 == 0);
            } else {
                arr[i] = new SUV("",1 + (double)i / 100);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("iter: " + i);
            arr[i].describe();
        }


        //cabriolet1.describe();
        cabriolet2.describe();
//        cabriolet3.describe();   //klasa Object nie posiada metody describe

        System.out.println();

        //suv1.describe();
        suv2.describe();

        cabriolet1.isRoofOpened();
        suv1.getHeight();



    }
}
