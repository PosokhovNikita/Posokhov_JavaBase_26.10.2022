package com.hillel.posokhov.homeworks.homework4;

import java.text.DecimalFormat;

public class LeeMinDynasty {
    public static void main(String[] args) {

        //Dynasty Lee:

        int PowerWarriorLee = 13;
        int PowerArcherLee = 24;
        int PowerRiderLee = 46;
        int AmountOfTroopsLee = 860;

        System.out.println("Number of troops in each class Lee:"+(AmountOfTroopsLee));
        System.out.println("Overall attack rate Lee:"+((PowerWarriorLee*AmountOfTroopsLee)+(PowerArcherLee*AmountOfTroopsLee)+(PowerRiderLee*AmountOfTroopsLee)));
        System.out.println();

        //Or like this:
        // System.out.println("Overall attack rate Lee:"+((PowerWarriorLee+PowerArcherLee+PowerRiderLee)*AmountOfTroopsLee));

        //Dynasty Min:

        int PowerWarriorMin = 9;
        int PowerArcherMin = 35;
        int PowerRiderMin = 12;

        AmountOfTroopsLee *= 1.5;

        System.out.println("Number of troops in each class Min:"+(AmountOfTroopsLee));

        AmountOfTroopsLee /= 1.5;   //to return a value
        int AmountOfTroopsMin = 1290;

        System.out.println("Overall attack rate Min:"+((PowerWarriorMin*AmountOfTroopsMin)+(PowerArcherMin*AmountOfTroopsMin)+(PowerRiderMin*AmountOfTroopsMin)));

        //Or like this:
        //System.out.println("Overall attack rate Min:"+((PowerWarriorMin+PowerArcherMin+PowerRiderMin)*AmountOfTroopsMin));

        int OverallAttackRateLee = 71380;
        int OverallAttackRateMin = 72240;

        System.out.println();
        System.out.println("Common attack of two dynasties:"+(OverallAttackRateLee+OverallAttackRateMin));
    }
}
