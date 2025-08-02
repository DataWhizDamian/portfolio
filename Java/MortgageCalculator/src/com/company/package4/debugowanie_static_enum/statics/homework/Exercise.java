package com.company.package4.debugowanie_static_enum.statics.homework;

import java.util.Arrays;

import static com.company.package4.debugowanie_static_enum.statics.homework.Global.GLOBAL_CONSTANT;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("1) EXERCISE");
        exercise1();

        System.out.println();
        System.out.println("2) EXERCISE");
        exercise2();

        System.out.println();
        System.out.println("3) EXERCISE");
        exercise3();

        System.out.println();
        System.out.println("4) EXERCISE");
        exercise4();

        System.out.println();
        System.out.println("5) EXERCISE");
        exercise5();

    }


/*
1. Zdefiniuj statyczną stałą globalną w klasie Global w paczce global.
Zwróć uwagę, że masz do niej dostęp z każdej innej klasy i nie możesz zmienić wartości zdefiniowanej stałej.
Wypróbuj skrót psfs. Postaraj się zaimportować zdefiniowaną stałą na dwa sposoby:
- poprzez import zwykły -> String globalConstant = Global.GLOBAL_CONSTANT;
- poprzez import statyczny -> String globalConstant = GLOBAL_CONSTANT;
*/
    private static void exercise1() {
        String globalConstant1 = GLOBAL_CONSTANT;
    }



/*
2. Stwórz klasę Static, która wydrukuje na ekranie kiedy po raz pierwszy zostanie użyta. Stwórz w niej pola:
- statyczne counter (zliczające ile instancji klasy stworzyliśmy),
- instantyjne name.
Stwórz 5 instancji klasy, za każdym razem drukując na ekranie counter i name.
 */
    private static void exercise2() {
        Static static1 = new Static("1st Static");
        System.out.println("Name: " + static1.getName() + ", counter: " + static1.getCounter());
        Static static2 = new Static("2st Static");
        System.out.println("Name: " + static2.getName() + ", counter: " + static2.getCounter());
        Static static3 = new Static("3st Static");
        System.out.println("Name: " + static3.getName() + ", counter: " + static3.getCounter());
        Static static4 = new Static("4st Static");
        System.out.println("Name: " + static4.getName() + ", counter: " + static4.getCounter());
        Static static5 = new Static("5st Static");
        System.out.println("Name: " + static5.getName() + ", counter: " + static5.getCounter());
    }



/*
3. Stwórz klasę abstrakcyjną AParent, która będzie miała metodę getName() oraz statyczną metodę String getClassName().
Stwórz klasę Child, która będzie nadpisywała metodę getName() oraz definiowała statyczną metodę String getClassName().
Użyj dziedziczenia. Stwórz 2 instancje klasy Child przypisując je do referencji Parent oraz Child.
Wywołaj obie metody na referencjach, ich wynik wydrukuj na ekranie. Zauważ różnicę i postaraj się znaleźć wyjaśnienie
 */
    private static void exercise3() {
        AParent aParent = new Child();
        Child child = new Child();

        //METODA INSTANCYJNA:  polimorfizm ==  aParent = Child() --> getName() = "Child name"
        System.out.println(aParent.getName());
        //METODA STATYCZNA:  w metodzie statycznej nie wystepuje polimorfizm == AParent --> getClassName() = "Parent"
        System.out.println(aParent.getClassName());

        //METODA INSTANCYJNA:  polimorfizm ==  child = Child() --> getName() = "Child name"
        System.out.println(child.getName());
        //METODA STATYCZNA:  w metodzie statycznej nie wystepuje polimorfizm == Child --> getClassName() = "Child"
        System.out.println(child.getClassName());
    }



    
/*
4. Zdefiniuj metodę statyczną signsCreator, która na podstawie przekazanych liczb (można przekazać dowolną ilość)
zwróci tablicę char, ze znakami stojącymi pod podanymi w argumentach miejscami w tablicy ASCII (http://www.asciitable.com/).
Załóżmy, że do metody można przekazać tylko wartości liczbowe z zakresu 32 - 127.
Napisaną metodę, spróbuj podzielić na kroki i każdy krok wyciągnąć do oddzielnej metody.
 */
    private static void exercise4() {
        char[] arr = signsCreator(1,75,79,87,111,219,34,39,1234,47);
        System.out.println(Arrays.toString(arr));

    }

    private static char[] signsCreator(int... args) {
        char[] chars = new char[args.length - calculateNotHandledCases(args)];
        castToChar(chars, args);
        return chars;
    }

    private static int calculateNotHandledCases(int[] args) {
        int notHandledCases = 0;
        for (int arg : args) {
            if (arg < 33 || arg > 127) {
                System.out.println("Case: " + arg + " not handled");
                notHandledCases++;
            }
        }
        return notHandledCases;
    }

    private static void castToChar(char[] chars, int[] args) {
        int j = 0;
        for (int arg : args) {
            if (arg >= 33 && arg <= 127) {
                chars[j] = (char) arg;
                j++;
            }

        }
    }




/*
5. Stwórz interfejs IParent, która będzie miał metodę defaultową getName() oraz statyczną metodę String getClassName().
Stwórz klasę AnotherChild, która będzie nadpisywała metodę getName() oraz definiowała statyczną metodę String getClassName().
Użyj dziedziczenia.
Stwórz 2 instancje klasy Child przypisując je do referencji Parent oraz Child.
Wywołaj obie metody na referencjach, ich wynik wydrukuj na ekranie. Zauważ różnicę i postaraj się znaleźć wyjaśnienie
 */
    private static void exercise5() {
        IParent IParent = new AnotherChild();
        AnotherChild anotherChild = new AnotherChild();

        //METODA INSTANCYJNA:  polimorfizm ==  IParent = AnotherChild()  --> getName() = "another child name"
        System.out.println("none static = IParent.getName():   " + IParent.getName());
        //NIE MOŻNA wywołać metody statycznej na referencji interfejsu (compilation error)
//        System.out.println(IParent.getClassName());

        //METODA INSTANCYJNA:  polimorfizm = AnotherChild() --> getName() = "another child name"
        System.out.println("none static = anotherChild.getName():   " + anotherChild.getName());
        //METODA STATYCZNA:  w metodzie statycznej nie wystepuje polimorfizm == AnotherChild  --> getClassName() = "another child"
        System.out.println("static = anotherChild.getClassName():   " + anotherChild.getClassName());
    }
}
