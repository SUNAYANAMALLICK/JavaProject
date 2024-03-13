package coding.exercises.cgg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest {

    public static void main(String[] args) {

        int sum = IntStream.range(1, 11).mapToObj(i -> (int) i).mapToInt(i -> (int) i).sum();
        System.out.println(sum);

        int sum2 = (10 * (10 + 1)) / 2;

        System.out.println(sum2);

    }
}
