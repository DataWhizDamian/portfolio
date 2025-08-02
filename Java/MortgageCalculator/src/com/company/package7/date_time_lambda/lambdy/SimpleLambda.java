package com.company.package7.date_time_lambda.lambdy;

public class SimpleLambda {

    public static void main(String[] args) {
        // opcja BEZ lambdy
        SomeFunctionalInterface sfi1 = new SomeImplementingObject(); //musimy tworzyć klase, która implementuje interface
        boolean someVariable1 = sfi1.someMethod("fafik");
        System.out.println(someVariable1);



        // opcja z lambdą
        SomeFunctionalInterface sfi2 = someInput -> "zajavka".equals(someInput); //nie potrzebna klasa, która implementuje interface
        boolean someVariable2 = sfi2.someMethod("zajavka");
        System.out.println(someVariable2);
    }
}
