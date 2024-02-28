package inheritance.abs.inh.part1;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Shape shape = new Square(); // can be instantiated
        shape.color();
        shape.position();
        shape.area();
        shape.position();

        Shape shape1 =new Rectangle() { // can not be instantiated as it is abstract class

        };
        shape1.color();
        shape1.position();
        shape1.area();
        shape1.position();



    }
}
