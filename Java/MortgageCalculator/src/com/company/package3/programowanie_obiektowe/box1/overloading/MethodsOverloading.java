package com.company.package3.programowanie_obiektowe.box1.overloading;

public class MethodsOverloading {
//Overloading - duplikat metody tylko, że z listą argumentów, która jest inna

    private void overloadedMethodExample(String arg1, String arg2, String arg3) {
        System.out.println("String arg1 + String arg2 + String arg3: " + arg1 + arg2 + arg3);
    }
    private void overloadedMethodExample(String arg1, String arg2, int arg3) {
        System.out.println("String arg1 + String arg2 + int arg3: " + arg1 + arg2 + arg3);
    }

    private void overloadedMethodExample(String arg1, int arg2) {
        System.out.println("String arg1 + int arg2: " + arg1 + arg2);
    }
    private void overloadedMethodExample(int arg1, String arg2) {
        System.out.println("int arg1 + String arg2: " + arg1 + arg2);
    }
    private void overloadedMethodExample(int arg1, int arg2) {
        System.out.println("int arg1 + int arg2: " + arg1 + arg2);
    }
    private void overloadedMethodExample(float arg1, float arg2) {
        System.out.println("float arg1 + float arg2: " + arg1 + arg2);
    }


    //INVALID (muszą być różne typy metody a nie argumenty)
//    private void overloadedMethodExample(int anotherArg1, String anotherArg2) {
//        System.out.println("int anotherArg1 + String " + anotherArg1 + anotherArg2);
//    }


//    private int overloadedMethodExample(int arg1, int arg2) {
//        return arg1 + arg2;
//    }

//    private String overloadedMethodExample(int arg1, int arg2) {
//        return " " + arg1 + arg2;
//    }

}
