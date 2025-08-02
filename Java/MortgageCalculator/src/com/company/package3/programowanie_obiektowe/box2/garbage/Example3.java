package com.company.package3.programowanie_obiektowe.box2.garbage;

public class Example3 {
    public static void main(String[] args) {
        String a = "methodChaining";
        String newA = a.replace("th", "ht").replace("Ch","CY").replace("me","ng");

                            // można tak zrobić dzieki "return this" w seterach w klasie Dog
        Dog dog = new Dog().setName("Robert").setColor("Red").setAge("16").setHoursOfSleeping("76");
        System.out.println(dog);
    }
}
