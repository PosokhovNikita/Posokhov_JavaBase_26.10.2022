package com.hillel.posokhov.homeworks.homework10;

import java.util.Scanner;

public class GuessNumber_v2 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 11);
        int guess = -1;
        int counter = 0;
        int attempt = 3;
        System.out.println(num);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a game, you need to guess the number from 0 to 10 that the computer randomized! ");
        System.out.println("Enter number for 0 to 10: ");
        System.out.println("You have a " + (attempt)+ " attempts!");

        while (guess != num) {
            while (!scanner.hasNextInt()) {
                System.out.println("Wrong data, try again.");
                scanner.nextLine();}
            guess = scanner.nextInt();
            counter++;
            if (counter == attempt){
                System.out.println("YOU LOSE!!!");
                break;}
            if (guess == num) {
                System.out.println("YOU WIN!!!");
                break;
            } else if (guess < num)
                System.out.println("Your number is LESS than predicted! Try Again!");
            else
                System.out.println("Your number is GREATER than predicted! Try Again!");
        }
        System.out.println("Attempts: " + counter);
    }
}
