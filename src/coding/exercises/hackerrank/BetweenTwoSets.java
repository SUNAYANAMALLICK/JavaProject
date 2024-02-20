package coding.exercises.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

    public static void main(String[] args) {
        List<Integer> arr = List.of(2,6);
        List<Integer> brr = new ArrayList<>(Arrays.asList(24,36));


        int total = getTotalX(arr, brr);
        System.out.println(total);
    }

        private static int findLCM(List<Integer> a) {
        return a.stream().reduce(1, (x, y) -> x * (y / findGCD(x, y)));

    }

    private static int findGCD(List<Integer> array) {
        return array.stream()
                .reduce(BetweenTwoSets::findGCD)
                .orElse(1);
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here

        int lcm = findLCM(a);
        int gcd = findGCD(b);

        int count = 0;
        for (int i = lcm; i <= gcd; i += lcm) {
            if (gcd % i == 0) {
                count++;
            }
        }

        return count;

    }
}
