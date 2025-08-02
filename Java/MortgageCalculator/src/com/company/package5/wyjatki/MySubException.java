package com.company.package5.wyjatki;

public class MySubException extends MyException{
    public MySubException() {
        super("My other exception was thrown");
    }

    public MySubException(String message) {
        super(message);
    }

    public MySubException(String message, Throwable cause) {
        super(message, cause);
    }
}
