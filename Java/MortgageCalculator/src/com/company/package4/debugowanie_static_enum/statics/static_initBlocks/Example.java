package com.company.package4.debugowanie_static_enum.statics.static_initBlocks;

public class Example {
    public static void main(String[] args) {

        B b1 = new B("nonStaticField1ClassA1", "nonStaticField1ClassB1");
        System.out.println();
        B b2 = new B("nonStaticField1ClassA2", "nonStaticField1ClassB2");
        System.out.println();
        B b3 = new B("nonStaticField1ClassA2", "nonStaticField1ClassB2");
//kontekst statyczny jest wywołany tylko raz dla wszystkich obiektów (ponieważ przynależy do klasy)


//kolejność wywołania    ==      Preferences --> Editor --> Code Style --> Java --> Arrangement
        //1) FIELD = public/protected/package private/private static final
        //2) FIELD = public/protected/package private/private static
        //3) INITIALIZIER BLOCK = static
        //4) FIELD = public/protected/package private/private final
        //5) FIELD = public/protected/package private/private
        //6) FIELD
        //7) INITIALIZIER BLOCK
        //8) CONSTRUCTOR
        //9) METHOD = static
        //10) METHOD
        //11) ENUM
        //12) INTERFACE
        //13) CLASS (klasa zagnieżdzona) = static
        //14) CLASS (klasa zagnieżdżona)


//cmd + option + shift + l  =  reformat file (optymalizacja importów, clean code, zmiana kolejności kodu według domyślnej)
    }
}
