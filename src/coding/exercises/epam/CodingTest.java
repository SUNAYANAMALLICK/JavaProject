package coding.exercises.epam;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest {

//    public int solution(int[] A) {
//        // Implement your solution here
//        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
//        Collections.sort(list);
//        int min = list.get(0);
//        int max = list.get(A.length-1);
//        AtomicInteger val = new AtomicInteger();
//        IntStream.range(min,max).filter(i-> val.get() ==0).forEach(i->val.set((!list.contains(i))?i:0));
//        return val.get();
//    }

    public static String solution(String S) {
        // Implement your solution here


        AtomicReference<Character> str = new AtomicReference<>(null);
        IntStream.range(1, S.length())
                .forEach(i -> {
                    if (String.valueOf(S.charAt(i)).equalsIgnoreCase(String.valueOf(S.charAt(i - 1)))) {
                        if (null == str.get() || str.get() < S.charAt(i)) {
                            str.set(S.charAt(i));
                        }
                    }
                });
        return (null == str.get()) ? null : str.get().toString().toUpperCase();


    }

    public static void main(String[] args) {

        System.out.println(solution("TeEsTt"));
        System.out.println(solution("TeEsaA"));
        System.out.println(solution("TeEsS"));


    }
}
