package com.hillel.posokhov.homeworks.homework6;

import java.util.Scanner;

public class CounterStrike {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Team 1:
        System.out.println("Please enter team 1 name:");
        String team1 = scanner.nextLine();
        System.out.println(team1);

        System.out.println("Please enter count frags player 1 team 1:");
        int player1Team1 = scanner.nextInt();
        System.out.println(player1Team1);
        scanner.nextLine();

        System.out.println("Please enter count frags player 2 team 1:");
        int player2Team1 = scanner.nextInt();
        System.out.println(player2Team1);
        scanner.nextLine();

        System.out.println("Please enter count frags player 3 team 1:");
        int player3Team1 = scanner.nextInt();
        System.out.println(player3Team1);
        scanner.nextLine();

        System.out.println("Please enter count frags player 4 team 1:");
        int player4Team1 = scanner.nextInt();
        System.out.println(player4Team1);
        scanner.nextLine();

        System.out.println("Please enter count frags player 5 team 1:");
        int player5Team1 = scanner.nextInt();
        System.out.println(player5Team1);
        scanner.nextLine();

        //Team 2:
            System.out.println("Please enter team 2 name:");
            String team2 = scanner.nextLine();
            System.out.println(team2);

            System.out.println("Please enter count frags player 1 team 2:");
            int player1Team2 = scanner.nextInt();
            System.out.println(player1Team2);
            scanner.nextLine();

            System.out.println("Please enter count frags player 2 team 2:");
            int player2Team2 = scanner.nextInt();
            System.out.println(player2Team2);
            scanner.nextLine();

            System.out.println("Please enter count frags player 3 team 2:");
            int player3Team2 = scanner.nextInt();
            System.out.println(player3Team2);
            scanner.nextLine();

            System.out.println("Please enter count frags player 4 team 2:");
            int player4Team2 = scanner.nextInt();
            System.out.println(player4Team2);
            scanner.nextLine();

            System.out.println("Please enter count frags player 5 team 2:");
            int player5Team2 = scanner.nextInt();
            System.out.println(player5Team2);
            scanner.nextLine();

            //Average for 2 team:
        double averageTeam1 = ((player1Team1+player2Team1+player3Team1+player4Team1+player5Team1)/5.0);
        System.out.println("Average " + team1 + ": " + (averageTeam1));

        double averageTeam2 = ((player1Team2+player2Team2+player3Team2+player4Team2+player5Team2)/5.0);
        System.out.println("Average " + team2 +": " + (averageTeam2));
        System.out.println();
        //Or also can do it with "int", but the values will be rounded

        int killsTeam1 = (player1Team1+player2Team1+player3Team1+player4Team1+player5Team1);
        int killsTeam2 = (player1Team2+player2Team2+player3Team2+player4Team2+player5Team2);

        if (killsTeam1 < killsTeam2) {
            System.out.println(("Win team " + team2 + "! Scored:" + (killsTeam2) + " points!"));
        } else if (killsTeam1 > killsTeam2) {
            System.out.println(("Win team " + team1 + "! Scored:" + (killsTeam1) + " points!"));
        } else {
            System.out.println("DRAW!");
        }




    }
}