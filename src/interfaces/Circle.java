package interfaces;

public class Circle implements Shape, Calculate{

    private float r;

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void remove() {
        System.out.println("Removing a circle. ");
    }

    @Override
    public void perimeter() {
        System.out.println(2*3.14*getR());
    }

    @Override
    public void area() {
        System.out.println(3.14*getR()*getR());
    }
}
