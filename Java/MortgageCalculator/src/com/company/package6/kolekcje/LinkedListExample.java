package com.company.package6.kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        linkedList.add("Warsaw");
        linkedList.add("Gdańsk");
        linkedList.add("Wrocław");


        System.out.println(linkedList); //wszystkie metody z ArrayListy działają tez w LinkedLiscie + dodatkowe
        linkedList.addFirst("Białystok");//dodaje na początek
        linkedList.addLast("Szczecin"); //dodaje na koniec
        System.out.println(linkedList);

        linkedList.add(2,"Kraków");
        System.out.println(linkedList);
    }
}
