package com.hillel.posokhov.homeworks.homework12;

public class Person {
    public static void main(String[] args) {
        personInfo("Will Smith", "New York", "3453647586");
        personInfo("Jackie Chan","Shanghai","5467879876");
        personInfo("Sherlock Holmes","London","86754345764");
    }

    static void personInfo(String name, String city, String number){
        System.out.println("Calling citizen " + name + " from city " + city + " you can at number " + number + '.');
    }
}
