package principle.solid.openclosed.violation;


public class Shape {
    private String shapeType;
    private double radius;
    private double length;
    private double breadth;
  
    public Shape(String shapeType, double radius, double length, double breadth) {
        this.shapeType = shapeType;
        this.radius = radius;
        this.length = length;
        this.breadth = breadth;
    }
  
    public double calculateArea() {
        if ("Circle".equals(shapeType)) {
            return Math.PI * radius * radius;
        } else if ("Rectangle".equals(shapeType)) {
            return length * breadth;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Shape circle = new Shape("Circle", 2.3d, 0, 0);
        System.out.println("Circle Area : "+circle.calculateArea());

        Shape rectangle = new Shape("Rectangle", 0, 3d, 4d);
        System.out.println("Rectangle Area : "+rectangle.calculateArea());
    }
}
