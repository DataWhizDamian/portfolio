package com.company.package7.date_time_lambda.lambdy.homework;

public class Exercises {

    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
        exercise4();

    }

//1. Stwórz interface funkcyjny z metodą przyjmującą int i zwracającą String.
// Zaimplementuj ten interface przy wykorzystaniu lambdy.
// Spróbuj zapisać lambdę na parę pokazanych sposobów.
    private static void exercise1() {
        FunctionalInterface1 functionalInterface1 = a -> "1) new String";
        FunctionalInterface1 functionalInterface2 = a -> {
            return "2) New String return";
        };

        FunctionalInterface1 functionalInterface3 = (a) -> "3) new String";
        FunctionalInterface1 functionalInterface4 = (int a) -> {
            return "4) new String";
        };

        System.out.println(functionalInterface1.method(1));
        System.out.println(functionalInterface2.method(2));
        System.out.println(functionalInterface3.method(3));
        System.out.println(functionalInterface4.method(4));
    }


//2. Stwórz interface funkcyjny z metodą przyjmującą int i String i zwracającą String.
// Zaimplementuj ten interface przy wykorzystaniu lambdy.
// Spróbuj zapisać lambdę na parę pokazanych sposobów.
    private static void exercise2() {
        FunctionalInterface2 functionalInterface1 = (a, b) -> "1) new String";
        FunctionalInterface2 functionalInterface2 = (a, b) -> {
            return  "2) new String";
        };

        FunctionalInterface2 functionalInterface3 = (int a, String b) -> "3) new String";
        FunctionalInterface2 functionalInterface4 = (int a, String b) -> {
            return  "4) new String";
        };

        System.out.println(functionalInterface1.method(1,"some argument"));
        System.out.println(functionalInterface2.method(1,"some argument"));
        System.out.println(functionalInterface3.method(1,"some argument"));
        System.out.println(functionalInterface4.method(1,"some argument"));
    }



//3. Stwórz interface funkcyjny z metodą przyjmującą int, int oraz String i zwracającą String.
// Zaimplementuj ten interface przy wykorzystaniu lambdy.
// Spróbuj zapisać lambdę na parę pokazanych sposobów.
    private static void exercise3() {
        FunctionalInterface3 functionalInterface1 = (a, b, c) -> "new String";
        FunctionalInterface3 functionalInterface2 = (a, b, c) -> {
            return "new String";
        };
        FunctionalInterface3 functionalInterface3 = (int a, int b, String c) -> "new String";
        FunctionalInterface3 functionalInterface4 = (int a, int b, String c) -> {
            return "new String";
        };

        System.out.println(functionalInterface1.method(1,2,"some argument"));
        System.out.println(functionalInterface2.method(1,2,"some argument"));
        System.out.println(functionalInterface3.method(1,2,"some argument"));
        System.out.println(functionalInterface4.method(1,2,"some argument"));
    }



//4. Dla porównania, zaimplementuj interface z poprzedniego ćwiczenia przy wykorzystaniu klasy implementującej interface a nie lambdy.
    private static void exercise4() {
        ImplementingClassing implementingClassing = new ImplementingClassing();
        String variable = implementingClassing.method(1,2,"some argument");
        System.out.println(variable);

        FunctionalInterface3 functionalInterface = new ImplementingClassing();
        System.out.println(functionalInterface.method(1,2,"some argument"));
    }

}
