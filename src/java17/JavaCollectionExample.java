package java17;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;


public class JavaCollectionExample {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1,10).boxed().collect(Collectors.toList());
        System.out.println(list);

        int sum = list.stream().collect(Collectors.teeing(
                Collectors.minBy(Integer::compareTo),
                Collectors.maxBy(Integer::compareTo),
                (min,max)->min.get() + max.get()
        ));
        System.out.println(sum);


    }
    }
