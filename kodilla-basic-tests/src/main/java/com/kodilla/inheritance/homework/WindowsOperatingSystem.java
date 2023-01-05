package com.kodilla.inheritance.homework;

public class WindowsOperatingSystem extends OperatingSystem {
    public WindowsOperatingSystem(int yearOfProduction) {
        super(yearOfProduction);

    }


    @Override
    public void turnOnSystem() {
        System.out.println("System was turn on when you press the button");
    }

    public void turnOffSystem() {
        System.out.println("System was turn of when you press button");
    }
}