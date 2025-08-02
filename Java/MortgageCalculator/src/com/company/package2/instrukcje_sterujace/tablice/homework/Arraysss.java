package com.company.package2.instrukcje_sterujace.tablice.homework;

import java.util.Arrays;

public class Arraysss {

    public static void main(String[] args) {
        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        exercise5();
//        exercise6();
//        exercise7();
//        exercise8();
    }

//1. Napisz program, który odwróci zawartość Stringa tyłem do przodu.
    private static void exercise1() {
        String some = "cos";
        char[] arraySome= some.toCharArray();
        System.out.println(Arrays.toString(arraySome));
        System.out.println(arraySome);

        System.out.println();
        System.out.println(reverse(some));
        System.out.println(reverse(arraySome));
    }

    private static String reverse(String input) {
        String result ="";
        for (int index = input.length() - 1; index >= 0; index--) {
            result += input.charAt(index);
        }
        return result;
    }

    private static String reverse(char[] input) {
        String result = "";
        for (int index = input.length - 1; index >= 0; index--) {
            result += input[index];
        }
        return result;
    }


//2. Napisz program, który sprawdzi, czy podany ciąg znaków jest palindromem. Tym razem wykorzystaj tablice.
    private static void exercise2() {
        String sentence = "może jutro ta dama sama da tortu jeżom";
        String bezSpacji = sentence.replace(" ", "");
        String reversed = reverse(bezSpacji);
        if (reversed.equals(bezSpacji)) {
            System.out.println("ZDANIE: " + sentence + " --> jest palindromem");
        } else {
            System.out.println("ZDANIE: " + sentence + " --> NIE jest palindromem");
        }
    }

// 3. Napisz program, który odwróci kolejność elementów w tablicy.
    private static void exercise3() {
        String[] elm = {"pierwszy", "drugi", "trzeci"};
        String[] elmReversed = new String[elm.length];
        int N = elm.length - 1;

        for (int i = N; i >= 0; i--) {
            elmReversed[N - i] = elm[i];
        }
        System.out.println(Arrays.toString(elmReversed));
    }


//4. Napisz program, który znajdzie w tablicy zduplikowane elementy i stworzy z nich tablicę. Kolejność nie ma znaczenia.
    private static void exercise4() {

    }


// 5. Napisz program, który porówna ze sobą zawartość dwóch tablic i wydrukuje na ekranie, czy zawartość jest taka sama.
// Kolejność wejściowa elementów nie ma znaczenia. Liczy się tylko zawartość,
//np. [2, 6, 1, 12] == [12, 6, 1, 2] ale [2, 6, 1, 12] != [12, 6, 1, 3]
    private static void exercise5() {
        int[] arr1 = {2, 6, 1, 12};
        int[] arr2 = {2, 6, 1, 12};
        int[] arr3 = {3, 6, 1, 12};

        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println(equals);
    }


//6. Zamień wszystkie słowa w tablicy tak aby były one w całości napisane z wielkiej litery,
// natomiast reszta literek była już małą literą.
// Postaraj się nie tworzyć żadnych nowych tablic oprócz tej, która zawiera dane wejściowe.
    private static void exercise6() {
        String[] arr = {"GdAńsK", "olSZtyn", "wroCław"};

        for (int i = 0; i < arr.length; i++) {
            String newWord = arr[i].toLowerCase();
            newWord = newWord.replaceFirst(
                    String.valueOf(newWord.charAt(0)),
                    String.valueOf(newWord.charAt(0)).toUpperCase()
            );

            arr[i] = newWord;

        }
        System.out.println(Arrays.toString(arr));
    }



//7. Napisz program, który znajdzie druga największą wartość w tablicy.
    private static void exercise7() { //mojego autorstwa
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,15,20,-5,-13, -2,-1};
        int x = 0;
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                numbers[i] -= numbers[i];
            }
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (x < numbers[i]) {
                x = numbers[i];
            }
        }
        System.out.println(x);
    }


//8. Napisz program, który w tablicy znajdzie pary których suma wynosi podaną przez Ciebie wartość
    private static void exercise8() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,15,20,-5,-13, -2,-1};
        paraLiczb(arr,14);
        paraLiczb(arr,16);
        paraLiczb(arr,20);
    }

    private static void paraLiczb(int[] arr, int liczba) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == liczba) {
                    System.out.println(liczba + "została stworzona z pary x= " + i + " ; y = " + j);
                }
            }
        }
    }
}
