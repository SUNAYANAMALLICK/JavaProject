package coding.exercises.cognizant;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest130124 {

    /*

    String str = "hello"

    String str1 = "el"
    Output : true
    String str2 = "ez"
    Output : false
     */

    public static boolean getMatching(String str, String str1) {
        AtomicBoolean value = new AtomicBoolean(false);
        IntStream.range(0, str.length() - str1.length())
                .forEach(i -> {
                    if (IntStream.range(i, i + str1.length()).mapToObj(j -> String.valueOf(str.charAt(j))).collect(Collectors.joining()).equals(str1)) {
                        value.set(true);
                    }
                });
        return value.get();
    }

    public static void main(String[] args) {

        String str = "hello";
        String str1 = "el";
        String str2 = "ez";
        System.out.println(getMatching(str, str1));
        System.out.println(getMatching(str, str2));
    }
}
