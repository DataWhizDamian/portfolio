package com.company.package5.wyjatki.homework;

public class MyException extends Exception{

    public MyException() {
        super("My exception was thrown");
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
