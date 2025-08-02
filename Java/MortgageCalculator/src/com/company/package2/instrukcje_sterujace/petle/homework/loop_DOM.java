package com.company.package2.instrukcje_sterujace.petle.homework;

public class loop_DOM {
    public static void main(String[] args) {
//        exercise1();
//        exercise2();
//        exercise3();
        exercise8();

    }
//1. Napisz program liczący silnię.
// Spróbuj dokonać takiej implementacji przy wykorzystaniu oddzielnie pętli oraz oddzielnie rekurencji.
    private static void exercise1() {
        System.out.println("FactorialLoop(5) = " + factorialLoop(5));
        System.out.println("FactorialRecursive(5) = " + factorialRecursive(5));
        System.out.println("FactorialLoop(9) = " + factorialLoop(9));
        System.out.println("FactorialRecursive(9) = " + factorialRecursive(9));
    }
    private static int factorialLoop(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    private static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorialRecursive(n - 1));
        }

    }


//2. Napisz program, który określi czy podane słowo jest palindromem.
    private static void exercise2() {
        String str = "oko";
        String noWhite = str.replace("", "");
        System.out.println("with White: " + isPalindrom(str));
        System.out.println("no White: " + isPalindrom(noWhite));
    }
    private static boolean isPalindrom(String sentence) {
        for (int i =0; i < sentence.length() / 2; i++) {
            if (sentence.charAt(i) != sentence.charAt(sentence.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }



/*3. Napisz program, który na ekranie wydrukuje choinkę z podanych przez Ciebie znaków
przy czym parametrem wejściowym jest ilość znaków w podstawie.
Do tego, żeby to wyglądało jak choinka, to w każdym kolejnym rzędzie idąc z dołu do góry
musi być o 2 znaki mniej niż w rzędzie poprzednim.
Do tego załóż, że jak w podstawie jest liczba parzysta, to na samej górze zostają 2 znaki, a jak nieparzysta to jeden. */
    private static void exercise3() {
        printChristmasTree('*',6);
//        printChristmasTree('^',10);
//        printChristmasTree('#',121);
    }
    private static void printChristmasTree(final char sign, int numberOfStarsAtTheBottom) {
        int numberOfStarsAtTheTop = numberOfStarsAtTheBottom % 2 == 0 ? 2 : 1;

        int height = 0;
        for (int i = numberOfStarsAtTheBottom; i > 0; i -= 2) {
            height++;
        }

        int numberOfSingsInARow = numberOfStarsAtTheTop;
        for (int row = 0; row < height; row++) {
            int numberOfSpaces = (numberOfStarsAtTheBottom - numberOfSingsInARow) / 2;
            for (int column = 0; column < numberOfStarsAtTheBottom - numberOfSpaces; column++) {
                System.out.println(column < numberOfSpaces ? " " : sign);
            }
            numberOfSingsInARow += 2;
            System.out.println();
        }
        System.out.println();
    }


/*4. Rafał ma 6 kolorowych mazaków (czerwony, zielony, niebieski, czarny, żółty i brązowy)
i rysuje nimi w podanej kolejności kolorów 100 kresek.
 Wypisz wszystkie kolory w kolejności odpowiadające rysowanym kreskom i zobacz jaki kolor będzie ostatni.*/
    private static void exercise4() {
        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0) {
                System.out.println("brown");
            }
            if (i % 6 == 1) {
                System.out.println("red");
            }
            if (i % 6 == 2) {
                System.out.println("green");
            }
            if (i % 6 == 3) {
                System.out.println("blue");
            }
            if (i % 6 == 4) {
                System.out.println("black");
            }
            if (i % 6 == 5) {
                System.out.println("yellow");
            }
        }
    }


// 5. Napisz program, który wydrukuje wszystkie liczby pierwsze od 2 do 10000.
    private static void exercise5() {
        for (int i = 0; i<=10000; i++) {
            boolean first = true;
            if (i < 2) {
                first = false;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j ==0 ) {
                        first = false;
                        break;
                    }
                }
            }
            if (first) {
                System.out.println(i);
            }
        }
    }



/*6. Napisz program, który na ekranie będzie w stanie wydrukować następujący ciąg znaków
39,11,41,8,43,5,45,2,47,-1,49,-4,51,-7,53,-10,55,-13,57,-16
Napisz ten program w taki sposób, żebyś był w stanie podać długość drukowanego ciągu, np 1000.
Zauważ, że na końcu ciągu nie ma przecinka, są tylko w środku */
    private static void exercise6() {
        int counter = 0;
        for (int i = 39, j = 11; counter <10; counter++) {
            if (counter == 9) {
                System.out.println(i + "," + j);
            } else {
                System.out.println(i + "," + j + ",");
            }
            i = i + 2;
            j = j - 3;
        }
    }


// 7. Napisz program drukujący na ekranie ciąg Fibonacciego. Wydrukuj pierwsze 20 znaków ciągu.
// Znaki ciągu możesz oddzielić spacją.
    private static void exercise7() {
        int x1 = 0;
        int x2 = 1;
        int count = 18;
        System.out.println(x1 + " ");
        System.out.println(x2 + " ");

        for (int i = 0; i< count ; i++) {
            int temp = x1 + x2;
            System.out.println(temp + " ");
            x1 = x2;
            x2 = temp;
        }
    }


/* 8. Napisz program drukujący ciąg znaków jak poniżej.
 Napisz to tak, żeby liczenie doszło do 999.
 Postaraj się wykorzystać pętle zagnieżdżone, tzn. nie pisz czegoś takiego: System.out.println("####);
111
####
####
####
####
222
####
####
####
####
 */
    private static void exercise8() {
        for (int i = 1; i<=9; i++) {
            for(int j = 0; j<3; j++) {
                System.out.println(i);
            }
            System.out.println();
            for (int k = 0; k<4; k++) {
                for (int j = 0; j<4; j++) {
                    System.out.println("#");
                }
                System.out.println();
            }
        }
    }
}
