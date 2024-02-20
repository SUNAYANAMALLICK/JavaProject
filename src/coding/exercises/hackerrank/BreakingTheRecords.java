package coding.exercises.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BreakingTheRecords {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(12,24,10,24));
        System.out.println(breakingRecords(arr));

    }


        public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

            AtomicInteger min = new AtomicInteger(scores.getFirst());
            AtomicInteger max = new AtomicInteger(scores.getFirst());
            AtomicInteger minCount = new AtomicInteger(0);
            AtomicInteger maxCount = new AtomicInteger(0);
            scores.stream().forEach(value->{
                if(value < min.get()){
                    min.set(value);
                    minCount.set(minCount.get()+1);
                } else if (value > max.get()) {
                    max.set(value);
                    maxCount.set(maxCount.get()+1);
                }
            });
            return new ArrayList<>(Arrays.asList(maxCount.get(),minCount.get()));

    }


}
