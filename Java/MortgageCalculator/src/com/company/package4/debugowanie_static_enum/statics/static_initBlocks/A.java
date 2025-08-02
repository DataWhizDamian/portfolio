package com.company.package4.debugowanie_static_enum.statics.static_initBlocks;

public class A {

    static String staticField1ClassA; // pola static
    static String staticField2ClassA = initStaticField2ClassA();                       //1

    static { //blok inicjalizacyjny static
        System.out.println("1A) staticField1ClassA");                                   //2
        staticField1ClassA = "staticField1ClassA";
    }

    private final String nonStaticField1ClassA; // pola
    private final String nonStaticField2ClassA;
    private final String nonStaticField3ClassA = initField3ClassA();

    { //blok inicjalizacyjny
        System.out.println("2A) nonStaticField2");                                      //6
        nonStaticField2ClassA = "nonStaticField2";
    }

    public A(String nonStaticField1ClassA) { //konstruktor
        System.out.println("3A) this.nonStaticField1ClassA = nonStaticField1ClassA");   //7
        this.nonStaticField1ClassA = nonStaticField1ClassA;
    }

    private static String initStaticField2ClassA() { //metoda
        System.out.println("5A) initStaticField2ClassA");
        return "initStaticField2ClassA";
    }

    private String initField3ClassA() {
        System.out.println("4A) initField3ClassA");                                     //5
        return "initField3ClassA";
    }

    enum EnumExample {
        ENUM
    }
}
