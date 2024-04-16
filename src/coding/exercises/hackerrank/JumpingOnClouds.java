package coding.exercises.hackerrank;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class JumpingOnClouds {

    public static void main(String[] args) {
        int result = getCount(List.of(0,0,1,0,0,1,0));
        System.out.println(result);


    }

    private static int getCount(List<Integer> integers) {

        AtomicInteger count = new AtomicInteger();

        IntStream.range(0,integers.size())
                .filter(i->integers.get(i)==1)
                .forEach(i->count.set(count.get()+1));
        return count.get();
    }
}
