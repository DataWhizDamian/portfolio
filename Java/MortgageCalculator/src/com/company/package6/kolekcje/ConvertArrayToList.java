package com.company.package6.kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

    public static void main(String[] args) {
        //tablica --> lista
        Integer[] array = {1,3,5,6};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));

        //lista --> tablica
        Integer[] objects = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(objects));
    }
}
