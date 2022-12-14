package com.hillel.posokhov.homeworks.homework10;

public class GuessNumber_v2 {
    public static void main(String[] args) {

        int num = 0;

        for (int i = 1; i < 4; i++) {
            System.out.println("Внешний цикл i=" + i);

            for (int j = 1; j < 4; j++) {
                System.out.print("\tВнутренний цикл j=" + j);
                System.out.println("\t\tВсего num=" + (++num));
            }
        }
    }
}
//for ( инициализация ; проверочное-выражение ; итерация ) {
//операторы-для-выполнения-на-каждой-итерации ; }
//Скобки после ключевого слова for должны содержать три управляющих выражения, которые и определяют действие цикла.

//• Инициализация — присваивает начальное значение переменной- счетчику, который будет
// подсчитывать число итераций цикла. Переменная для этих целей может быть объявлена прямо здесь,
// и обычно это самая простая целочисленная переменная с именем i.

//• Проверочное выражение — данное выражение оценивается в начале каждой итерации цикла на предмет
// логического значения true. Когда оценка возвращает значение true, итерация продолжается, а при возвращении
// значения false цикл немедленно прекращает свою работу, не завершая текущую итерацию.

//• Итерация — изменяет текущее значение переменной-счетчика, храня в себе общее число итераций, сделанных циклом.
// Обычно здесь используется выражение i++ для увеличения либо i-- для уменьшения значения счетчика