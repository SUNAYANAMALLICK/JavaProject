package coding.exercises.ltimindtree;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingTestL1 {
    public static void main(String[] args) {

      String s = "aabbbcccc";
      //a2c3b3

        System.out.println(s);


        List<Character> list = s.chars().mapToObj(ch->(char)ch).collect(Collectors.toList());

        StringBuilder reverse = new StringBuilder();
         for(int i=s.length()-1 ; i>=0;i--){
             reverse.append(list.get(i));
         }

        System.out.println(reverse);


        Map<Character, Long> map = s.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        System.out.println(map);

        StringBuilder output = new StringBuilder();

        map.entrySet().stream().forEach(value->{

            output.append(value.getKey());
            output.append(value.getValue());

        });

        map.put('a', 90L);

        System.out.println(map);


        System.out.println(output);
    }
}


// Payment -> option1, option2 ...

//