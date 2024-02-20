package coding.exercises.hcl;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest {

    public static void main(String[] args) {
run(3,3, new int[]{3,1,1});

    }

    public static void removeAndAddElement(LinkedList<Integer> stack, Integer movie, int position){
        stack.remove(position);
        stack.addFirst(movie);
    }

    public static String run(int n, int m, int[] movies) {
        /*
         * Write your code below; return type and arguments should be according to the problem's requirements
         */

        // stack -> 1 to n -> 1,2,3
        // m -> no of movies to watch -> 3
        // movies[] -> movies -> 3,1,1

        // 3 -> [2] -> [3,1,2]
        // 1 -> [1] -> [1,3,2]
        // 1 -> [0] -> [1,3,2]

        // output -> [2,1,0]

        List<Integer> output = new ArrayList<>();
        LinkedList<Integer> stack = new LinkedList<>();
        IntStream.rangeClosed(1,n).forEach(stack::add);

        IntStream.range(0,m)
                .forEach(pos -> {
                    int element = movies[pos];
                    int index = stack.indexOf(element);
                    removeAndAddElement(stack,element,index);
                    output.add(index);
                });



        //String movies_array = ;
        return new StringBuilder(
                output.stream().mapToInt(Integer::intValue).mapToObj(String::valueOf).collect(Collectors.joining())).toString();
    }
}
