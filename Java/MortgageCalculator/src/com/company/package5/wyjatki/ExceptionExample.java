package com.company.package5.wyjatki;
    //Rodzaje błędów:
//1) Błąd kompilacji
//2) Błąd logiczny
//3) Błąd Exception

public class ExceptionExample {     //Exception (wyjątek) = Błąd
    public static void main(String[] args) throws MyException {
        //1)  za każdym razem chcąc odwołać się do zmiennej, gdy zmienna = null to bedzię "NullPointerException"
//        SomeClass variable = null;
//        String otherVariable = variable.someField;

        //2) index 10 poza granicami dla długości 3 == "ArrayIndexOutOfBoundsException"
//        String[] array = new String[3];
//        System.out.println(array[10]);



        // try {) catch (<rodzaj_błedu>) {}

        try {
            printSomething1("Throw");
        } catch (Exception e) {
//            System.out.println("Exception was thrown: " + e.getMessage());
            e.printStackTrace(); //.printStackTrace – lista wywołań
        }



    }
    private static void printSomething1(final String input) throws MySubException {
            printSomething2(input);
    }

    private static void printSomething2(final String input) throws MySubException {
        try {
            printSomething3(input);
        } catch (Exception e) {
            throw new MySubException("My other exception message", e);
        }
    }
    private static void printSomething3(final String input) throws MyException {
        printSomething4(input);
    }

    private static void printSomething4(final String input) throws MyException {
        if ("Throw".equalsIgnoreCase(input)) {
            throw new MyException("My runtime exception");
        } else {
            System.out.println(input);
        }
    }
}
