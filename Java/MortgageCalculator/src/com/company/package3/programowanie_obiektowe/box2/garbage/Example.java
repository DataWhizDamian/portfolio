package com.company.package3.programowanie_obiektowe.box2.garbage;

public class Example {
    public static void main(String[] args) {
        Example example = new Example();
        example.method1();



    }

    private void method1() {
        Cat cat = new Cat("Rupert");
        method2();
    }

    private void method2() {
        Cat cat = new Cat("Tadeusz");
        method3();
    }

    private void method3() {
        System.out.println("method3");
    }
}
