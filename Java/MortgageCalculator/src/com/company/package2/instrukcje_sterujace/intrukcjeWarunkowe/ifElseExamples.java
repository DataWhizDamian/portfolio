package com.company.package2.instrukcje_sterujace.intrukcjeWarunkowe;

public class ifElseExamples {
    public static void main(String[] args) {
        ifElseExamples examples = new ifElseExamples();

//        System.out.println("a = 1; b = 2");
//        examples.ifElseCase(1, 2);
//        System.out.println();
//
//
//        System.out.println("a = 1; b = 2");
//        examples.switchCase(1, 2);
//        System.out.println();

        System.out.println("switch: " + examples.switchCaseWithReturn(1, 2));


    }

    private void ifElseCase(int a, int b) {
        System.out.println("Case 1");
        if (a - b > 0) {
            System.out.println("a - b > 0");
        }

        System.out.println("Case 2");
        if (a + b > 0) {
            System.out.println("a + b > 0");
        } else {
            System.out.println("a + b < 0");
        }

        System.out.println("Case 3");
        if (a + b < 0) {
            System.out.println("a + b < 0");
        } else if (a + b >= 0 && a + b < 10) {
            System.out.println("a + b >= 0 && a + b < 10");
        } else if (a + b >= 10 && a + b < 100) {
            System.out.println("a + b >= 10 && a + b < 100");
        } else {
            System.out.println("a + b >= 100");
        }
    }


    private void switchCase(int a, int b) {                 //switch case (break) = nie działa do wszystkich operatorów (do double nie)
        int sum = a + b;
        switch (sum) {
            case 1:
            case 2:
            case 3:
                System.out.println("a + b = 1 || a + b = 2 || a + b = 3");
                break;
            case 4:
                System.out.println("a + b = 4");
                break;
            default:
                System.out.println("a + b is default");
                break;
        }
    }

    private String switchCaseWithReturn(int a, int b) {
        int sum = a + b;
        switch (sum) {
            default:
                return "a + b is default";
            case 1:
            case 2:
            case 3:
                return "a + b = 1 || a + b = 2 || a + b = 3";
            case 4:
                return "a + b = 4";

        }

    }
}
