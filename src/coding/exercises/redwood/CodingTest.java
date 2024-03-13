package coding.exercises.redwood;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class CodingTest {
    public static void main(String[] args) {

        // Write a program that prints the first 100 numbers.
        // For multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".

        Predicate<Integer> divByThree = (n) -> n % 3 == 0;
        Predicate<Integer> divByFive = (n) -> n % 5 == 0;


        IntStream.range(0, 100)
                .forEach(i -> {
                    System.out.println(
                            divByThree.test(i) && divByFive.test(i) ? "FizzBuzz" :
                                    divByThree.test(i) ? "Fizz" :
                                            divByFive.test(i) ? "Buzz" :
                                                    i
                    );


                });

    }
}
