package principle.solid.liscov.resolve;

interface Shape {
    int area();
}

class Rectangle implements Shape {
    private int height;
    private int width;

    @Override
    public int area() {
        return height * width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

class Square implements Shape {
    private int side;

    @Override
    public int area() {
        return side * side;
    }

    public void setSide(int i) {
        this.side = i;
    }

    public int getSide() {
        return this.side;
    }
}
class Circle implements Shape{
    private int radius;

    @Override
    public int area() {
        return (22/7)*radius*radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int i) {
        this.radius = i;
    }
}

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle();
        ((Rectangle) rectangle).setHeight(4);
        ((Rectangle) rectangle).setWidth(10);
        System.out.println(String.format("Rectangle[%d,%d] = Area[%d]", ((Rectangle) rectangle).getHeight(), ((Rectangle) rectangle).getWidth(), rectangle.area()));
        Shape square = new Square();
        ((Square) square).setSide(4);
        System.out.println(String.format("Square[%d] = Area[%d]", ((Square) square).getSide(),square.area()));
        Shape circle = new Circle();
        ((Circle) circle).setRadius(4);
        System.out.println(String.format("Circle[%d] = Area[%d]", ((Circle) circle).getRadius(),circle.area()));

    }
}