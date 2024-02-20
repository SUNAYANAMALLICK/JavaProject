package java8.functionalinterface;

@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b); // Single abstract method

    // only one abstract method

    default int square(int x) { // default method
        return x * x;
    }

    static void staticMethod(){ // static method
        System.out.println("Static method in functional interface.");
    }
}
