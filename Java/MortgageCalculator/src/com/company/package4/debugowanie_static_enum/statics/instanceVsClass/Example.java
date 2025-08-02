package com.company.package4.debugowanie_static_enum.statics.instanceVsClass;

public class Example {
    public static void main(String[] args) {
        System.out.println("1) STATIC");                    //zmienna statyczna
        Car car1 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);
        Car car2 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);
        Car car3 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);
        Car car4 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);
        Car car5 = new Car();
        System.out.println(Car.staticNumberOfCarsCreated);

        System.out.println();

        System.out.println("2) BEZ STATIC");                //zmienna instancyjna (instance variable)
        System.out.println(car1.numberOfCarsCreated);
        System.out.println(car2.numberOfCarsCreated);
        System.out.println(car3.numberOfCarsCreated);
        System.out.println(car4.numberOfCarsCreated);
        System.out.println(car5.numberOfCarsCreated);




    }
}
