package core.polymorphism;

import core.polymorphism.Shape;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public int getNumberOfSides() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 3.14 * getRadius()*getRadius();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * getRadius();
    }

}
