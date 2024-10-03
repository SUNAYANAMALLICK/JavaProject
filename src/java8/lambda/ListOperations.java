package java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Bob");

        names.stream().forEach(name->System.out.println(name));

        // Intermediate operations: filter and map
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("B")) // Non-terminal
                .map(String::toUpperCase)             // Non-terminal
                .distinct()                           // Non-terminal
                .collect(Collectors.toList());        // Terminal operation

        System.out.println(filteredNames); // Output: [BOB]

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7);

        // Terminal operation: reduce
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)    // Non-terminal
                .reduce(0, Integer::sum);   // Terminal

        System.out.println("Sum of even numbers: " + sum); // Output: 10


    }
    }
