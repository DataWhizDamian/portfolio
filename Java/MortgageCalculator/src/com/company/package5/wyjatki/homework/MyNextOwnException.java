package com.company.package5.wyjatki.homework;

public class MyNextOwnException extends MyOwnException{

    public MyNextOwnException() {
        super("MyNextOwnException called");
    }

    public MyNextOwnException(final String message) {
        super(message);
    }
}
