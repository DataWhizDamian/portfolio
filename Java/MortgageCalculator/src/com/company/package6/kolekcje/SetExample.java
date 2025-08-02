package com.company.package6.kolekcje;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Gdańsk");
        set1.add("Wrocław");
        set1.add("Warszawa");
        set1.add("Warszawa");
        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println();


        Set<String> set2 = new HashSet<>();
        set2.add("Gdańsk");
        set2.add("Łódź");
        set2.add("Wrocław");
        set2.add("Warszawa");
        set2.add("Białystok");


//Operacje teoriomnogowościowe
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        Set<String> except = new HashSet<>(set2);
        except.removeAll(set1); //z set1 usuwa te same elementy, które są w set2
        System.out.println(except);
        System.out.println();




        Set<String> setWithCities = new HashSet<>();
        setWithCities.add("Gdańsk");
        setWithCities.add("Kraków");
        setWithCities.add("Wrocław");
        setWithCities.add("Warszawa");
        setWithCities.add("Białystok");
        method(setWithCities);

        ArrayList<String> arrayListWithCities = new ArrayList<>();
        arrayListWithCities.add("Gdańsk");
        arrayListWithCities.add("Kraków");
        arrayListWithCities.add("Wrocław");
        arrayListWithCities.add("Warszawa");
        arrayListWithCities.add("Białystok");
        method(arrayListWithCities);

        LinkedList<String> linkedListWithCities = new LinkedList<>();
        linkedListWithCities.add("Gdańsk");
        linkedListWithCities.add("Kraków");
        linkedListWithCities.add("Wrocław");
        linkedListWithCities.add("Warszawa");
        linkedListWithCities.add("Białystok");
        method(linkedListWithCities);








        Set<String> someSet = new HashSet<>();
        Dog fafik1 = new Dog("Fafik");
        Dog fafik2 = new Dog("Fafik");

        System.out.println(fafik1.equals(fafik2));

        Set<Dog> dogs = new HashSet<>();
        dogs.add(fafik1);
        dogs.add(fafik2);

        System.out.println(dogs); // bez napdisania metody equals() i hashcode() w klasie Dog = wydrukuje 2 razy Fafik



    }

    private static void method(Collection<String> stringSet) { //warto używać w argumentach metody interfejsu a nie konkretnej implementacji
        for (String s : stringSet) {
            System.out.println();
        }
    }
}
