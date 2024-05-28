package coding.exercises.hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Encryption {

    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
        // Write your code here#
        System.out.println(s);
        List<Character> chars = s.replace(" ","").chars()
                .mapToObj(e->(char)e).collect(Collectors.toList());
        System.out.println(chars);
        System.out.println(chars.size());
        double sizeSqRoot = Math.sqrt(chars.size());
        int rows = (int) Math.floor(sizeSqRoot);
        int cols = (int) Math.ceil(sizeSqRoot);
        StringBuilder string = new StringBuilder();
        IntStream.range(0,cols)
                .forEach(value->{
                    System.out.println(chars.subList(value*rows,value*rows+cols));
                });


        return string.toString();

    }

    public static void main(String[] args) {
        System.out.println(encryption("if man was meant to stay on the ground god would have given us roots"));
    }
    }
