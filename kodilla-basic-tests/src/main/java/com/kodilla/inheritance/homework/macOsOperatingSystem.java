package com.kodilla.inheritance.homework;

public class macOsOperatingSystem extends OperatingSystem {


    public macOsOperatingSystem(int yearOfProduction) {
        super(yearOfProduction);
    }


    @Override
    public void turnOnSystem() {
        System.out.println("System was turn on when turn computer");
    }

    @Override
    public void turnOffSystem() {
        System.out.println("System was turn on when you close the computer");
    }
}
