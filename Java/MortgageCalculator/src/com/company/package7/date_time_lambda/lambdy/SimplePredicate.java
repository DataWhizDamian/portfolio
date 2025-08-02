package com.company.package7.date_time_lambda.lambdy;

import java.util.function.Predicate;

public class SimplePredicate {

    public static void main(String[] args) {
        Predicate<String> somePredicate = someInput -> "zajavka".equals(someInput);
        boolean someBoolean = somePredicate.test("zajavka");
        System.out.println(someBoolean);
    }
}
