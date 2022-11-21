package com.hillel.posokhov.homeworks.homework5;

public class VolumeParallelepiped {
    public static void main(String[] args) {

        int a = 9;  //length
        int b = 6;  //width
        int c = 3;  //height
        int volume = a*b*c;

        System.out.println("The volume of the parallelepiped=" + volume);
        System.out.println();

        int lenght = 4*(a+b+c);

        System.out.println("The sum of lengths of the parallelepiped="+ lenght);

        //Or like this:
        //int lenght2 = 4*a + 4*b + 4*c;
        //System.out.println("The sum of lengths of the parallelepiped="+lenght2);

    }
}
