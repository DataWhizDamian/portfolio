package com.company.package6.kolekcje;

import java.util.Hashtable;
import java.util.Vector;

public class Basics {
    public static void main(String[] args) {
        // kolekcje = sposób grupowania obiektów, implementacje struktur danych (aby móc przechowywać w jednym miejscu ileś danych)
        Object[] arr = new Object[10];
        arr[0] = "string";

        Vector<Integer> vector = new Vector<>(); //klasa Vector służy do dynamicznego przechowywania elementów jakie są zdefiniowane
        vector.addElement(1);

        Object a = vector.get(0);
        Object b = vector.get(1);


//klasa Hashtable - tablica z haszowaniem (implementacja matematycznej struktury danych) = pojemniki, w których przechowywane są pary klucz/wartość
        Hashtable hashtable = new Hashtable();
        hashtable.put("Robert-Nowak", 12);
        hashtable.put("Robert-Tarczyński", 16);
        hashtable.put("Agnieszka", 15);
        hashtable.put("Stefan", 17); //Stefan = klucz | 15 = wartość 
        Object o = hashtable.get("Robert-Tarczyński");
        System.out.println(o);

    }
}
