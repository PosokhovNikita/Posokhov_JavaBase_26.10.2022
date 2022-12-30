package com.hillel.posokhov.homeworks.homework15.main;

import com.hillel.posokhov.homeworks.homework15.classes.Androids;
import com.hillel.posokhov.homeworks.homework15.classes.IPhones;

public class Interface {
    //Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()
    //Зробіть класи, які його імплементують: Androids, iPhones.
    //Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS
    //Створіть екземпляри кожного виду у мейн-класі
    public static void main(String[] args) {
        Androids androids = new Androids();
        IPhones iPhones = new IPhones();
    }
}
