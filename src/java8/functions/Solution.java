package java8.functions;

import java.util.function.*;

public class Solution {
    public static void main(String[] args) {

        // The Supplier interface represents a function that supplies (or produces) a value without taking any arguments.
        // It contains a single method
        Supplier<Double> randomNumberSupplier = () -> Math.random();
        System.out.println(String.format("Random Number : %s",randomNumberSupplier.get()));

        //The Consumer interface represents an operation that accepts a single input argument and returns no result.
        // It contains a single method:
        Consumer<String> messagePrinter = System.out::println;
        messagePrinter.accept("Good Afternoon");

        //test a condition on an input and return a boolean value indicating the result of that test.
        Predicate<Integer> checkEven = num -> num%2==0;
        messagePrinter.accept(String.format("Check Even - Predicate : %s", checkEven.test(21)));

        // It represents a predicate (a boolean-valued function) that takes two arguments (T and U) and returns a boolean.
        // This interface is used when you need to test a condition that involves two input parameters.
        BiPredicate<String,String> checkStartsWith = (str1,str2) -> str1.startsWith(str2);
        messagePrinter.accept(String.format("Check Even - Predicate : %s", checkStartsWith.test("Sunayana","Sun")));

        //It represents a function that accepts one argument and produces a result.
        // The argument and the result may be of different types.
        Function<Integer,Boolean> checkEvenFunction = num -> num%2==0 ;
        messagePrinter.accept(String.format("Check Even - Function : %s", checkEvenFunction.apply(22)));

        //It represents a function that accepts two arguments (T and U) and produces a result (R).
        // The arguments and the result may be of different types.
        BiFunction<Integer,Integer,Integer> addNumbers = (num1, num2) -> num1 + num2 ;
        messagePrinter.accept(String.format("addNumbers - BI Function : %s", addNumbers.apply(22,32)));

        //It represents an operation that takes a single input (of type T) and produces a result (also of type T).
        // Essentially, it is a specialization of the Function interface where both the input and output types are the same.
        // The UnaryOperator interface extends the Function interface and thus inherits the apply method from Function.
        UnaryOperator<Integer> square = num -> num * num;
        System.out.println("Square of 5: " + square.apply(5));

        // It represents an operation that takes two arguments (both of type T) and produces a result of the same type (T).
        // Essentially, it is a specialization of the BiFunction interface where the input and output types are the same.
        // The BinaryOperator interface extends the BiFunction interface and thus inherits the apply method from BiFunction.
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Addition of 5 and 3: " + add.apply(5, 3));


    }
}
