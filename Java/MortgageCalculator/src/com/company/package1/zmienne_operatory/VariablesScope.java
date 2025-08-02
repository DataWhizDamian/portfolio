package com.company.package1.zmienne_operatory;

public class VariablesScope {
    public static void main(String[] args) {

        {
            int a = 1;
            System.out.println(a);    // cykl życia a jest tylko w {}
        }
//        System.out.println(a);        //nie można wydrukować a (bo umarło) - można tylko w obrebie scopa {}
        int a = 1;
        System.out.println(a);       //nowe a (poprzednie umarło)

    }

}
