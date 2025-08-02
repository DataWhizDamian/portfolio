package com.company.package3.programowanie_obiektowe.homework.exercise1;

import com.company.package3.programowanie_obiektowe.homework.exercise1.Book;

import java.util.Arrays;

public class Exercise {
//1)
// Napisz klasę Book, która będzie posiadała numer ISBN, tytuł oraz autora.
// Następnie stwórz parę książek dodaj je do tablicy, a następnie stwórz drugą tablicę,
//która będzie zawierała elementy z tej pierwszej tylko takie, których tytuł zaczyna się na 'H'.
// Nie pozwól, żeby nowa tablica zawierała null. Zobaczysz to jak ją wydrukujesz.
    public static void main(String[] args) {
    exercise1();
        System.out.println();

    }
    private static void exercise1() {
        Book book1 = new Book(1234759632745L,"Homo deus", "Yuval Noah Harari");
        Book book2 = new Book(6384529563712L,"Sapiens", "Yuval Noah Harari");
        Book book3 = new Book(9275349562845L,"Wielki Projekt", "Stephen Hawking");
        Book book4 = new Book(7365462984657L,"Krótka historia czasu", "Stephen Hawking");
        Book book5 = new Book(8465739462956L,"Kryształowy chłopak", "Damian Stifler Zduńczyk");
        Book book6 = new Book(2648564935376L,"Bati - historia prawdziwa", "Damian Kędzierski");
        Book[] books = new Book[6];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;
        books[5] = book6;

        int counter = 0;
        for (Book book : books) {
            if (book.getTitle().startsWith("H")) {
                System.out.println("Before iter: " + counter);
                counter++;
            }
        }
        System.out.println("After all iter: " + counter);
        System.out.println();

        Book[] onlyAcounting = new Book[counter];
        for (int i = 0, j = 0; i < books.length; i++ ) {
            if (books[i].getTitle().startsWith("H")) {
                onlyAcounting[j] = books[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(onlyAcounting));
        System.out.println(Arrays.toString(books));

    }
}
