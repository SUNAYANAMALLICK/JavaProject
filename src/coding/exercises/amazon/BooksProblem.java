package coding.exercises.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class BooksProblem {
    public static void main(String[] args) {

        List<Integer> books = List.of(3, 3, 1, 2, 2, 2);
        List<Integer> max = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        AtomicInteger maxFrequency = new AtomicInteger(0);

        System.out.println(books);
        books.stream().forEach(i -> {
            int count = map.getOrDefault(i, 0) + 1;
            map.put(i, count);
            maxFrequency.set(Math.max(maxFrequency.get(), count));
            max.add(maxFrequency.get());
            System.out.println(String.format("[%s,%s]->%s", i, map, max));
        });
        System.out.println(max);

    }
}
