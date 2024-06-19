package core.polymorphism;

import core.polymorphism.Shape;

public class Triangle extends Shape {

    private double lengthA;
    private double lengthB;
    private double lengthC;

    @Override
    public double calculateArea() {
        double s = (getLengthA() + getLengthB() + getLengthC() )/2 ;
        return Math.sqrt( s * (s-getLengthA() * (s-getLengthB()) * (s-getLengthC())));
    }

    @Override
    public int getNumberOfSides() {
        return 3;
    }

    @Override
    public double calculatePerimeter() {
        return getLengthA() + getLengthB() + getLengthC();
    }

    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }

    public double getLengthC() {
        return lengthC;
    }

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
    }
}
