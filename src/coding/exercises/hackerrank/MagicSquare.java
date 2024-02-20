package coding.exercises.hackerrank;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MagicSquare {

    public static int formingMagicSquare(List<List<Integer>> s) {


        List<List<List<Integer>>> possibility = List.of(

                List.of(List.of(8, 1, 6),List.of(3, 5, 7),List.of(4, 9, 2)),
                List.of(List.of(6, 1, 8),List.of(7, 5, 3),List.of(2, 9, 4)),
                List.of(List.of(4, 9, 2),List.of(3, 5, 7),List.of(8, 1, 6)),
                List.of(List.of(2, 9, 4),List.of(7, 5, 3),List.of(6, 1, 8)),
                List.of(List.of(8, 3, 4),List.of(1, 5, 9),List.of(6, 7, 2)),
                List.of(List.of(4, 3, 8),List.of(9, 5, 1),List.of(2, 7, 6)),
                List.of(List.of(6, 7, 2),List.of(1, 5, 9),List.of(8, 3, 4)),
                List.of(List.of(2, 7, 6),List.of(9, 5, 1),List.of(4, 3, 8))
                );



        AtomicInteger min = new AtomicInteger(0);

        possibility.stream().forEach(permutation->{
            int cost = calculateCost(s, permutation);
            min.set(Math.min(min.get(), cost));

        });


        return min.get();
    }

    public static int calculateCost(List<List<Integer>> s, List<List<Integer>> permutation) {
        AtomicInteger cost = new AtomicInteger(0);
        IntStream.range(0,3)
                .forEach(i->{
                    IntStream.range(0,3).forEach(j->{
                        cost.set(cost.get() + (s.get(i).get(j) - permutation.get(i).get(j)));
                    });
                });
        return cost.get();
    }

    public static int calculateCost(int[][] s, int[][] permutation) {
        int cost = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cost += Math.abs(s[i][j] - permutation[i][j]);
            }
        }
        return cost;
    }

    public static void main(String[] args) {

        // [[5, 3, 4], [1, 5, 8], [6, 4, 2]]
        int result = formingMagicSquare(List.of(List.of(5,3,4), List.of(1,5,8), List.of(6,4,2)));
        System.out.println("The minimal total cost of converting the input square to a magic square is: " + result);

    }
}
