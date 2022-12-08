package com.hillel.posokhov.homeworks.homework9;

public class Regbi {
    public static void main(String[] args) {

        int[] arrayTeam1 = new int[25];
        int[] arrayTeam2 = new int[25];
        int a = 18;
        int b = 41;

        System.out.print("\t Age players team 1: ");
        for (int i = 0; i < arrayTeam1.length; i++) {
            arrayTeam1[i] = (int) (Math.random() * (b - a)) + a;
        }
        for (int i = 0; i < arrayTeam1.length; i++) {
            System.out.print(arrayTeam1[i] + ((i != arrayTeam1.length - 1) ? ", " : ""));
        }
        System.out.print("\n \t Age players team 2: ");
        for (int i = 0; i < arrayTeam2.length; i++) {
            arrayTeam2[i] = (int) (Math.random() * (b - a)) + a;
        }
        for (int i = 0; i < arrayTeam2.length; i++) {
            System.out.print(arrayTeam2[i] + ((i != arrayTeam2.length - 1) ? ", " : ""));
        }
        double averageTeam1 = 0;
        double averageTeam2 = 0;
        for (int i = 0; i < arrayTeam1.length; i++) {
            averageTeam1 += arrayTeam1[i];
            averageTeam2 += arrayTeam2[i];
        }
        averageTeam1 /= arrayTeam1.length;
        averageTeam2 /= arrayTeam2.length;

        if(averageTeam1 > averageTeam2){
            System.out.println("\n \t The average age of first team players ("+averageTeam1+") more than average of "+
                    "second team players ("+averageTeam2+")");
        } else if(averageTeam1 < averageTeam2){
            System.out.println("\n \t The average age of first team players ("+averageTeam1+") less than average of "+
                    "second team players ("+averageTeam2+")");
        } else {
            System.out.println("\n \t Averages of teams are equal ("+averageTeam1+")");
        }
    }   //Ну или можно просто вывести значения в консоль
        //System.out.println("\n \t The average age of first team players: " + averageTeam1)
        //System.out.println("\n \t The average age of second team players: " + averageTeam2)

}