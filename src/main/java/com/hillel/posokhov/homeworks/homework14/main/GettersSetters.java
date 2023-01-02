package com.hillel.posokhov.homeworks.homework14.main;

import com.hillel.posokhov.homeworks.homework14.parameters.Parameters;

public class GettersSetters {
    public static void main(String[] args) {
        Parameters parameters = new Parameters(20,12,2000,80,16000,"100/80",
                "Nikita","itposokhovnikita@gmail.com","Posokhov","+380632449393");
        Parameters parameters1 = new Parameters(30,10,1999,45,14000,"90/60",
                "Iryna","irynakotenko@gmail.com","Kotenko","+380660354040");
        Parameters parameters2 = new Parameters(16,7,1976,50,13800,"95/70",
                "Natalia","kotenko@gmail.com","Kotenko","+380973540540");
        Parameters parameters3 = new Parameters(21,12,1975,95,5000,"130/80",
                "Evgeniy","evgkotenko@gmail.com","Kotenko","+380673741550");
        parameters.printAccountInfo();
        parameters1.printAccountInfo();
        parameters2.printAccountInfo();
        parameters3.printAccountInfo();
        parameters.setPressure("120/90");
        parameters.setSteps(20000);
        parameters1.setWeight(48);
        parameters1.setSurname("Posokhova");
        System.out.println();
        System.out.println("After changes:");
        parameters.printAccountInfo();
        parameters1.printAccountInfo();
    }
}
