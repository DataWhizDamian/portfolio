package com.company.package6.kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {

        System.out.println("1) EXAMPLE");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("String" + i);
        }
        System.out.println(list);
        System.out.println();



        System.out.println("2) EXAMPLE");
        List<String> citiesList = new ArrayList<>();

    System.out.println("A)");
        citiesList.add("Warsaw");
        citiesList.add("Gdańsk");
        citiesList.add("Wrocław");
            System.out.println(citiesList);
        citiesList.add(1,"Szczecin");
            System.out.println(citiesList);
        System.out.println();

    System.out.println("B)");
            System.out.println(citiesList.get(0)); //get(<index>)
            System.out.println(citiesList.get(1));
            System.out.println(citiesList.get(2));
            System.out.println(citiesList.get(3));
        System.out.println();

    System.out.println("C)");
            System.out.println(citiesList.size());    //4
            System.out.println(citiesList.isEmpty()); // .isEmpty (czy jest puste?) = false
            System.out.println(citiesList.contains("Szczecin")); //.contains(<wartość>) - czy lista zawiera <wartość> = true
        System.out.println();


    System.out.println("D)");
            System.out.println(citiesList.indexOf("Wrocław"));//na którym indeksie jest "Wrocław"
        System.out.println();

    System.out.println("E)");
        String[] array = citiesList.toArray(new String[0]); //tablica typu, który jest przeze mnie oczekiwany
            System.out.println(Arrays.toString(array));
        System.out.println();


    System.out.println("F)");
        String remove = citiesList.remove(1); //usunięcie elementu z indexem 1
            System.out.println(citiesList.remove("Wrocław")); //usunięcie elementu "Wrocław" (true jeśli taki objekt istnieje lub false gdy nie istnieje)
            System.out.println(citiesList);
        citiesList.clear(); //wyczyszczenie listy
            System.out.println(citiesList);
    }
}
