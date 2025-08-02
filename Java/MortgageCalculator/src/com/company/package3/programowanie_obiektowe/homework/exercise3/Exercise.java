package com.company.package3.programowanie_obiektowe.homework.exercise3;

import java.util.Arrays;

public class Exercise {
/* Napisz klasę Square reprezentującej kwadrat, w której zawrzesz 2 konstruktory, jeden domyślny,
 gdzie bok kwadratu będzie wynosił 5.
 Drugi, w którym użytkownik może określić tę wartość.
 Do tego dodaj getter oraz setter. Pamiętaj o enkapsulacji.
 Dodaj metodę liczącą obwód i metodę liczącą pole kwadratu. Nadpisz metodę equals.vNadpisz metodę toString.

 Użyj następnie tej klasy, aby stworzyć kilka kwadratów o różnych bokach i umieścić je w tablicy.
 Dodaj parę zduplikowanych kwadratów.
Następnie wykorzystując algorytm do usuwania duplikatów, który napisałeś w zadaniach z tablicami,
usuń zduplikowane kwadraty z tablicy.
(Algorytm zakładał sortowanie elementów, załóż, że porównywać kwadraty,
który jest większy, a który mniejszy będziemy po jego polu powierzchni).
 */
public static void main(String[] args) {
    exercise3();
}


private static void exercise3()  {

    Square[] squares = new Square[] {
            new Square(2),
            new Square(3),
            new Square(2),
            new Square(5),
            new Square(6),
            new Square(6),
            new Square(3),
            new Square(),
            new Square()
    };
    System.out.println(Arrays.toString(squares));
    Square[] deduplicate = deduplicate(squares);
    System.out.println(Arrays.toString(squares));
}

private static Square[] deduplicate(Square[] arr) {
    sort(arr);
    int sizeOfNonDuplicates = 1;
    for (int i = 0; i < arr.length - 1 ; i++) {
        if (!arr[i].equals(arr[i+1])) {
           sizeOfNonDuplicates++;
        }
    }

    int length = arr.length;
    Square[] temp = new Square[sizeOfNonDuplicates];
    int j = 0;
    for (int i = 0; i< length - 1; i++) {
        if (!arr[i].equals(arr[i+1])) {
            temp[j++] = arr[i];
        }
    }
    temp[j] = arr[length - 1];
    return temp;


}

    private static void sort(final Square[] arr) {
    Square temp;
    for (int i = 0; i< arr.length; i++) {
        for (int j = i + 1; j<arr.length; j++ ) {
            if (arr[i].pole() > arr[j].pole()) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    }
}

