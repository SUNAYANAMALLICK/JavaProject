package coding.exercises.oracle;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlgoProblem {


// total = 5, k = 3

    // {1,2,3}
    // 5 = 3 + 2
    // 5 = 2 + 2 + 1
    // 5 = 2 + 1 + 1 + 1
    // 5 = 1 + 1 + 1 + 1


    // i = 2
    // max = 2, 2<5, {2}, total = 5-2 = 3
    // max = 2, 2<5, {2,2}, total = 3-2 = 1
    // max = 2, 2>1,
    // max = 1, 1=1, {2,2,1}, total = 0

    // i = 2
    // max = 2, 2<5, {2}, total = 5-2 = 3
    // max = 1, 1<3, {2,1}, total = 3-1 = 2
    // max = 1, 1<2, {2,1,1}, total = 2-1 = 1
    // max = 1, 1=1, {2,1,1,1}, total = 1-1 = 0

    public static List<List<Integer>> findCombinations(List<Integer> nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinationsHelper(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void findCombinationsHelper(List<Integer> nums, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        IntStream.range(start,nums.size()).forEach(i->{
            int num = nums.get(i);
            if (target - num >= 0) {
                current.add(num);
                findCombinationsHelper(nums, target - num, i, current, result);
                current.remove(current.size() - 1);
            }
        });


    }


    public static int getCount(int total, int k){

        List<Integer> inputList = IntStream.range(1,k+1).boxed().collect(Collectors.toList());
        int targetSum = total;

        List<List<Integer>> combinations = findCombinations(inputList, targetSum);

        System.out.println(combinations.stream().collect(Collectors.toList()));


        return combinations.size();
    }

    public static void main(String[] args) {
        System.out.println(getCount(5,3));
    }
    }
