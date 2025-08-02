package com.company.package5.wyjatki.homework;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
//        exercise2();
//        exercise3();
    }


//1. Stwórz swój własny checked exception.
// Zdefiniuj konstruktor, który pozwala przekazać wiadomość na etapie tworzenia wyjątku.
// Stwórz metodę, która go wyrzuci. Następnie obsłuż ten wyjątek w bloku try-catch-finally.
// W catch, wydrukuj StackTrace na ekranie.

    private static void exercise1() {
        Exercises exercises = new Exercises();
        try {
            exercises.exceptionThrowing();
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Calling finally");
        }
    }

    private void exceptionThrowing() throws MyException{
        throw new MyException("Throwing my own Exception");
    }




//2. Stwórz metodę, która przyjmuje wiek na wejściu.
// Napisz walidację, która sprawdza czy podany wiek jest większy niż 21, jeżeli nie jest, wyrzuć wyjątek checked.
// Następnie stwórz kolejną metodę np. wrapper,
// która w bloku try-catch złapie ten wyjątek i zredeklaruje go jako runtime.
// Wywołaj metodę wrapper.
// Zwróć uwagę, że jeżeli wrapowanie w RuntimeException zamieniłbyś na wrapowanie w Exception,
// to ten nowy wyjątek musiałbyś albo obsłużyć (try-catch), albo zadeklarować, że metoda wrapper go wyrzuci.

    private static void exercise2() {wrapper();}

    private static void wrapper() {
        Exercises exercises = new Exercises();
        try {
            exercises.ageValidator(21);
        } catch (MyOwnException e) {
            throw new RuntimeException(e);
        }
    }

    private void ageValidator(int age) throws MyOwnException {
        if (age < 21) {
            throw new MyOwnException("Age is below 21");
        }
    }





//3. Stwórz wyjątek rozszerzający stworzony przez Ciebie wyjątek w ćwiczeniu pierwszym.
// Stwórz metodę deklarującą wyrzucenie Exception, ale go z niej nie wyrzucaj.
// Następnie obsłuż tę metodę w bloku try-catch, przy czym dodaj kilka catchy (multicatch)
// tak, aby obsłużyć oddzielnie Twój nowo stworzony wyjątek, wyjątek z ćwiczenia pierwszego oraz Exception.

    private static void exercise3() {
        Exercises exercises = new Exercises();
        try {
            exercises.throwingMethod();
        } catch (MyNextOwnException e) {
            System.out.println("Throwing MyNextOwnException");
        } catch (MyOwnException e) {
            System.out.println("Throwing MyOwnException");
        } catch (Exception e) {
            System.out.println("Throwing Exception");
        }
    }

    private void throwingMethod() throws Exception{

    }
}







