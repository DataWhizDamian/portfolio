package com.company.package6.kolekcje;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();
        people.put(1,"Norbert Adamski");
        people.put(2,"Rafał Jakis");
        people.put(3,"Kuba Kędzierski");

        System.out.println(people);

        Map<Integer, String> anotherPeople = new HashMap<>(people); //Mapa na podstawie mapy people
        System.out.println(anotherPeople);
        System.out.println();


        System.out.println("Get key: " + people.get(1)); // wartość pod danym kluczem
        System.out.println("remove key: " + people.remove(1)); //usuwa wartość klucza
        System.out.println(people);
        System.out.println("isEmpty: " + people.isEmpty());
        System.out.println("size: " + people.size());
        System.out.println("containsKey: " + people.containsKey(2));
        System.out.println("containsValue: " + people.containsValue("Rafał Bernandyński"));
        System.out.println();


        Map<Integer, List<String>> people2 = new HashMap<>();
        people2.put(1, List.of("Rafał Bernandyński", "Julia Czaplic", "Łukasz Daniel"));
        people2.put(2, Collections.emptyList());
        people2.put(3, Collections.singletonList("Damian Kędzierski")); //lista z pojedyńczego elementu
        System.out.println(people2);
        System.out.println();

        System.out.println(" Set<Integer>: ");
        Set<Integer> integers = people.keySet();
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println(" Collection<String>: ");
        Collection<String> values = people.values();
        for (String value : values) {
            System.out.println(value);
        }

    }
}
