package java17.sealed;

// Rectangle is a subclass of Shape
public final class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void printType() {
        System.out.println("This is a rectangle.");
    }
}