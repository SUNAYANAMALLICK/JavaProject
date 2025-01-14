package principle.solid.openclosed.solution;


public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2.3d);
        System.out.println("Circle Area : "+circle.calculateArea());

        Shape rectangle = new Rectangle(3d, 4d);
        System.out.println("Rectangle Area : "+rectangle.calculateArea());
    }
}
