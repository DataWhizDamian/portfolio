package com.company.package4.debugowanie_static_enum.statics.static_inheritance;

public class Example {
    public static void main(String[] args) {
        System.out.println("1) metoda STATYCZNA");  //metoda statyczna NIE moze wywołać metody instancyjnej
//odwołuję się do klasy
        B b = new B();
        B.printB(); // printA() lub printB() = (dostępne printA() bo B dziedziczy A)

    //A = klasa ; B() = obiekt
        A ab = new B();
        A.printA();  // printA()


        System.out.println();


// odwołuję się do obiektu
        System.out.println("2) metoda INSTANCYJNA");  //metoda instancyjna może wywołać metode statyczną
        B2 b2 = new B2();
        b2.print();

        A2 ab2 = new B2();
        ab2.print();







    }
}
