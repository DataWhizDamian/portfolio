package com.company.package5.wyjatki.homework;

public class MyOwnException extends Exception{

    public MyOwnException() {
        super("MyOwnException called");
    }

    public MyOwnException(final String message) {
        super(message);
    }
}
