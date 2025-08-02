package com.company.package8.przydatne_klasy;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!");
        System.out.println(sb);
        sb.insert(3,"World");
        System.out.println(sb);
        sb.replace(1,3,"Kup");
        System.out.println(sb);
        sb.delete(0,1);
        sb.reverse();
        System.out.println(sb);


// String jest immutable
        String hello = "Hello";
        hello = hello.concat(" World!");
        System.out.println(hello);



        StringBuilder hello1 = new StringBuilder("Hello");
        for (int i = 0; i < 1000; i++) {
            hello1.append(" World!");
        }
        System.out.println(hello1);
        System.out.println();


        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.capacity());
        sb2.append("Hello");
        System.out.println(sb2.capacity());
        sb2.append("cWorld! Java Tutorial");
        System.out.println(sb2.capacity());
        System.out.println();


        StringBuilder sb3 = new StringBuilder(123);
        System.out.println(sb3.capacity());
    }
}
