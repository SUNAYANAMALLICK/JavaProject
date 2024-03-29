package core.inheritance.shapes;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return getLength() * getWidth();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }
}
