package com.company.package3.programowanie_obiektowe.homework.exercise2;

public class Exercise {
/*2. Napisz interface Function, w którym zdefiniujesz metodę calculate, która przyjmie jako parametr int i zwróci int.
Następnie napisz klasę HalfCalculator, która będzie implementowała ten interface,
 a metoda calculate będzie dzieliła podany argument na 2.
Napisz też klasę QuarterCalculator, która będzie implementowała ten interface,
 a metoda calculate będzie dzieliła podany argument na 4.
Wywołaj tę metodę, stosując polimorfizm, to znaczy, stwórz 2 obiekty, których referencje będą zadeklarowane jako Function.


Następnie wydrukuj na ekranie wynik dla kilku podanych przykładów.
Zrób ponownie to samo, tylko tym razem, zastąp interface Function klasą o tej samej nazwie.


Później stwórz tablicę na 10 elementów, gdzie tablica będzie typu Function i dodasz do niej obiekty na przemian
 HalfCalculator i QuarterCalculator.
Przechodząc przez wszystkie elementy tablicy, wywołaj metodę calculate na wyniku poprzednim
 i dodawaj do siebie kolejne otrzymane wyniki zaczynając od jakiejś dużej liczby, np 12642364. Wynik wydrukuj na ekranie.
 */

    public static void main(String[] args) {
exercise2();
    }

    private static void exercise2() {
        Function half = new HalfCalculator();
        Function quarter = new QuarterCalculator();

        System.out.println(half.calculate(20));
        System.out.println(quarter.calculate(20));


        Function[] functions = new Function[] {
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator()
        };
        int start = 12642364;
        for (Function function : functions) {
            System.out.println("1) " + start);
            start = function.calculate(start);
            System.out.println("2) " + start);
        }
        System.out.println("3) " + start);


        FunctionClass[] functionClasses = new FunctionClass[] {
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator(),
                new HalfCalculator(),
                new QuarterCalculator()
        };
        int startClass = 8273490;
        for (FunctionClass functionClass : functionClasses) {
            startClass = functionClass.calculate(startClass);
        }
        System.out.println(startClass);
    }


}
