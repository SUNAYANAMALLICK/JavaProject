package coding.exercises.hackerrank;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class JumpingOnClouds {

    public static void main(String[] args) {
        int result = getCount(List.of(0,0,1,0,0,1,0));
        System.out.println(result);


    }

    private static int getCount(List<Integer> integers) {

        for (int i = 0; i < integers.size() - 2; i++) {
            if (integers.get(i) == 0 && integers.get(i + 1) == 0 && integers.get(i + 2) == 0) {
                integers.remove(i + 1); // Remove one zero
                break; // Exit loop after removing one zero
            }
        }


        LinkedList<Integer> list = new LinkedList<>(integers);
        AtomicInteger count = new AtomicInteger();
        integers.stream().forEach(i->{
            if(i==0){
                count.set(count.get()+1);
            }
        });


        IntStream.range(0,integers.size())
                .filter(i->integers.get(i)==1)
                .forEach(i->count.set(count.get()+1));
        return count.get();
    }
}
