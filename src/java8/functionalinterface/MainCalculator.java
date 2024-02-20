package java8.functionalinterface;

public class MainCalculator {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        System.out.println("Result of addition: " + addition.calculate(5, 3));


        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Result of multiplication: " + multiplication.calculate(5, 3));

        Calculator.staticMethod();

    }
}
