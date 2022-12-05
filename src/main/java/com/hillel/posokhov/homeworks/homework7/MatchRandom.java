package com.hillel.posokhov.homeworks.homework7;

import java.util.Scanner;

public class MatchRandom {
    public static void main(String[] args) {
        //Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
        //Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).


        Scanner newScanner = new Scanner(System.in);

        int range = 11;
        int random = (int) (Math.random() * range);
        System.out.println(random);
        System.out.println("Let's play a game, you need to guess the number that the computer guessed!");
        System.out.println("Enter number for 0 to 10:");
        int scannerNumber = newScanner.nextInt();

        if (scannerNumber == random) {
            System.out.println("YOU WIN!!!");
        }
        else if (scannerNumber > random || scannerNumber < random) {
            for (int attempts = 3; attempts > 0; --attempts) {
                if (scannerNumber > random){
                    System.out.println("Your number is GREATER than predicted. Remaining attempts: " + attempts );
                    Scanner newScanner2 = new Scanner(System.in);
                    int scanner2 = newScanner2.nextInt();
                    scannerNumber = scanner2;
                }
                else if (scannerNumber < random) {
                    System.out.println("Your number is LESS than predicted. Remaining attempts: " + attempts);
                    Scanner newScanner3 = new Scanner(System.in);
                    int scanner3 = newScanner3.nextInt();
                    scannerNumber = scanner3;
                }
            }
            if (scannerNumber == random) {
                System.out.println("YOU WIN!!!");
            }
        }
        if (scannerNumber > random || scannerNumber < random) {
            System.out.println("You lose!");
        }
    }
}

//У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати
// 100 космічних шатлів для перевезення людей на
// Марс так, щоб у номерах шатлів не траплялося нещасливих чисел.
// Напишіть функцію, яка виводить усі номери таких шатлів.


