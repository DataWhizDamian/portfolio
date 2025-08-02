package com.company.package2.instrukcje_sterujace.intrukcjeWarunkowe;

public class IfElseExample2 {
    public static void main(String[] args) {
        IfElseExample2 example2 = new IfElseExample2();
        example2.ternaryExample1(1, 2);


//        System.out.println("a = 1; b = 2; result => " + example2.ifElseCaseWithReturn(1, 2));
//        System.out.println();
    }


    private String ifElseCaseWithReturn(int a, int b) {
        if (a + b < 0) {
            return "a + b < 0";
        } else if (a + b >= 0 && a + b < 10) {
            return "a + b >= 0 && a + b < 10";
        } else if (a + b >= 10 && a + b < 100) {
            return "a + b >= 10 && a + b < 100";
        } else {
            return "a + b >= 100";
        }
    }

    private void ternaryExample1(int a, int b) {
//                      condation ? positive : negative;
        String result = a + b > 0 ? "a + b > 0" : "a + b <= 0";
        System.out.println("ternary variable result: " + result);
        System.out.println("ternary no variable result: " + (a + b > 0 ? "a + b > 0" : "a + b <= 0"));
    }

//    private String ternaryExample2() {
//        return a + b > 0 ? "a + b > 0" : "a + b <= 0";
}

