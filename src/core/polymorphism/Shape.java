package core.polymorphism;

public abstract class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }

    public abstract int getNumberOfSides() ;

    public abstract double calculateArea();

    public abstract double calculatePerimeter() ;

}
