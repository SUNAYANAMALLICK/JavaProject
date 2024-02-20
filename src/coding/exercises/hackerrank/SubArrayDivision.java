package coding.exercises.hackerrank;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubArrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        AtomicInteger count = new AtomicInteger(0);

        IntStream.range(0,s.size()).forEach(value -> {
            List<Integer> list = s.subList(value,value+m).stream().collect(Collectors.toList());
            if(list.stream().mapToInt(i->(int)i).sum()==d){
                count.set(count.get()+1);
            }
        });
        return count.get();

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2,2,1,3,2));
        System.out.println(birthday(arr, 3, 2));

    }
}
