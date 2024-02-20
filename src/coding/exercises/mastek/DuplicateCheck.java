package coding.exercises.mastek;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCheck {
    public static void main(String[] args) {
        DuplicateCheck.checkDuplicated("POPIRUMM");

    }
        public static void checkDuplicated(final String params){

        Map<Character, Long> frequency = params.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Character> keys = frequency.entrySet().stream().filter(x->x.getValue()>1).toList().stream().map(Map.Entry::getKey).toList();
        System.out.printf(" Input : %s : Map : %S : %s%n",params,frequency, keys);
    }
}
