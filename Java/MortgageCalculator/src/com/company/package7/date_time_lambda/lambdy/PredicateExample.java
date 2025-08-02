package com.company.package7.date_time_lambda.lambdy;

import com.company.package7.date_time_lambda.lambdy.objects.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Animal> list = animal -> animal.isCanFly();

        List<String> cities = new ArrayList<>();
        cities.add("Warszawa");
        cities.add("Sopot");
        cities.add("Szczecin");
        cities.removeIf(city -> city.charAt(0) == 'S');
        System.out.println(cities);

    }


}

//public interface Predicate<T> {
//    boolean test(T t);
//}
