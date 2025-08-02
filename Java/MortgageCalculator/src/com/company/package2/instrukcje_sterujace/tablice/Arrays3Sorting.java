package com.company.package2.instrukcje_sterujace.tablice;

import java.util.Arrays;

public class Arrays3Sorting {
    public static void main(String[] args) {
        int[] array = {24, 11, 1, 23, 8, 9, 3, 6, 7};
       sorted(array);

//        System.out.println("None sorted array: " + Arrays.toString(array));
//        System.out.println();
////       bubbleSort(array);
//        System.out.println("Sorted array: " + Arrays.toString(array));
    }
    private static void sorted(int[] array) {
        System.out.println("before sorting");
        System.out.println(Arrays.toString(array));

        //.sort(tablica) - sortowanie
        Arrays.sort(array);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(array));

        //.binarySearch(tablica, wartość szukana) - wyszukuje na którym miejscu w tablicy jest dana wartość (liczy od 0)
        //(jeśli jej nie ma to jest to bedzie to indeks na którym powinna znajdować się wartość, ale z minusem i -1)
        System.out.println("BS - wartość 24: " + Arrays.binarySearch(array,24));
    }

    //sortowanie bąbelkowe - np. sprawdza 2 indexy tablicy 0 i 1 (0 = 10, 1 = 2)
    //jeśli liczba na indexie 0 jest większa od liczby na indexie 1 to zamieniają się miejscami
    private static void bubbleSort(int[] array) {
        int size = array.length;
        for(int i = 0; i < size; i++) {
            for (int j = 1; j< (size - i); j++) {
                if (array[j - 1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    System.out.println("Swap: " + Arrays.toString(array));
                } else {
                    System.out.println("Don't Swap: " + array[j-1] + " and " + array[j]);

                }
            }
            System.out.println(i + "i iteration: " + Arrays.toString(array));
            System.out.println();
        }
    }
}
