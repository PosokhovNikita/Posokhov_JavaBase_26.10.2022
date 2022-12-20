package com.hillel.posokhov.homeworks.homework11;

import java.util.Scanner;

public class Matrix_v2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size of array M: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Wrong data, try again.");
            scanner.nextLine();}
        int M = scanner.nextInt();
        System.out.println("Enter a size of array N: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Wrong data, try again.");
            scanner.nextLine();}
        int N = scanner.nextInt();
        int[][] array = new int[M][N];
        int[][] array2= new int[N][M];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    array[i][j] = M * i + j;
                    array [i][j]= N * i + j;
                }
            }
            System.out.println("First Array:");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
            for (int i = 0; i < M; i++) {
                for (int j = i + 1; j < N; j++) {
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
            System.out.println();
            System.out.println("Second Array:");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(array2[i][j] + "\t");
                }
                System.out.println();
            }
    }

}