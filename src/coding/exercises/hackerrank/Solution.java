package coding.exercises.hackerrank;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'workbook' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY arr
     */



    public static int workbook(int n, int k, List<Integer> arr) {
        // Write your code here


        HashMap<Integer, List<Integer>> map = new HashMap();

        AtomicInteger key = new AtomicInteger();
        int count = 0;
        int chapter = 1;

        for(Integer value:arr){
            List<Integer> values = IntStream.rangeClosed(1,value).boxed().collect(toList());

            List<List<Integer>> sublists = IntStream.range(0, (values.size() + k - 1) / k)
                    .mapToObj(i -> values.subList(i * k, Math.min(i * k + k, values.size())))
                    .collect(Collectors.toList());

            sublists.stream().forEach(list->{

                key.set(key.get() + 1);
                map.put(key.get(),list);

            });

            System.out.println(map);
            chapter++;




        }

        return (int)map.entrySet().stream().filter(entry -> entry.getValue().contains(entry.getKey())).count();



    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        int n = 5;

        int k = 3;

        List<Integer> arr = List.of(4, 2, 6, 1, 10);

        int result = Result.workbook(n, k, arr);

        System.out.println(result);
    }
}
