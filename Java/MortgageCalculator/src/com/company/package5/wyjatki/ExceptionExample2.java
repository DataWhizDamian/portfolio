package com.company.package5.wyjatki;


import java.util.Arrays;

public class ExceptionExample2 {
    public static void main(String[] args) throws MyException {

        //Hierarchia = od najbardziej szczegółowego do najbardziej ogólnego
        try {
            printSomething1("Throw");
        } catch (MySubSubException e) {
            System.out.println("MySubSubException caught: " + Arrays.toString(e.getStackTrace()));
        } catch (MySubException e) {
            System.out.println("MySubException caught: " + Arrays.toString(e.getStackTrace()));
        } catch (MyException e) {
            System.out.println("MyException caught: " + Arrays.toString(e.getStackTrace()));
        } catch (Exception e) {
            System.out.println("Exception caught: " + Arrays.toString(e.getStackTrace()));
        } catch (Throwable e) {
            System.out.println("Throwable caught: " + Arrays.toString(e.getStackTrace()));
        }



    }
    private static void printSomething1(final String input) {
            printSomething2(input);
    }

    private static void printSomething2(final String input) {
        try {
            printSomething3(input);
        } catch (Exception e) {
            throw new MySubException("My other exception message", e);
        }
    }
    private static void printSomething3(final String input) {
        printSomething4(input);
    }

    private static void printSomething4(final String input) {
        if ("Throw".equalsIgnoreCase(input)) {
            throw new MyException("My runtime exception");
        } else {
            System.out.println(input);
        }
    }
}
