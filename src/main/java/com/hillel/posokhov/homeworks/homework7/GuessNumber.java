package com.hillel.posokhov.homeworks.homework7;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int range = 11;
        int random = (int) (Math.random() * range);
        int scannerNumber;
        System.out.println();
        System.out.println("Let's play a game, you need to guess the number from 0 to 10 that the computer randomized!");
        System.out.println("Enter number for 0 to 10:");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
                scannerNumber = scanner.nextInt();
                if (scannerNumber == random) {
                    System.out.println("You Win!!!");
                } else if (scannerNumber > random || scannerNumber < random) {
                    for (int attempts = 3; attempts > 0; --attempts) {
                        if (scannerNumber > random) {
                            System.out.println("Your number is GREATER than predicted. Remaining attempts: " + attempts);
                            Scanner newScanner2 = new Scanner(System.in);
                            int scanner2 = newScanner2.nextInt();
                            scannerNumber = scanner2;
                        } else if (scannerNumber < random) {
                            System.out.println("Your number is LESS than predicted. Remaining attempts: " + attempts);
                            Scanner newScanner3 = new Scanner(System.in);
                            int scanner3 = newScanner3.nextInt();
                            scannerNumber = scanner3;
                        }
                    }
                    if (scannerNumber == random) {
                        System.out.println("You Win!!!");
                    }
                }
                if (scannerNumber > random || scannerNumber < random) {
                    System.out.println("You Lose!");
                }

        } else {
            System.out.println("Wrong Data! Try Next Time!!!");
        }
        }
        }









