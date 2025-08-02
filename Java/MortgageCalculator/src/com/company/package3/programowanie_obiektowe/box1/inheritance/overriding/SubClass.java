package com.company.package3.programowanie_obiektowe.box1.inheritance.overriding;

public class SubClass extends SuperClass{
    //Overriding - nadpisywanie metody nadrzędnej z klasy bazowej    (cmd + u - przejscie do metody nadrzędnej z klasy bazowej)

//    @Override
    private String privateMethod() {
        return "SubClass privateMethod";
    }

    protected String protectedMethod() {
        return "SubClass potectedMethod";
    }

    String defaultMethod() {
        return "SubClass defaultMethod";
    }

    @Override
    public String publicMethod() {
        return "SubClass publicMethod";
    }
}
