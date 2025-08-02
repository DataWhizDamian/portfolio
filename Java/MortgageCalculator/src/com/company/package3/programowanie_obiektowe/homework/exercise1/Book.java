package com.company.package3.programowanie_obiektowe.homework.exercise1;

public class Book {

//1)
// Napisz klasę Book, która będzie posiadała numer ISBN, tytuł oraz autora.
// Następnie stwórz parę książek dodaj je do tablicy, a następnie stwórz drugą tablicę,
//która będzie zawierała elementy z tej pierwszej tylko takie, których tytuł zaczyna się na 'H'.
// Nie pozwól, żeby nowa tablica zawierała null. Zobaczysz to jak ją wydrukujesz.

    private final long isbn;
    private final String title;
    private final String author;

    public Book(long isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
