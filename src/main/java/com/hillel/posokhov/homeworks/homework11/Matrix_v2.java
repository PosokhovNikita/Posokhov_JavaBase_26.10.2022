package com.hillel.posokhov.homeworks.homework11;

import java.util.Scanner;

public class Matrix_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = getNumber(scanner);
        int N = getNumber(scanner);

        int[][] array = new int[M][N];
        int[][] array2= new int[N][M];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }
        System.out.println("First array:");
        print(array);

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array[j][i];
            }
        }
        System.out.println("Second array:");
        print(array2);
    }

    static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    static int getNumber(Scanner scanner) {
        int temp = 0;
        System.out.println("Please enter array length");
        while (true) {
            if (scanner.hasNextInt()) {
                temp = scanner.nextInt();
                if (temp < 0) {
                    System.out.println("Please enter positive number");
                } else {
                    break;
                }
                scanner.nextLine();
            } else {
                System.out.println("Wrong data, try again");
                scanner.nextLine();
            }
        }
        return temp;
    }
}