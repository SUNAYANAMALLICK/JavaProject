package coding.exercises.hackerrank;

import java.util.function.Function;
import java.util.stream.Collectors;


public class SubStringProblem {

    public static  long getCount(String s, Long n){

        long countOfAInS = s.chars().filter(ch -> ch == 'a').count();
        long fullRepetitions = n / s.length();
        long remainingChars = n % s.length();

        long totalCount = countOfAInS * fullRepetitions;

        for (int i = 0; i < remainingChars; i++) {
            if (s.charAt(i) == 'a') {
                totalCount++;
            }
        }

        return totalCount;

    }

    public static void main(String[] args) {
        long result = getCount("aba",10L);
        System.out.println(result);


    }
}
