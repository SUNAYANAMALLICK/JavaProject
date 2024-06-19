package java17.sealed;

public final class Circle extends Shape implements Calculate {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void printType() {
        System.out.println("This is a circle.");
    }

    @Override
    public void perimeter() {

    }

    @Override
    public void area() {

    }
}