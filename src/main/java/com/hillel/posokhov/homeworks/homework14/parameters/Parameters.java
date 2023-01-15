package com.hillel.posokhov.homeworks.homework14.parameters;

public class Parameters {
    private int weight,steps, age = 2020;
    private final int day,month,year;
    private final String name,email,numberPhone;
    private String surname,pressure;
    public String getNumberPhone() {
        return numberPhone;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
    public int getAge() {
        return (age - year);
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public int getWeight() {
        return weight;
    }
    public int getSteps() {
        return steps;
    }
    public String getPressure() {
        return pressure;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getSurname() {
        return surname;
    }
    public Parameters(int day, int month, int year, int weight, int steps,
                      String pressure, String name, String email, String surname, String numberPhone) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.weight = weight;
        this.steps = steps;
        this.pressure = pressure;
        this.name = name;
        this.email = email;
        this.surname = surname;
        this.numberPhone = numberPhone;
    }
    public void printAccountInfo(){
        System.out.println("Information about user:");
        System.out.println("Date of birthday: " + getDay()+ '.' + getMonth() + '.' + getYear() + ".  Weight: "
                + getWeight() + ". Steps today: " + getSteps() + ". Pressure: " + getPressure() + ". Full name: "
                + getName() + ' ' + getSurname() + ". E-mail: " + getEmail() + ". Number phone: "
                + getNumberPhone() + '.');
        System.out.println("Age user: " + getAge());
    }

}
