package com.hillel.posokhov.homeworks.homework8;

public class Numbers {
    public static void main(String[] args) {

        int count = 0, value = 0;
        while (count < 100) {
            String str = String.valueOf(++value);//String.valueOf - Преобразует в нужный тип данных(в данном случае в int)
            if ((str.contains("4") || str.contains("9"))) //contains - проверяет наличие в строке определенных символов
                continue;//пропускает эту операцию
            System.out.print(value + ", ");
            count++;
        }
        System.out.println();
        System.out.println("Numbered shuttles: " + count);

        //Т.е. за счет того, что мы преобразовываем стринг в инт, мы можем считать с этой строки цифры 4 и/или 9
        // и пропустить все числа связанные с ними за счет "continue"
    }

}
