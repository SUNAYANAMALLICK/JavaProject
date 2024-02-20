package coding.exercises.hackerrank;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GetKeyWithMaximumValueFromMap {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here

        return arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(0);

    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,1,3,5);
        System.out.println(migratoryBirds(arr));

    }

}
