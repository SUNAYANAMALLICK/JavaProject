package coding.exercises.deloitte;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingTest24042025 {
 public static void main(String[] args) {

     // 1,1,2,3,3,4,4,4,5,6,6,6,7,8,8,8,8
     List<Integer> list = List.of(1,1,2,3,3,4,4,4,5,6,6,6,7,8,8,8,8);
     Map<Integer, Long> map =
             list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
     System.out.println(list + " -->" + map);


    }
}
