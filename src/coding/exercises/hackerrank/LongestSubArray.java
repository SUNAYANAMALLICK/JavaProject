package coding.exercises.hackerrank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestSubArray {

    public static List<List<Integer>> breakList(List<Integer> list) {
        List<List<Integer>> sublists = new ArrayList<>();
        //  Collections.sort(list);
        list.sort(Integer::compareTo); // Sort the list

        List<Integer> sublist = new ArrayList<>();
        sublist.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            int previous = sublist.get(sublist.size() - 1);
            int countVal = (int) sublist.stream().filter(j -> current - j > 1).count();

            if ((current - previous <= 1 || current == previous) && (countVal == 0)) {
                sublist.add(current);
            } else if (countVal > 0) {
                sublists.add(sublist);
                sublist = new ArrayList<>();
                sublist.add(current);
            } else {
                sublists.add(sublist);
                sublist = new ArrayList<>();
                sublist.add(current);
            }
        }

        sublists.add(sublist); // Add the last sublist
        return sublists;
    }

    public static void main(String[] args) {

        List<Integer> elements = new LinkedList<>(List.of(1, 1, 2, 2, 4, 4, 5, 5, 5));
        List<List<Integer>> lists = breakList(elements);

        lists.stream().map(list -> lists.size()).collect(Collectors.toList()).stream().mapToInt(i -> (int) i).max().getAsInt();

        System.out.println(elements);
        System.out.println(breakList(elements));

        List<Integer> elements1 = new LinkedList<>(List.of(4, 6, 5, 3, 3, 1));
        System.out.println(elements1);
        System.out.println(breakList(elements1));

        List<Integer> elements2 = new LinkedList<>(List.of(1, 2, 2, 3, 1, 2));
        System.out.println(elements2);
        System.out.println(breakList(elements2));

    }
}
