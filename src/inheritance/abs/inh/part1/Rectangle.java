package inheritance.abs.inh.part1;

public abstract class Rectangle implements Shape {
    @Override
    public void area() {
        System.out.println("Rectangle-area");
    }

    @Override
    public void peremeter() {
        System.out.println("Rectangle-peremeter");

    }

    @Override
    public void color() {
        System.out.println("Rectangle-color");

    }

    @Override
    public void position() {
        System.out.println("Rectangle-position");

    }
}
