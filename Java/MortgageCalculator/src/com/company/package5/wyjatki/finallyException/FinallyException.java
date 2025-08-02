package com.company.package5.wyjatki.finallyException;

public class FinallyException {
    public static void main(String[] args) {
        try {
            print1();
        } catch (MyException1 myException1) {
            System.out.println("Catching myException1");
//            System.exit(0); //sposób, żeby finally sie nie wywołało
            throw new MyException2("Throwing MyException2"); // rzucam drugi wyjątek
        } finally { // finally zawsze się wywoła
            System.out.println("calling finally");
        }
    }

    private static void print1() throws MyException1 {   //Exception
        System.out.println("print1");
        throw new MyException1("Throwing MyException1");
    }

    private static void print2() {                    //Runtime Exception
        System.out.println("print2");
        throw new MyException2("Throwing MyException2");
    }
}
