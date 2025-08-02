package com.company.package1.zmienne_operatory.homework_operatory;

public class Exercises {

    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
        exercise4();
//        exercise5();

    }

//1. Napisz metodę, która przyjmuje 2 liczby double, wydrukuje ich sumę, różnicę, iloczyn oraz iloraz.
    private static void exercise1() {
        double a = 1.5;
        double b = 2.2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }


//2. Napisz program w którym użyjesz operatorów ==, !, !=, ++, -=, *=.
// Na początku masz zadeklarowaną zmienną int x = 0.
// Podczas pisania programu nie możesz zadeklarować żadnej innej zmiennej,
// tzn. przez cały czas pisania programu możesz operować tylko na tej jednej zmiennej.
    private static void exercise2() {
        int x = 0;
        System.out.println(x == 0);
        System.out.println(x != 0);
        System.out.println(x++);
        System.out.println(x*=5);
        System.out.println(x-=3);
    }


//3. Napisz program, w którym zaczynając od zmiennej byte x = 0,
// będziesz mógł otrzymać int, long, float oraz double stosując promocję numeryczną.
    private static void exercise3() {
        byte x = 0;
        int a = x + 1;
        long b = x + 2L;
        float c = x + 1.7f;
        double d = x + 0.2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }


//4. Rafał ma 6 kolorowych mazaków (czerwony, zielony, niebieski, czarny, żółty i brązowy)
// i rysuje nimi w podanej kolejności kolorów 100 kresek.
// Jaki kolor będzie miała ostatnia kreska? Napisz program, który to policzy.
    private static void exercise4() {
        int brown = 0;
        int red = 1;
        int green = 2;
        int blue = 3;
        int black = 4;
        int yellow = 5;


        int x = 100 % 6;
        System.out.println(x);
    }

//5. Napisz metodę, która jako argument przyjmuje liczbę i wydrukuje informację czy metoda jest podzielna przed 3,
// przez 7 oraz przez 3 i 7 jednocześnie
    private static void exercise5() {
        checkingMath(1);
        checkingMath(3);
        checkingMath(9);
        checkingMath(21);
    }

    private static void checkingMath(int number) {
        boolean division3 = number % 3 == 0;
        boolean division7 = number % 7 == 0;
        boolean divisionBoth = division3 && division7;
        System.out.println("Liczba " + number + " podzielna przez 3? " + division3);
        System.out.println("Liczba " + number + " podzielna przez 7? " + division7);
        System.out.println("Liczba " + number + " podzielna przez 3 i 7? " + divisionBoth);

    }
}
