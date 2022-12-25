package com.hillel.posokhov.homeworks.homework13;

public class Burger {
    String ing1 = "bun";
    String ing2 = "meat";
    String ing3 = "cheese";
    String ing4 = "greens";
    String ing5 = "mayonnaise";
    String ing6 = "double meat";

    public String usualBurger(String ing1, String ing2, String ing3, String ing4, String ing5) {
        return ing1 + ing2 + ing3 + ing4 + ing5;
    }

    public String dietBurger(String ing1, String ing2, String ing3, String ing4) {
        return ing1 + ing2 + ing3 + ing4;
    }

    public String doubleMeatBurger(String ing1, String ing3, String ing4, String ing5, String ing6) {
        return ing1 + ing3 + ing4 + ing5 + ing6;
    }

    void printBurgers(){
        System.out.print("Usual burger consist of: ");
        System.out.println(usualBurger(ing1, ", " + ing2, ", " + ing3, ", " + ing4, ", " + ing5));
        System.out.print("Diet burger consist of: ");
        System.out.println(dietBurger(ing1, ", " + ing2, ", " + ing3, ", " + ing4));
        System.out.print("Double meat burger consist of: ");
        System.out.println(doubleMeatBurger(ing1,", "+ ing3,", "+ ing4,", "+ ing5,", "+ ing6));
    }
}
