package collections.exercises;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BooksProblemUsingList {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();
        List<Integer> lList = new LinkedList<>();
        List<Integer> vList = new Vector<>();
        List<Integer> sList = new Stack<>();

        aList = IntStream.range(0,10).boxed().collect(Collectors.toList());
        lList = IntStream.range(0,10).boxed().collect(Collectors.toList());
        vList = IntStream.range(0,10).boxed().collect(Collectors.toList());
        sList = IntStream.range(0,10).boxed().collect(Collectors.toList());


        concModExceptionArrayList(aList);


    }

    private static void concModExceptionArrayList(List<Integer> aList) {


        Iterator<Integer> iterator = aList.iterator();

        try {
            while (iterator.hasNext()) {
                Integer element = iterator.next();
                System.out.println(element);
                // Concurrent modification: Adding a new element while iterating
                if (element.equals(2)) {
                    aList.add(10);  // This will throw ConcurrentModificationException
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
