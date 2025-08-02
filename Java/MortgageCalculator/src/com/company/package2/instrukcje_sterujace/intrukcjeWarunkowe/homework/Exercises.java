package com.company.package2.instrukcje_sterujace.intrukcjeWarunkowe.homework;

public class Exercises {

    public static void main(String[] args) {
        exercise1(1900);
//        exercise2(1,5,3);
//        exercise3(58);
//        exercise4();
//        exercise5();

    }


    private static void exercise1(int year) {
        boolean a = year % 4 == 0;
        boolean b = year % 100 != 0;
        boolean c = year % 400 == 0;
        if ((a && b ) || c) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }
    }

    private static void exercise2(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("a = " + a + " jest największa");
        } else if (b > a && b > c) {
            System.out.println("b = " + b + " jest największa");
        } else if (c > a && c > b) {
            System.out.println("c = " + c + " jest największa");
        }
    }

    private static void exercise3(int liczba) {
        if (liczba % 2 == 0) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }
    }


    private static void exercise4() {
        int month = 20;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28 lub 29 w przestępny");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("nie ma takiego miesiąca");
        }
    }


    private static void exercise5() {

        int month = 3;
        int days = 0;
        switch (month) {
            case 12:
                days = 31;
            case 11:
                days += 30;
            case 10:
                days += 31;
            case 9:
                days += 30;
            case 8:
                days += 31;
            case 7:
                days += 31;
            case 6:
                days += 30;
            case 5:
                days += 31;
            case 4:
                days += 30;
            case 3:
                days += 31;
            case 2:
                days += 28;
            case 1:
                days += 31;
        }
        System.out.println(days);
    }
}
