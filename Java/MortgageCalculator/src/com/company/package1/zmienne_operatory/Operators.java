package com.company.package1.zmienne_operatory;

public class Operators {

    public static void main(String[] args) {


        Operators operators = new Operators();
//        operators.simple();
//        operators.devision();         //dzielenie
//        operators.modulus();          //Reszta z dzielenia
//        operators.logicalOperators(); //Operatory logiczne
//        operators.increment();        //Przyrost
//        operators.decrement();        //ubytek
        operators.assigmentOperators();

    }

    private void simple() {                                         //podstawowe
        int a = 10 - 5;
        int b = 10 + 5;
        int c = 10 * 5;
        int d = 10 / 5;
        int e = a + b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
    }

    private void devision() {                                       //dzielenie
        int a = 4 / 3;              //1           (false)
        double b = 4 / 3;           //1.0         (false)
        double c = (double) 4 / 3;     //1.333333333 (true)
        double d = (double) (4 / 3);   //1.0         (false)
        double e = 4 / (double) 3;     //1.333333333 (true)

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
    }

    private void modulus() {                                        // reszta z dzielenia
        int a = 4 % 3;    //3  reszta - 1 (4/3)
        int b = 11 % 3;   //9  reszta - 2 (11/3)
        int c = b % b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

    private void logicalOperators() {                                //operatory logiczne (tylko booleanów)
        boolean a = 1 > 2;
        boolean b = 3 != 2;
        System.out.println("a && b: " + (a && b));  //koniunkcja
        System.out.println("a || b: " + (a || b));  //alternatywa
        System.out.println("a ^ b: " + (a ^ b));    //alternatywa wykluczająca (tylko jedno z dwojga jest prawdziwe)
        System.out.println("!a: " + !a);

        boolean c = firstBooleanProvider();  //prawda
        boolean d = secondBooleanProvider(); //fałsz
        boolean e = thirdBooleanProvider();  //prawda
        System.out.println("(c & d) | e = " + ((c & d) & e));
        System.out.println("(c | d) & e = " + ((c | d) & e));
        System.out.println("(c ^ d) & e = " + ((c ^ d) & e));
    }

    private static boolean firstBooleanProvider() {
        System.out.println("firstBooleanProvider");
        return true;

    }

    private static boolean secondBooleanProvider() {
        System.out.println("secondBooleanProvider");
        return false;
    }

    private static boolean thirdBooleanProvider() {
        System.out.println("thirdBooleanProvider");
        return true;
    }



    private void increment() {                                          //Przyrost
        int a = 1;
        a++;  //a = a + 1
        System.out.println("a = " + a);
        System.out.println("a = " + a++);
        System.out.println("a = " + a);

        int b = 1;
        ++b;  //b = b + 1
        System.out.println("b = " + b);
        System.out.println("b = " + ++b);
        System.out.println("b = " + b);
    }
    private void decrement() {                                          //Ubytek
        int a = 1;
        a--;  //a = a + 1
        System.out.println("a = " + a);
        System.out.println("a = " + a--);
        System.out.println("a = " + a);

        int b = 1;
        --b;  //b = b + 1
        System.out.println("b = " + b);
        System.out.println("b = " + --b);
        System.out.println("b = " + b);
    }

    private void assigmentOperators() {
        int a = 1;
        int b = 2;
        a += 2;  //a = a + 2
        b = + 3;  //b = 3
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = 1;
        int d = 2;
        c -= 2;  //c = c - 2
        d = - 3;  //d = - 3
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int e = 1;
        int f = 2;
        e *= 2;  //e = e * 2
//        f =* 3;  //f = f * 3   NIE da się
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        int g = 1;
        int h = 2;
        g /= 2;  //g = g / 2
//        h =/ 3;  //h = h / 3   NIE da się
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        int i = 1;
        int j = 2;
        i %= 2;  //i = i % 2
//        j =% 3;  //j = j % 3   NIE da się
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

}
