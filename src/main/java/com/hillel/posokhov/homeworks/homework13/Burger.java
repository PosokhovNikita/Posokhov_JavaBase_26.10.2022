package com.hillel.posokhov.homeworks.homework13;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    boolean doubleMeat;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Classic burger contains: " + bun + ", " + meat + ", " + cheese + ", " + greens
                + ", " + mayonnaise + ".");
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Diet burger contains: " + bun + ", " + meat + ", " + cheese + ", " + greens + ".");
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, boolean doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;
        System.out.println("Burger with double meat contains: " + bun + ", " + meat + " count = " + (doubleMeat ? 2 : 1) +
                ", " + cheese + ", " + greens + ", " + mayonnaise + ". ");
    }
}
