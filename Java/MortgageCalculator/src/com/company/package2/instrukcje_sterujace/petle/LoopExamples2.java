package com.company.package2.instrukcje_sterujace.petle;

public class LoopExamples2 {
    public static void main(String[] args) {
        LoopExamples2 main = new LoopExamples2();
        main.whileLoopExample1();
    }

    private void whileLoopExample1() {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                break;                              // break - stopuje pętle
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}
