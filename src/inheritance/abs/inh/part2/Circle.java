package inheritance.abs.inh.part2;

public class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    void color() {
        System.out.println(" Color id red.");
    }

}
