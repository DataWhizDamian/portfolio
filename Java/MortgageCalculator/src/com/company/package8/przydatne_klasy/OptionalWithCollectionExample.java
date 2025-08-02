package com.company.package8.przydatne_klasy;

import java.util.List;
import java.util.Optional;

public class OptionalWithCollectionExample {

    public static void main(String[] args) {
        List<String> list = List.of("Brasil", "Denmark", "China", "Poland");
        Optional<String> found = find(list, "Denmark");
        System.out.println(found);


    }

    //bez Optionala
//    private static String find(List<String> countries, String element) {
//        for (String country : countries) {
//            if (element.equals(country)) {
//                return country;
//            }
//        }
//        return null;
//    }

    //z Optionalem
    private static Optional<String> find(List<String> countries, String element) {
        for (String country : countries) {
            if (element.equals(country)) {
                return Optional.of(country);
            }
        }
        return Optional.empty();
    }
}
