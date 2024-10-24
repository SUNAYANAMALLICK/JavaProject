package coding.exercises.infosys.uk;

public class CodingTest {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle();
        rectangle.setA(2);
        rectangle.setB(3);

        System.out.println(String.format(" Rectangle [%s, %s] : Area : [%s]", rectangle.getA(), rectangle.getB(), rectangle.getArea()));

        Circle circle = new Circle();
        circle.setA(3);

        System.out.println(String.format(" Circle [%s] : Area : [%s]", circle.getA(), circle.getArea()));




    }
}
