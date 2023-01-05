package com.kodilla.inheritance.homework;

public class TestOperatingSystem {
    public static void main(String[]args){
        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.turnOnSystem();

        WindowsOperatingSystem windowsOperatingSystem = new WindowsOperatingSystem(1981);
        windowsOperatingSystem.turnOnSystem();
        windowsOperatingSystem.showYearOfproduction();
        System.out.println(windowsOperatingSystem.getYearOfProduction());

        macOsOperatingSystem macOsOperatingSystem = new macOsOperatingSystem(2002);
        macOsOperatingSystem.turnOnSystem();
        macOsOperatingSystem.showYearOfproduction();
        System.out.println(macOsOperatingSystem.getYearOfProduction());


    }
}
