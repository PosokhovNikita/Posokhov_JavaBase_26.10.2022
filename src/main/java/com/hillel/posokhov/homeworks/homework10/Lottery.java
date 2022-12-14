package com.hillel.posokhov.homeworks.homework10;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {
//  Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//
//  Перший масив - це числа, які загадані фірмою-організатором лотереї.
//
//  Другий масив - це числа, які вгадав гравець.
//
//  Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
//
//  У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
//  irst[3] повинен дорівнювати second[3], як показано нижче.
//
//  Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
//
//  [0, 1, 4, 5, 5, 8, 9]
//  [1, 1, 2, 3, 5, 6, 9]
//
//  Кількість збігів: 3

        int lottery [] = new int[7];
        int player [] = new int[7];
        int range = 10;
        int count = 0;

        for (int i = 0; i < lottery.length; i++) {
            lottery [i] = (int) (Math.random() * range);
        }
        for (int i = 0; i < lottery.length; i++) {
            Arrays.sort(lottery);
        }
            System.out.println("Numbers lottery: " + Arrays.toString(lottery));

        for (int i = 0; i < player.length; i++) {
            player [i] = (int) (Math.random() * range);
        }
        for (int i = 0; i < player.length; i++) {
            Arrays.sort(player);
        }
            System.out.println("Numbers players: " + Arrays.toString(player));

        for (int i = 0; i < lottery.length;i++) {
            if (lottery[i] == player[i])
                count++;
            }
        System.out.println("Coincidences: " + count);
    }
}



