package com.hillel.posokhov.homeworks.homework17.main;

import com.hillel.posokhov.homeworks.homework17.terms.Drinks;
import com.hillel.posokhov.homeworks.homework17.terms.DrinksMachine;
import com.hillel.posokhov.homeworks.homework17.terms.MakeDrinks;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int totalPrise = 0;
    private static int counterDrinks = 0;

    public static void main(String[] args) {
        run();
        System.out.println("Сделано напитков: " + counterDrinks);
        System.out.println("Общая стоимость: " + totalPrise);
        scanner.close();
    }
        public static void run() {


            System.out.println("Выберите напиток из списка:\n" +
                    DrinksMachine.COFFEE + " - " + Drinks.CoffeePrise + ".\n" +
                    DrinksMachine.TEA + " - " + Drinks.TeaPrise + ".\n" +
                    DrinksMachine.LEMONADE + " - " + Drinks.LemonadePrise + ".\n" +
                    DrinksMachine.MOJITO + " - " + Drinks.MojitoPrise + ".\n" +
                    DrinksMachine.SODA + " - " + Drinks.SodaPrise + ".\n" +
                    DrinksMachine.COCA_COLA + "- " + Drinks.CocaColaPrise + '.');

            while (true) {
                DrinksMachine drinksMachine = getDrink();
                if (drinksMachine == null) {
                    return;
                }
                switch (drinksMachine) {
                    case COFFEE:
                        MakeDrinks.coffeeMaking();
                        totalPrise += Drinks.CoffeePrise;
                        counterDrinks++;
                        break;
                    case TEA:
                        MakeDrinks.teaMaking();
                        totalPrise += Drinks.TeaPrise;
                        counterDrinks++;
                        break;
                    case LEMONADE:
                        MakeDrinks.lemonadeMaking();
                        totalPrise += Drinks.LemonadePrise;
                        counterDrinks++;
                        break;
                    case MOJITO:
                        MakeDrinks.mojitoMaking();
                        totalPrise += Drinks.MojitoPrise;
                        counterDrinks++;
                        break;
                    case SODA:
                        MakeDrinks.sodaMaking();
                        totalPrise += Drinks.SodaPrise;
                        counterDrinks++;
                        break;
                    case COCA_COLA:
                        MakeDrinks.CocaColaMaking();
                        totalPrise += Drinks.CocaColaPrise;
                        counterDrinks++;
                        break;
                }
            }
        }

        private static DrinksMachine getDrink() {
            System.out.println("Выберите напиток или нажмите: STOP");
            while (true) {
                String stop = scanner.next().toUpperCase();
                if(stop.equals("STOP")) {
                    return null;
                }
                for (DrinksMachine value : DrinksMachine.values()) {
                    if(stop.equals(value.toString())) {
                        return DrinksMachine.valueOf(stop);
                    }

                }
            }
        }

    }
