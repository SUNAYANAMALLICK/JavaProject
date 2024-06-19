package java17.sealed;

public sealed class Shape permits Circle, Rectangle, Triangle {
    // Common method in superclass
    public void printType() {
        System.out.println("This is a shape.");
    }
}