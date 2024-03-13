package coding.exercises.americanexpress;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest {
    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        List<Character> ch1 = str1.toUpperCase().chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
        List<Character> ch2 = str2.toUpperCase().chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());

        System.out.println(ch1);
        System.out.println(ch2);

        AtomicBoolean result = new AtomicBoolean(false);


        System.out.println(ch1.containsAll(ch2));


    }
}
