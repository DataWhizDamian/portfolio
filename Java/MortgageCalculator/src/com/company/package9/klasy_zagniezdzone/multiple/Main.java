package com.company.package9.klasy_zagniezdzone.multiple;

public class Main {

    public static void main(String[] args) {
        AnotherClassInTheSameFile1 anotherClassInTheSameFile1 = new AnotherClassInTheSameFile1();
        anotherClassInTheSameFile1.call();
    }

}

class AnotherClassInTheSameFile1 {

    public void call() {
        System.out.println("AnotherClassInTheSameFile1");
    }
}

class AnotherClassInTheSameFile2 {

    public void call() {
        System.out.println("AnotherClassInTheSameFile2");
    }
}
