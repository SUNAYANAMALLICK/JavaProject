package collections.exercises;

import java.util.*;
import java.util.stream.IntStream;

public class BooksProblemUsingMap {

    public static void main(String[] args) {
        List<Integer> booksIDs = List.of(7,7,2,2,1,-7,-2,1,1,-1);
        System.out.println(booksIDs);
        System.out.println(usingHashMap(booksIDs));
        System.out.println(usingTreeMap(booksIDs));
        System.out.println(usingHashTable(booksIDs));
        System.out.println(usingLinkedHashMap(booksIDs));


    }

    private static List<Integer> usingLinkedHashMap(List<Integer> booksIDs) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> countList = new ArrayList<>();
        IntStream.range(0,booksIDs.size())
                .forEach(index->{
                    int key = Math.abs(booksIDs.get(index));
                    if(map.keySet().contains(key)){
                        map.put(key,  booksIDs.get(index)<1 ? map.get(key)-1 : map.get(key) + 1);
                    }else {
                        map.put(key, booksIDs.get(index)<1 ? -1 : 1);
                    }
                    countList.add(map.values().stream().mapToInt(i->(int)i).max().orElse(0));

                });
        return countList;

    }

    private static List<Integer> usingHashMap(List<Integer> booksIDs) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> countList = new ArrayList<>();
        IntStream.range(0,booksIDs.size())
                .forEach(index->{
                    int key = Math.abs(booksIDs.get(index));
                    if(map.keySet().contains(key)){
                        map.put(key,  booksIDs.get(index)<1 ? map.get(key)-1 : map.get(key) + 1);
                    }else {
                        map.put(key, booksIDs.get(index)<1 ? -1 : 1);
                    }
                    countList.add(map.values().stream().mapToInt(i->(int)i).max().orElse(0));

                });
        return countList;

    }
  //  [7, 7, 2, 2, 1, -7, -2, 1, 1, -1]
  // [1, 2, 2, 2, 2, 2, 1, 2, 3, 2]

    private static List<Integer> usingTreeMap(List<Integer> booksIDs) {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        List<Integer> countList = new ArrayList<>();
        IntStream.range(0,booksIDs.size())
                .forEach(index->{
                    int key = Math.abs(booksIDs.get(index));
                    if(map.keySet().contains(key)){
                        map.put(key,  booksIDs.get(index)<1 ? map.get(key)-1 : map.get(key) + 1);
                    }else {
                        map.put(key, booksIDs.get(index)<1 ? -1 : 1);
                    }
                   // System.out.println(map);

                    countList.add(map.values().stream().mapToInt(i->(int)i).max().orElse(0));

                });
        return countList;

    }

    private static List<Integer> usingHashTable(List<Integer> booksIDs) {

        Hashtable<Integer, Integer> map = new Hashtable<>();
        List<Integer> countList = new ArrayList<>();
        IntStream.range(0,booksIDs.size())
                .forEach(index->{
                    int key = Math.abs(booksIDs.get(index));
                    if(map.keySet().contains(key)){
                        map.put(key,  booksIDs.get(index)<1 ? map.get(key)-1 : map.get(key) + 1);
                    }else {
                        map.put(key, booksIDs.get(index)<1 ? -1 : 1);
                    }
                    // System.out.println(map);

                    countList.add(map.values().stream().mapToInt(i->(int)i).max().orElse(0));

                });
        return countList;

    }
}
