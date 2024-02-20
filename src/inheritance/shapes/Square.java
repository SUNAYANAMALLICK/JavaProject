package inheritance.shapes;

public class Square extends Shape{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return getA()*getA();
    }

    @Override
    public double calculatePerimeter() {
        return 4 * getA();
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }
}
