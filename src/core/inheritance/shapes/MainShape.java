package core.inheritance.shapes;

public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3.22);

        System.out.println(String.format(" Circle [%s] : Area : [%s] : Perimeter : [%s] ", circle.getRadius(), circle.calculateArea(), circle.calculatePerimeter()));

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(1.11);
        rectangle.setWidth(2.21);

        System.out.println(String.format(" Rectangle [%s, %s] : Area : [%s] : Perimeter : [%s] ", rectangle.getLength(), rectangle.getWidth(), rectangle.calculateArea(), rectangle.calculatePerimeter()));


        Triangle triangle = new Triangle();
        triangle.setLengthA(1.11);
        triangle.setLengthB(3.32);
        triangle.setLengthC(2.21);

        System.out.println(String.format(" Triangle [%s, %s, %s] : Area : [%s] : Perimeter : [%s] ", triangle.getLengthA(), triangle.getLengthB(), triangle.getLengthC(),  triangle.calculateArea(), triangle.calculatePerimeter()));

    }
    }
