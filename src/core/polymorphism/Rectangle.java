package core.polymorphism;

import core.polymorphism.Shape;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }

    @Override
    public double calculateArea() {
        return 2 * getLength() * getWidth();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (getWidth() + getLength());
    }
}