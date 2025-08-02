package com.company.package2.instrukcje_sterujace.tablice;

import java.util.Arrays;

public class Arrays2a {

    public static void main(String[] args) {
        int[][] matrix = createMatrix(3,3);
//        printMatrix(matrix);
//        printSum(matrix);
        printLargestNumberInRow(matrix);
    }

    private static int generateRandomValue() {
        int min = 0;
        int max = 10;
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

//    private int[][] createMatrix(int rows, int columns) {
//        int[][] matrix = new int[rows][columns];
//        for (int row = 0; row < rows; row++) {
//            for (int column = 0; column < columns; column++) {
//                matrix[row][column] = generateRandomValue();
//            }
//        }
//        return matrix;
//    }


    private static int[][] createMatrix(int amountRows, int amountColumns) {
        int[][] matrix = new int[amountRows][amountColumns];
        for (int row = 0; row < amountRows; row++) {
            for (int column = 0; column < amountColumns; column++) {
                matrix[row][column] = generateRandomValue();
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
            for (int i = 0; i < ints.length; i++) {
                int anInt = ints[i];
                sum += matrix[0][1];
            }
        }
        System.out.println(sum);

    }

    private static void printSum(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
            System.out.println(Arrays.toString(matrix[row]) + " sum = " + sum);
        }
    }

    private static void printLargestNumberInRow(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int largest = matrix[row][0];
            for (int column = 0; column < matrix[row].length; column++) {
                if (largest > matrix[row][column]) {
                    largest = matrix[row][column];
                }
            }
            System.out.println(Arrays.toString(matrix[row]) + " largest = " + largest);
        }
    }
}
