package com.company.package4.debugowanie_static_enum.enums.homework;

import java.time.MonthDay;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        exercise1();
        System.out.println();

        System.out.println("Exercise 2");
        exercise2();
    }

/*
1. Stwórz enum Day, który będzie zawierał dni tygodnia i metody isWorkingDay() oraz boolean isWeekend().
 Stwórz również interface WorkingDay, który będzie zawierał metodę isWorkingDay()
 oraz interfejs Weekend, zawierający metodę isWeekend.
 Zaimplementuj ten interfejs przy wykorzystaniu enuma Day.
 Zapewnij, aby każda wartość enuma, miała podaną nazwę skróconą jako swój parametr, czyli MONDAY(MON), TUESDAY(TUE) itp.
Zainicjalizuj enum MONDAY na podstawie wartości String.
W pętli wypisz wszystkie wartości enuma na ekranie oraz przy każdej z nich wydrukuj czy jest to dzień pracujący czy nie.

Przykładowy zapis do wydrukowania na ekranie:
MONDAY(MON) Is working day?: true Is weekend?: false
TUESDAY(TUE) Is working day?: true Is weekend?: false
WEDNESDAY(WED) Is working day?: true Is weekend?: false
THURSDAY(THU) Is working day?: true Is weekend?: false
FRIDAY(FRI) Is working day?: true Is weekend?: false
SATURDAY(SAT) Is working day?: false Is weekend?: true
SUNDAY(SUN) Is working day?: false Is weekend?: true
*/
    private static void exercise1() {
        Day monday = Day.valueOf("MONDAY");
        for (Day day: Day.values()) {
            System.out.println(day + "(" + day.getShortValue() + ")" + " Is Working Day?: " + day.isWorkingDay() + " Day is weekend?: " + day.isWeekend());
        }
    }




/*
2. Stwórz enum, który będzie reprezentował możliwe rodzaje tańca (przykładowo 5) dostępne w szkole tańca.
 Każdy z tańców ma mieć tablicę z godzinami (stwórz godzinę jako String),
  o której zajęcia z danego rodzaju tańca są realizowane oraz tablicę z dniami w które zajęcia się odbywają
  (wykorzystaj enuma z poprzedniego zadania).
  Dodaj również alternatywny rodzaj tańca jaki może być uczony, jeżeli nauczyciel nie dotrze na czas na zajęcia.
  Wypisz na ekranie dowolne 2 z nich, wypisz możliwe godziny, możliwe dni tygodnia oraz zajęcia alternatywne,
  jeżeli nauczyciel nie dotrze na zajęcia. Przykładowy zapis do wydrukowania na ekranie:

HIPHOP: possible hours: [12:00, 13:30], days: [MONDAY, SUNDAY], alternative: BALLET
IRISH: possible hours: [19:20, 20:15], days: [MONDAY, WEDNESDAY], alternative: BALLET
 */
    private static void exercise2() {
    Dance hiphop = Dance.HIPHOP;
        System.out.println(hiphop + ": possible hours: " + hiphop.getHours() + ", days: " + hiphop.getDays() + ", alternative: " + hiphop.getAlternative());
    Dance balet = Dance.BALET;
        System.out.println(balet + ": possible hours: " + balet.getHours() + ", days: " + balet.getDays() + ", alternative: " + balet.getAlternative());
    }



}
