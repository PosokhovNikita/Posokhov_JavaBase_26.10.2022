package com.hillel.posokhov.homeworks.homework17.terms;

public class MakeDrinks {
    public static void coffeeMaking() {
        System.out.println(DrinksMachine.COFFEE + " готовится. " + "Цена напитка: " + Drinks.CoffeePrise + " грн");
        System.out.print("Ваш " + DrinksMachine.COFFEE + " готов");
        System.out.println();

    }

    public static void teaMaking() {
        System.out.println(DrinksMachine.TEA + " готовится. " + "Цена напитка: " + Drinks.TeaPrise + " грн");
        System.out.print("Ваш " + DrinksMachine.TEA + " готов");
        System.out.println();
    }

    public static void lemonadeMaking() {
        System.out.println(DrinksMachine.LEMONADE + " готовится. " + "Цена напитка: " + Drinks.LemonadePrise + " грн");
        System.out.print("Ваш " + DrinksMachine.LEMONADE + " готов");
        System.out.println();
    }

    public static void mojitoMaking() {
        System.out.println(DrinksMachine.MOJITO + " готовится. " + "Цена напитка: " + Drinks.MojitoPrise + " грн");
        System.out.print("Ваш " + DrinksMachine.MOJITO + " готов");
        System.out.println();
    }

    public static void sodaMaking() {
        System.out.println("Достаю  " + DrinksMachine.SODA + ". Цена напитка: " + Drinks.SodaPrise + " грн");
        System.out.print("Вот ваша " + DrinksMachine.SODA);
        System.out.println();
    }

    public static void CocaColaMaking() {
        System.out.println("Достаю  " + DrinksMachine.COCA_COLA + ". Цена напитка: "+ Drinks.CocaColaPrise + " грн");
        System.out.print("Вот ваша "+ DrinksMachine.COCA_COLA);
        System.out.println();
    }
}
