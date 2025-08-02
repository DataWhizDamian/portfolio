package com.company.package8.przydatne_klasy.homework;

import java.math.BigInteger;
import java.util.Optional;

public class Exercises {

    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
        exercise5();
    }


//1. Napisz program, który sprawdzi czy dane zdanie jest palindromem. Wykorzystaj StringBuilder
    private static void exercise1() {
        StringBuilder palindrom = new StringBuilder("może jutro ta dama sama da tortu jeżom");
        StringBuilder noWhite = new StringBuilder(palindrom.toString().replace(" ", ""));

        System.out.println(palindrom.equals(palindrom.reverse()));
        System.out.println(palindrom.toString().equals(palindrom.reverse().toString()));
        System.out.println(noWhite.toString().equals(noWhite.reverse().toString()));
    }



//2. Napisz program, który dla podanego jako StringBuilder zdania,
// zamieni we wszystkich słowach, pierwsze litery na pisane z wielkiej litery (upper case).
// Użyj StringBuildera
    private static void exercise2() {
        StringBuilder sentence = new StringBuilder("zamiana pierwszych liter na duże w tym zdaniu");
        upperCase(sentence);
        System.out.println(sentence.toString());

    }

    private static void upperCase(final StringBuilder sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            char current = sentence.charAt(i);
            char previous = i == 0 ? '.' : sentence.charAt(i - 1);
            if (Character.isLetter(current) && !Character.isLetter(previous)) {
                char toUpperCase = Character.toUpperCase(current);
                sentence.replace(i, i + 1, String.valueOf(toUpperCase));
            }
        }
    }



//3. Napisz program do liczenia silni przy wykorzystaniu BigInteger
    private static void exercise3() {
        System.out.println(factorial(BigInteger.valueOf(93)));
    }

    private static BigInteger factorial(BigInteger number) {
        BigInteger f = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(number) <= 0; i = i.add(BigInteger.ONE)) {
            f = f.multiply(i);
        }

        return f;
    }



//4. Stwórz klasę User, która będzie zawierała pola id, name, surname.
// Zdefiniuj metodę findUserByName(String name), która zwróci Optional.
// Następnie wykonaj map na name.
// Zrób filtr, czy name tego usera zaczyna się od 'G'.
// Jeżeli taki user nie istnieje wyrzuć wyjątek.
    private static void exercise4() {
        Exercises exercises = new Exercises();
        Optional<User> user = exercises.findUserByName("Rafał");
        Optional<String> name = user.map(u -> u.getName());
        Optional<String> filtered = name.filter(n -> n.startsWith("G"));
        filtered.orElseThrow(() -> new RuntimeException("User does not exist"));
    }

    private Optional<User> findUserByName(String name) {
        if (name.equals("Rafał")) {
            return Optional.of(new User(1, "Rafał", "Szybki"));
        }
        return Optional.empty();
    }


//5. Stwórz klasę User, która będzie zawierała pola id, name, surname.
// Zdefiniuj metodę findUserByName(String name), która zwróci Optional.
// Wywołaj tę metodę.
// Następnie, jeżeli taki user nie istnieje, zwróć w optionalu defaultową definicję Usera (stwórz jakiś konstruktor domyślny).
// Jeżeli User istnieje, to wydrukuj to na ekranie.
    private static void exercise5() {
        Exercises exercises = new Exercises();
        Optional<User> user = exercises.findUserByName("Rafał");
        Optional<User> or = user.or(() -> Optional.of(new User()));
        or.ifPresent(u -> System.out.println("User exist"));
    }

}
