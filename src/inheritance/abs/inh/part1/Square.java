package inheritance.abs.inh.part1;

public class Square extends Rectangle {
    @Override
    public void color() {
        System.out.println("Square-color");
    }

    @Override
    public void position() {
        System.out.println("Square-position");

    }

    @Override
    public void peremeter() {
        System.out.println("Square-peremeter");
    }

    @Override
    public void area() {
        System.out.println("Square-area");
    }
}
