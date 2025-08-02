package com.company.package6.kolekcje.homework;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
//        exercise5();
//        exercise6();
//        exercise7();
        exercise8();

    }


//1. Masz Set z elementami typu String.
// Wydrukuj na ekranie każdy element oddzielony przecinkiem przy wykorzystaniu iteratora.

    private static void exercise1() {
        Set<String> set = new HashSet<>(Arrays.asList("one", "two", "three", "one", "four", "two"));
        Iterator<String> iterator = set.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            counter++;
            if (counter == set.size()) {
                System.out.println(iterator.next());
            } else {
                System.out.println(iterator.next() + ", ");
            }
        }
    }


//2. Napisz program, który losowo zamieni kolejność elementów w podanej liście
    private static void exercise2() {
        List<Integer> original = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> toShuffle = new ArrayList<>(original);
        System.out.println(original);
        shuffle(toShuffle);
        System.out.println(toShuffle);

        System.out.println();
        Collections.sort(original);
        Collections.sort(toShuffle);
        System.out.println("Are lists equal? " + original.equals(toShuffle));
    }

    private static void shuffle(List<Integer> list) {
        Random r = new Random();

        for (int i = list.size() - 1; i > 0; i--) {
            int j = r.nextInt(i);

            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }



//3. Napisz program, który stworzy Set z klasy Employee.
// Employee posiada imię i nazwisko.
// Dodaj do Seta kilku pracowników, o tym samym imieniu i nazwisku bez nadpisywania metody hashCode,
// oraz potem zrób to samo z nadpisaną metodą hashCode. Jaka jest różnica?

    private static void exercise3() {
        Set<EmployeeWithNoHashCode> setWithNoHash = new HashSet<>();
        setWithNoHash.add(new EmployeeWithNoHashCode("Rafał", "Pracujący"));
        setWithNoHash.add(new EmployeeWithNoHashCode("Damian", "Kędzierski"));
        setWithNoHash.add(new EmployeeWithNoHashCode("Julia", "Czaplic"));
        setWithNoHash.add(new EmployeeWithNoHashCode("Łukasz", "Daniel"));
        setWithNoHash.add(new EmployeeWithNoHashCode("Wiktor", "Hajel"));
        setWithNoHash.add(new EmployeeWithNoHashCode("Bartek", "Serwin"));
        setWithNoHash.add(new EmployeeWithNoHashCode("Damian", "Kędzierski"));

        Set<EmployeeWithHashCode> setWithHash = new HashSet<>();
        setWithHash.add(new EmployeeWithHashCode("Rafał", "Pracujący"));
        setWithHash.add(new EmployeeWithHashCode("Damian", "Kędzierski"));
        setWithHash.add(new EmployeeWithHashCode("Julia", "Czaplic"));
        setWithHash.add(new EmployeeWithHashCode("Łukasz", "Daniel"));
        setWithHash.add(new EmployeeWithHashCode("Wiktor", "Hajel"));
        setWithHash.add(new EmployeeWithHashCode("Bartek", "Serwin"));
        setWithHash.add(new EmployeeWithHashCode("Damian", "Kędzierski"));

        System.out.println(setWithNoHash);
        System.out.println(setWithHash);
    }



//4. Napisz metodę, która na podstawie przekazanej do niej listy Integerów, przeniesie najwyższą wartość na koniec listy.
// Stwórz 2 wersje metody, pierwszą modyfikującą obecną listę, drugą zwracającą nową listę.
// Jeżeli wartość maksymalna się powtarza, przenieś na koniec tylko jedno wystąpienie.

    private static void exercise4() {
        List<Integer> original = new ArrayList<>(Arrays.asList(10, 10, 20,3,4,5,6));
        System.out.println("Before move: " + original);
        moveMaxToEnd(original);
        System.out.println("After move: " + original);

        List<Integer> moved = moveMaxToEndReturningNew(original);
        System.out.println("After move returning: " + moved);
    }

    private static void moveMaxToEnd(List<Integer> list) {
        int maxValue = list.get(0);
        for (Integer val : list) {
            if (val > maxValue) {
                maxValue = val;
            }
        }
        System.out.println("Maksymalna wartość w liście: " + maxValue);
        list.removeAll(Collections.singletonList(maxValue));
        list.add(maxValue);
    }

    private static List<Integer> moveMaxToEndReturningNew(List<Integer> list) {
        int maxValue = list.get(0);
        for (Integer val : list) {
            if (val > maxValue) {
                maxValue = val;
            }
        }
        List<Integer> newList = new ArrayList<>();
        for (Integer val : list) {
            if (val != maxValue) {
                newList.add(val);
            }
        }
        newList.add(maxValue);
        return newList;
    }




//5. Stwórz listę zawierającą 100 liczb.
// Spróbuj wykorzystać generator liczb losowych (poszukaj w internecie) w zakresie od 0 do 10.
// Następnie wydrukuj na ekranie ile razy każdy z elementów został wylosowany. Wykorzystaj Map.

    private static void exercise5() {
        Random random = new Random();
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            elements.add(random.nextInt(10));
        }
        System.out.println(elements);

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer element : elements) {
            Integer frequency = frequencyMap.get(element);
            frequencyMap.put(element, frequency == null ? 1 : frequency + 1);
        }

        System.out.println(frequencyMap);
    }




// 6. Napisz klasę Square reprezentującej kwadrat.
// Dodaj konstruktor w którym użytkownik może określić tę wartość.
// Do tego dodaj getter oraz setter. Pamiętaj o enkapsulacji.
// Dodaj metodę liczącą obwód i metodę liczącą pole kwadratu.
// Nadpisz metodę equals. Nadpisz metodę toString.
// Użyj następnie tej klasy, aby stworzyć kilka kwadratów o różnych bokach i umieścić je w liście.
// Dodaj parę zduplikowanych kwadratów.
// Następnie zaproponuj strukturę, która pozwoli usunąć duplikaty z kolekcji elementów.

    private static void exercise6() {
        List<Square> squares = List.of(
                new Square(1),
                new Square(2),
                new Square(3),
                new Square(1),
                new Square(2),
                new Square(4),
                new Square(),
                new Square()
        );

        System.out.println(squares);
        Set<Square> squareSet = new HashSet<>(squares);
        System.out.println(squareSet);
    }




//7. Napisz metodę, która przyjmuje jako argument String i wydrukuje na ekranie, ile razy wystąpiła dana litera (znak) w podanym zdaniu

    private static void exercise7() {
        String sentence = "Hello World! Java bootcamp exercises whatever";
        countAndPrintSigns(sentence);
    }

    private static void countAndPrintSigns(String sentence) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            Character element = sentence.charAt(i);
            Integer frequency = countMap.get(element);
            countMap.put(element, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(countMap);
    }



//8. Stwórz mapę Map<Integer, String>, która zawiera imiona i nazwiska uczniów w klasie razem z ich numerami w dzienniku.
// Następnie stwórz listę imion i nazwisk, uczniów, którzy mają w dzienniku numery w zakresie od a (including) do b (excluding).

    private static void exercise8() {
        Map<Integer, String> students = new HashMap<>();
        students.put(1,"Damian Kędzierski");
        students.put(2,"Julia Czaplic");
        students.put(3,"Łukasz Daniel");
        students.put(4,"Wiktor Hajel");
        students.put(5,"Bartek Serwin");
        System.out.println(getNames(students,2,4));
    }

    private static List<String> getNames(Map<Integer, String> someStudents, int a, int b) {
        List<String> names = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : someStudents.entrySet()) {
            if (entry.getKey() >= a && entry.getKey() <= b) {
                names.add(entry.getValue());
            }
        }
        return names;
    }
}
