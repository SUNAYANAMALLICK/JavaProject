package java17.sealed;

// Main class to demonstrate sealed classes in Java 17
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(3.0, 4.0);
        Shape shape3 = new Triangle(3.0, 4.0, 5.0);

        shape1.printType();  // Output: This is a circle.
        shape2.printType();  // Output: This is a rectangle.
        shape3.printType();  // Output: This is a triangle.
    }
}