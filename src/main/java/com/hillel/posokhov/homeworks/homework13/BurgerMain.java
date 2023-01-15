package com.hillel.posokhov.homeworks.homework13;

public class BurgerMain {
        public static void main(String[] args) {
            Burger classicBurger = new Burger("bun", "pork", "cheddar", "salad",
                    "mayonnaise");
            Burger dietBurger = new Burger("bun", "chicken", "gouda", "salad");
            Burger doubleBurger = new Burger("bun", "beef", "cheddar", "salad",
                    "mayonnaise",true);
        }
    }

