package com.company.package1.zmienne_operatory.homework_zmienne;

public class Exercises {

    public static void main(String[] args) {

//1. Napisz program, który dla podanego Stringa przypisze wartość jego długości do zmiennej,
// następnie wyświetli jego długość na ekranie.
        String someString = "jak długi jest ten tekst?";
        int size = someString.length();
        System.out.println(size);
        System.out.println();


//2. Napisz program, który sklei ze sobą 5 dowolnych stringów na 2 pokazane różne sposoby i wydrukuje rezultat na ekranie.
        String a1 = "Kocham ";
        String b2 = "programować ";
        String c3 = "w ";
        String d4 = "Javie";
        String e5 = "!";

        String result1 = a1.concat(b2).concat(c3).concat(d4).concat(e5);
        String result2 = a1 + b2 + c3 + d4 + e5;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println();


//3. Napisz program, który zamieni samogłoski w podanym zdaniu na podaną przez Ciebie liczbę zmiennoprzecinkową.
        String sentence = "w tym zdaniu zostaną zamienione samogłoski na liczby";

        String a = "a";
        String e = "e";
        String i = "i";
        String o = "o";
        String ó = "ó";
        String u = "u";
        String y = "y";
        String ą = "ą";
        String ę = "ę";

        double toReplace = 1.1;

        String replacement = "" + toReplace;


        String replaced = sentence.replaceAll(a, replacement);
        replaced = replaced.replace(e, replacement);
        replaced = replaced.replace(i, replacement);
        replaced = replaced.replace(o, replacement);
        replaced = replaced.replace(ó, replacement);
        replaced = replaced.replace(u, replacement);
        replaced = replaced.replace(y, replacement);
        replaced = replaced.replace(ą, replacement);
        replaced = replaced.replace(ę, replacement);

        System.out.println("original = " + sentence);
        System.out.println("replaced = " + replaced);
        System.out.println();


//4. Napisz program, który będzie sprawdzał, czy w podanym zdaniu występuje słowo 'Java'.
        String sentence2 = "Java jest super";
        boolean contains = sentence2.contains("Java");
        System.out.println(contains);
        System.out.println();


//5. Napisz program, który porówna 2 stringi w taki sposób żeby wynik "Java".equals("jaVa") zwrócił ‘true’.
        String string1 = "Java";
        String string2 = "jaVa";

        boolean result = string1.equalsIgnoreCase(string2);
        System.out.println(result);
        System.out.println();


//6. Napisz program, który z podanego Stringa o długości dłuższej niż 10 znaków, wytnie string od indeksu 3 o długości 5 znaków.
// Czyli np. dla stringa "SomeStringLongerThan10Signs" otrzymamy “eStri”
        String arg = "SomeStringLongerThan10Signs";
        String cut = arg.substring(3,8);
        System.out.println(cut);
    }
}
