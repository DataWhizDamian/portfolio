package com.company.package7.date_time_lambda.lambdy.objects;

import java.util.function.Predicate;

public class PredicateImplementation implements Predicate<Animal> {

    @Override
    public boolean test(Animal animal) {
        return animal.isCanFly();
    }
}
