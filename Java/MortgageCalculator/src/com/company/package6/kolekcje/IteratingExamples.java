package com.company.package6.kolekcje;

import java.util.*;

public class IteratingExamples {

    public static void main(String[] args) {
        List<String> listWithCities = new ArrayList<>();
        listWithCities.add("Warszawa");
        listWithCities.add("Gdańsk");
        listWithCities.add("Łódź");
        listWithCities.add("Wrocław");

    System.out.println("1) LOOP For each:");
        for (String listWithCity : listWithCities) {
            System.out.println(listWithCity);
        }
        System.out.println();


    System.out.println("2) LOOP For:");
        for (int i = 0; i < listWithCities.size(); i++) {
            System.out.println(listWithCities.get(i));
        }
        System.out.println();


    System.out.println("3) ITERATOR:");
        Iterator<String> iterator = listWithCities.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();


    System.out.println("4) LIST ITERATOR:");
        ListIterator<String> stringListIterator = listWithCities.listIterator();
        while(stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }
        while(stringListIterator.hasPrevious()) { //iterowanie od tyłu
            System.out.println(stringListIterator.previous());
        }
        System.out.println();
        System.out.println();







        Set<String> setWithCities = new HashSet<>();
        setWithCities.add("Warszawa");
        setWithCities.add("Gdańsk");
        setWithCities.add("Łódź");
        setWithCities.add("Wrocław");

    System.out.println("5) LOOP For each:");
        for (String setWithCity : setWithCities) {
            System.out.println(setWithCity);
        }
        System.out.println();

    System.out.println("6) LOOP For - nie działa, bo Set nie ma metody get (elementy w setcie nie zachowują kolejności)");
//        for (int i = 0; i< setWithCities.size(); i++) {
//
//        }
        System.out.println();

    System.out.println("7) ITERATOR:");
        Iterator<String> iterator1 = setWithCities.iterator();
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println();
        System.out.println();







        Map<String, String> cars = new HashMap<>();
        cars.put("Volvo", "XC60");
        cars.put("Fiat", "Panda");
        cars.put("Volkswagen", "Golf");

    System.out.println("8) LOOP For each");
        for (String s : cars.keySet()) { //w Mapach można iterować po kluczach - keySet(), wartosciach - values() lub entry entrySet()
            System.out.println(s);
        }
        System.out.println();

        for (Map.Entry<String, String> stringStringEntry : cars.entrySet()) {
            System.out.println(stringStringEntry);
        }
        System.out.println();


    System.out.println("9) LOOP For = nie działa - null");
        for(int i = 0; i< cars.size(); i++) {
            System.out.println(cars.get(1));
        }
        System.out.println();


    System.out.println("10) ITERATOR");
        Iterator<Map.Entry<String, String>> iterator2 = cars.entrySet().iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println();


    }
}
