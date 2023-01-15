package com.hillel.posokhov.homeworks.homework18;

public class UtilArrays {
    public static double getArithmeticMeanArrays(int[] array) {
        double counter;
        int summ = 0;
        if (array == null || array.length == 0) {
            return 0.0;
        }
        for (int i : array) {
            summ += i;
        }
        counter = (double) summ / array.length;
        return counter;
    }
    public static boolean getArrays(int[][] array) {
        double value = 0;
        if (array == null || array.length == 0) {
            return false;
        }


        for (int [] int1 : array) {
            if (int1 == null || int1.length == 0) {
                return false;
            }
            value += int1.length;
        }

        value = value / (double) array.length;
        return value == array.length;
    }
}
