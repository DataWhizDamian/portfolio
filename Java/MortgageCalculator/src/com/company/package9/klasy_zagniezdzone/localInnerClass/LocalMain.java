package com.company.package9.klasy_zagniezdzone.localInnerClass;

public class LocalMain {

    private String hello = "hello";

    public static void main(String[] args) {

    }

    public void call() {
        final int a = 10;
        final long b = 15;

        class LocalInnerClass {
            public void localInnerCall() {
                System.out.println("LocalInnerCall" + hello);
                someCall();

                System.out.println();

                System.out.println("a = " + a);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.localInnerCall();
    }

    public void someCall() {
        System.out.println("someCall");
    }
}
