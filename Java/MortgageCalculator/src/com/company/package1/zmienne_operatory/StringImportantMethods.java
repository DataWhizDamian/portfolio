package com.company.package1.zmienne_operatory;

public class StringImportantMethods {
    public static void main(String[] args) {

//            String s1 = "KarolRobiKurs";
//        System.out.println("charAt: " + s1.charAt(10));               //charAt = 10 miejsce w s1 (u)


        String s1 = "KAROLROBIKURS";      //cmd + shift + u = zmiana wielkości liter
            String s2 = "DrugiString";
            String s3 = "karolrobikurs";
        System.out.println("concat: " + s1.concat(s2));                 //concat = dodaje stringi s1 i s3
        System.out.println("equals: " + s1.equalsIgnoreCase(s3));       //equals = porównuje s1 i s3 (ignorując wielkość liter)
        System.out.println("length: " + s1.length());                   //length = zlicza ilość (długość) znaków w s1


            String s4 = "AAAaaa";
        System.out.println("replace: " + s4.replace("A","z"));      // replace = zamiana A na z

        System.out.println("substring: " + s1.substring(5, 9));         //substring = litery od 5 do 9

        System.out.println("toLowerCase: " + s1.toLowerCase());         //toLowerCase =  zamienia wszystko na MALE litery
        System.out.println("toLowerCase: " + s1.toUpperCase());         //toUpperCase =  zamienia wszystko na DUZE litery


            String s5 = "       KAROL ROBI KURS       ";
        System.out.println("trim: " + s5.trim());                       //trim = usuwa spacje (przed i za)

        System.out.println("contains: " + s5.contains("KURS"));         //contains = sprawdza zawartość "x" w s5 (true lub false)


    }
}
