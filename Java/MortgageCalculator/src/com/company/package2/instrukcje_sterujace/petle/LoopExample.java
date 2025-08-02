package com.company.package2.instrukcje_sterujace.petle;

public class LoopExample {
    public static void main(String[] args) {
        LoopExample loopExample = new LoopExample();
//        loopExample.whileLoopExample();
//        loopExample.whileLoopExample2();
//        loopExample.doWhileLoopExample();
//        loopExample.doWhileLoopExample2();

//        loopExample.forLoopExample();
        loopExample.forLoopExample2();


    }

    private void whileLoopExample() {
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }
    }

    private void whileLoopExample2() {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < 10 && j < 10) {
            System.out.println("i = " + i + " j = " + j);
            i++;
            j++;
            k += 10;
        }
        System.out.println("i = " + i + " j = " + j + " k = " + k);
    }

    private void doWhileLoopExample() {
        int i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
    }

    private void doWhileLoopExample2() {
        int i = 0;
        System.out.println("CASE 1");
        while (i < 0) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("CASE 2");
        int j = 0;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j < 0);
    }


//------------------------------------------------------------------------------------------------------------------------------


    /*    for (part 1; part 2; part 3) {
             what to run
           }  */

//    part 1 jest wykonywana raz przed wykonaniem kodu w klamrze (czyli "what to run")
//    part 2 jest warunkiem zatrzymania wykonywania pętli (what to run)
//    part 3 jest uruchamiany za każdym razem po uruchomieniu pętli for (what to run)

    private void forLoopExample() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }

    private void forLoopExample2() {
        int j = 0;
        for (; j > -5; j--) {
            System.out.println("j = " + j);
        }
    }

}
