package coding.exercises.hackerrank;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MagicSquare {

    public static int formingMagicSquare(List<List<Integer>> s) {

        int[][][] magicSquares = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
        };

        return Arrays.stream(magicSquares)
                .mapToInt(magicSquare -> {
                    int cost = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            cost += Math.abs(magicSquare[i][j] - s.get(i).get(j));
                        }
                    }
                    return cost;
                })
                .min()
                .orElse(Integer.MAX_VALUE);

    }


    public static void main(String[] args) {

        // [[5, 3, 4], [1, 5, 8], [6, 4, 2]]
        int result = formingMagicSquare(List.of(List.of(5,3,4), List.of(1,5,8), List.of(6,4,2)));
        System.out.println("The minimal total cost of converting the input square to a magic square is: " + result);

    }
}
