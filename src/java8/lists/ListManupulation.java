package java8.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListManupulation {
    // Given a list of integers, square each element and filter out the numbers that are greater than 10.
    public static void getSquare(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream()
                .map(n -> n * n)
                .filter(n -> n > 10)
                .collect(Collectors.toList());

        System.out.println(result);

    }
    // Given a list of strings, convert each string to uppercase and concatenate them into a single string.
    public static void convertToUppercase(){
        List<String> strings = Arrays.asList("java", "8", "stream", "api");
        String result = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(result);

    }

    // Given a list of integers, find the maximum value using the reduce operation.
    public static void printMaxVal(){
        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);
        System.out.println(max.orElse(-1));
    }

    // Given a list of persons, group them by age.

    public static void groupBy(){
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 25),
                new Person("David", 35)
        );

        Map<Integer, List<Person>> groupedByAge = persons.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(groupedByAge);
    }

    // Given a list of lists, flatten it into a single list.
    public static void flatMap(){
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flattenedList);

    }

    // Given a list of integers, find the average.

    public static void findAverage(){
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0);
        System.out.println(average);

    }

    public static void main(String[] args) {

    }


    }
