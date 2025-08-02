package com.company.package3.programowanie_obiektowe.box1.wlasciwosciKlasy;

public class Class {
//    public - modifier (modyfikator dostepu)
//    class - class keyword
//    Class - class name (nazwa klasy)
//    {} - brackets
//    body - to co w nawiasach

    private String color;

//    constructor - used for creating an object
//    field (attribute) - variable providing the state of the object
//    method - behaviour of the object


//    method = modifier, returnType, name, arguments, brackets, body
    public String concatenate(String argument1, String argument2) {
        System.out.println(argument1 + argument2);
        return argument1 + argument2;
    }

    public static void main(String[] args) {
//    object - instance of the class, basic unit of OOP
//    objects interacts with each other by methods and have state by fields
//    object has = state, behaviour, identity (uniqueness)
        Class example1 = new Class();
        Class example2 = new Class();
        Class example3 = example2;
        String var1 = "arg1";
        String var2 = "arg2";

        System.out.println(example1 == example2);
        System.out.println(example1 == example3);
        System.out.println(example2 == example3);
    }


}
