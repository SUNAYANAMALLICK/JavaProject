package java8.supplierconsumer;

import java.util.function.*;

public class Solution {
    public static void main(String[] args) {

        Supplier<Double> randomNumberSupplier = () -> Math.random();
        System.out.println(String.format("Random Number : %s",randomNumberSupplier.get()));

        Consumer<String> messagePrinter = System.out::println;
        messagePrinter.accept("Good Afternoon");

        Predicate<Integer> checkEven = num -> num%2==0;
        messagePrinter.accept(String.format("Check Even - Predicate : %s", checkEven.test(21)));

        BiPredicate<String,String> checkStartsWith = (str1,str2) -> str1.startsWith(str2);
        messagePrinter.accept(String.format("Check Even - Predicate : %s", checkStartsWith.test("Sunayana","Sun")));

        Function<Integer,Boolean> checkEvenFunction = num -> num%2==0 ;
        messagePrinter.accept(String.format("Check Even - Function : %s", checkEvenFunction.apply(22)));

        BiFunction<Integer,Integer,Integer> addNumbers = (num1, num2) -> num1 + num2 ;
        messagePrinter.accept(String.format("addNumbers - BI Function : %s", addNumbers.apply(22,32)));

        UnaryOperator<Integer> square = num -> num * num;
        System.out.println("Square of 5: " + square.apply(5));

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Addition of 5 and 3: " + add.apply(5, 3));


    }
}
