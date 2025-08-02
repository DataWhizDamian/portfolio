package com.company.package2.instrukcje_sterujace.tablice;

public class Arrays<simple> {
    public static void main(String[] args) {
        simplArrays();
        System.out.println();

        arraysExample1();
        System.out.println();

        arraysExample2();


    }

    private static void simplArrays() {
        int[] array1 = new int[10];
        int[] array2 = new int[]{1, 2, 13, 23};
        int[] array3 = {1, 2, 13, 23};
        System.out.println(java.util.Arrays.toString(array2));
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println(array2[3]);
    }

    private static void arraysExample1() {
        String[] array = new String[10];

        int i = 0;
        while (i < 5) {
            array[i] = "Hello new index " + i;
            i++;
        }

        System.out.println(java.util.Arrays.toString(array));
        System.out.println(array.length); //10

        String completeContent = "";
        for (int k = 0; k < 7; k++) {
            completeContent = completeContent + array[k] + ";";
            System.out.println("Print => " + array[k]);
        }
    }

    private static void arraysExample2() {
        double[] array = new double[]{1.0, 2.0, 3.72, 4.25, 8.32, 4.78, 9.23, 1.234546};

        //total
        double total = 0;
        for (double element : array) {  //foreach loop
            total += element; //total = total + element
        }
        System.out.println("Total: " + total);

        //max
        double maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println("Maximum " + maximum);
    }





}
