package com.company.package5.wyjatki.constructorException;

public class ConstructorExampleException {
//    private long parameter;
//
//    public ConstructorExampleException(long parameter) {
//        if (parameter > 0 && parameter < 10) {
//            this.parameter = parameter;
//        } else {
//            throw new RuntimeException("What is this dude?");
//        }
//    }

    public static void main(String[] args) {
//        ConstructorExampleException exampleException = new ConstructorExampleException(10);
       try {
           Person person = new Man(1000);
       } catch (WrongAgeException e) {
           System.out.println("oooops! Program się wyjebał opie");
           e.printStackTrace();
       }
    }
}
