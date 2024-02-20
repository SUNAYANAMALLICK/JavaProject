package coding.exercises.techmahindra;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest {

    public static void prob1(){


        List<Integer> inputList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Desired sum
        int targetSum = 10;

        System.out.println(inputList);

        // Create a map to store pairs of elements that add up to the sum
        Map<Integer, List<List<Integer>>> sumPairMap = inputList.stream()
                .flatMap(i ->
                        inputList.stream()
                                .map(j -> Arrays.asList(i, j))
                )
                .filter(pair -> pair.get(0) + pair.get(1) == targetSum)
                .collect(Collectors.groupingBy(pair -> pair.get(0) + pair.get(1)));

        System.out.println(sumPairMap);


    }

    public static int nthHighest(List<Integer> numbers, int n){
        System.out.println(numbers);
        return numbers.stream().sorted(Comparator.reverseOrder()).
                collect(Collectors.toList()).get(n-1);
    }


    public static List<Integer> nthBreak(List<Integer> numbers, int n){
        System.out.println(numbers);
        List<Integer> part1 = numbers.stream().filter(x->numbers.indexOf(x)<numbers.size()-n).collect(Collectors.toList());
        List<Integer> part2 = numbers.stream().filter(x->numbers.indexOf(x)+1>numbers.size()-n).collect(Collectors.toList());
        System.out.println(part1);
        System.out.println(part2);
        part2.addAll(part1);

        return part2;
    }



    public static void main(String[] args) {

 // prob1();
    List<Integer> numbers = List.of(9,1,3,4,6);
     System.out.println(
             nthHighest(numbers, 2)
     );

//        List<Integer> numbers2 = List.of( 1,2,3,4,5,6,7);
//        System.out.println(
//                nthBreak(numbers2, 2)
//        );


    }
}
