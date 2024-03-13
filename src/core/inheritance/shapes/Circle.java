package core.inheritance.shapes;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * getRadius() * getRadius();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * getRadius();
    }

    @Override
    public int getNumberOfSides() {
        return super.getNumberOfSides();
    }
}
