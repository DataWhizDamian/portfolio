package com.company.package1.zmienne_operatory;



public class InternExample {
    public static void main(String[] args) {

    String s1 = new String("karol");
    String s2 = "karol";

//        System.out.println("s1 == s2: " + (s1 == s2));
//        System.out.println("s1.equals(s2): " + s1.equals(s2));

    String s5 = s1.concat(s2);
    String s6 = "karolkarol";

        System.out.println("s5 == s6: " + (s5.intern() == s6));
        System.out.println("s5.equals(s6): " + s5.equals(s6));






    }





}
