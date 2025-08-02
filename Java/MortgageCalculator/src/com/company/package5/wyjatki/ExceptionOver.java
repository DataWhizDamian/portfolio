package com.company.package5.wyjatki;

import java.io.IOException;

public class ExceptionOver implements MyInterface{
    public static void main(String[] args) {
        ExceptionOver examples = new ExceptionOver();

    }


    @Override
    public void myMethod() throws MySubException, NumberFormatException {

    }
}
