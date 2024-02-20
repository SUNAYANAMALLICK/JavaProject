package java9;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListManupulation {

    // Create an immutable list using the List.of method.
    public static void immutableList(){
        List<String> immutableList = List.of("Java", "9", "Immutable");
        System.out.println(immutableList);
    }
//Use the Stream API enhancements in Java 9 to takeWhile and dropWhile elements from a stream.
    public static void streamEnhancements(){
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

       // System.out.println(numbers.toList());

        List<Integer> result = numbers.takeWhile(n -> n < 5)
                .collect(Collectors.toList());

        System.out.println(result);
    }
    // Use the Optional.orElseThrow method to throw a custom exception if the optional value is not present.
    public static void optionalOrElseThrowExample() {
            Optional<String> name = Optional.ofNullable(null);

            String result = name.orElseThrow(() -> new RuntimeException("Name not found"));
            System.out.println(result);
        }
        //Use the new factory methods for creating immutable collections in Java 9.
    public static void  collectionsFactoryMethodsExample() {
            List<String> list = List.of("Java", "9", "Collections");
            Set<Integer> set = Set.of(1, 2, 3, 4, 5);
            Map<String, Integer> map = Map.of("One", 1, "Two", 2, "Three", 3);

            System.out.println(list);
            System.out.println(set);
            System.out.println(map);
        }

    public static void main(String[] args) {
        immutableList();
        streamEnhancements();
    }
}
