package com.company.package2.instrukcje_sterujace.tablice;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        Arrays2 examples = new Arrays2();
        System.out.println("tablice dwuwymiarowe");
        examples.matrixExample();

        int[][] matrix = examples.createMatrix(5,5);
        examples.printMatrix(matrix);
        examples.printSummedRows(matrix);
        examples.printLargestNumberInRow(matrix);



    }
    private void matrixExample() {
    // 1 sposób
        String[][] array = {
                {"g1s1", "g1s2"},
                {"g2s1"},
                {"g3s1", "g3s2", "g3s3"}
        };

    // 2 sposób
        int[][] array2 = new int[3][]; //3 wiersze
        array2[0] = new int[5];
        array2[1] = new int[6];
        array2[2] = new int[7];

    // 3 sposób
       int[][] array3 = new int[3][5];

        System.out.println("Accessing element " + array[2][1]);
        System.out.println("Accessing element " + Arrays.toString(array[2]));
        System.out.println();

        System.out.println("Reassigning element");
        array[2][1] = "new g3g1";
        System.out.println("Accessing element = " + array[2][1]);
        System.out.println();

        System.out.println("Too complicated");
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
        System.out.println(array[1][0]);
        System.out.println(array[2][0]);
        System.out.println(array[2][1]);
        System.out.println(array[2][2]);

    // looping through
        System.out.println();
        System.out.println("----");
        System.out.println("LOOPING");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.println("Element= [" + row + "] [" + column + "]: " + array[row][column] + "");
            }
            System.out.println();
        }
        System.out.println("----");
        System.out.println();
    }



    private int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = generateRandomValue();
            }
        }
        return matrix;
    }
    private int generateRandomValue() {
        int min = 0;
        int max = 10;
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }





    private void printMatrix(int[][] matrix) {
        System.out.println("1) PRINT MATRIX");

        for (int[] row : matrix) {  //iter
            for (int element : row) {
                System.out.printf("%5d", element);
            }
            System.out.println();
        }

        System.out.println();
    }


    private void printSummedRows(int[][] matrix) {
        System.out.println("2) PRINT SUMMED ROWS");

        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
            System.out.println("Row nr: " + row + " sum => " + sum);
        }

        System.out.println();
    }


    private void printLargestNumberInRow(int[][] matrix) {
        System.out.println("3) PRINT LARGEST NUMBER IN ROW");

        for (int row = 0; row < matrix.length; row++) {
            int largest = matrix[row][0];
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > largest) {
                    largest = matrix[row][column];
                }
            }
            System.out.println("Row nr: " + row + " largest element => " + largest);
        }

        System.out.println();
    }
}
