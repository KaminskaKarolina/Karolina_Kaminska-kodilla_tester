package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    double poleTrojkata = CalculateSurfaceArea(15,8);

    public Shape( double surfaceArea, double peramiter) {
        super(surfaceArea,peramiter);
    }

    @Override
    public void CalculateSurfaceArea(double podstawa,double wysokosc) {
        double poleT = (podstawa*wysokosc)/2;
                return poleT;


    }
    @Override
    public void CalculatePerimeter() {

    }
}
