package com.company.package5.wyjatki;

public class MySubSubException extends MySubException{
    public MySubSubException() {
        super("My other exception was thrown");
    }

    public MySubSubException(String message) {
        super(message);
    }

    public MySubSubException(String message, Throwable cause) {
        super(message, cause);
    }
}
