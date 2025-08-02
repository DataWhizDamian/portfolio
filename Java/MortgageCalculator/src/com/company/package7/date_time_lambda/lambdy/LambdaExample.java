package com.company.package7.date_time_lambda.lambdy;

import com.company.package7.date_time_lambda.lambdy.objects.*;

import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {

        List<Animal> animals = List.of(
                new Animal("dog",false, true),
                new Animal("fish",false, false),
                new Animal("bird",true, false)
        );

        //lambda
        print(animals, a -> a.isCanBark());
        print(animals, a -> a.isCanFly());
        print(animals, myVariable -> myVariable.isCanFly());
        System.out.println();

        print(animals, (text, toCheck, printIfFailed) -> {
            if (text.contains(toCheck)) {
                return true;
            } else  {
                System.out.println(printIfFailed);
                return false;
            }
        });
    }

    private static void print(final List<Animal> animals, final Checkable checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)){
                System.out.println(animal);
            }
        }
    }

    private static void print(final List<Animal> animals, final Containable containable) {
        for (Animal animal : animals) {
            if (containable.contains(animal.getName(), "og", "Doesn't contains")){
                System.out.println(animal);
            }
        }
    }
}
