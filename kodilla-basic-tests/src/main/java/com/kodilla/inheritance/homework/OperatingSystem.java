package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int yearOfProduction;

    public OperatingSystem(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }


    public void turnOnSystem() {
        System.out.println("System was turn on");
    }
    public void turnOffSystem() {
        System.out.println("System was turn off");
    }
    public int getYearOfProduction(){
        return yearOfProduction;
    }
    public void showYearOfproduction() {
        System.out.println("Rok produkcji: " + yearOfProduction);
    }
}
