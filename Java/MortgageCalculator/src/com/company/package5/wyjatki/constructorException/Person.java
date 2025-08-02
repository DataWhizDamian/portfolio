package com.company.package5.wyjatki.constructorException;

public class Person {
    private int age;

    //exception init block
    {
        this.age = 12;
        System.out.println("init block start");
        if (age == 12) {
            throw new WrongAgeException("block what is this dude?");
        } else {
            System.out.println("Valid age in init block");
        }
        System.out.println("init block end");
    }

    public Person() throws WrongAgeException {

    }

    public Person(int age) throws WrongAgeException{
        System.out.println("Person constructor begining");
        if (age > 0 && age < 120) {
            this.age = age;
            System.out.println("Person constructor being fine!");
        } else {
            System.out.println("Person constructor throwing exception");
            throw new WrongAgeException("What is this dude?");
        }
        System.out.println("Person constructor ending");
    }

}
