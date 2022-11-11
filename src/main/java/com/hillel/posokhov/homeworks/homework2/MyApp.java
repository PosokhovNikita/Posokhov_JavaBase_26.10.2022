package com.hillel.posokhov.homeworks.homework2;

public class MyApp {
    public static void main(String[] args) {

        //MyLocation

        double doubleNorth = 50.01473D;
        double doubleEast = 36.28237D;
        char degree = '\u00B0';
        char sideOfTheWorld1 = 'N';
        char sideOfTheWorld2 = 'E';
        char comma = '\u002C';

        System.out.println("My Location:");
        System.out.println("50.01473\u00B0 N,36.28237\u00B0 E\n");

        //MyLocationFromComposite
        System.out.print(doubleNorth);
        System.out.print(degree);
        System.out.print(sideOfTheWorld1);
        System.out.print(comma);
        System.out.print(doubleEast);
        System.out.print(degree);
        System.out.print(sideOfTheWorld2);
    }
}
