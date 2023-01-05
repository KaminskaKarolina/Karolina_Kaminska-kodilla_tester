package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double surfaceArea;
    private double perimeter;


    public Shape() {
        this.surfaceArea = surfaceArea;
        this.perimeter = perimeter;

    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public abstract void CalculateSurfaceArea();
    public abstract void CalculatePerimeter();



}
