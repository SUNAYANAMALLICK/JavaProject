package coding.exercises.relevantz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest {
 public static void main(String[] args) {
     // [10:33 AM] Ramya Rajan
     String test = "Madam";
     // no of occurance of each char

     List<Character> list = test.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());

     HashMap<Character, Long> hash = (HashMap<Character, Long>) test.chars().mapToObj(ch -> (char) ch)
             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

     // Collections.reverse();

     System.out.println(test);
     System.out.println(hash);

     List<Character> reverse = new ArrayList<>();
     IntStream.rangeClosed(0, list.size() - 1).forEach(value -> reverse.add(list.get(list.size() - 1 - value)));

     // String rev = reverse.stream().map(character ->(char) character).collect(Collectors.joining('')).toString();

     System.out.println(list);
     // System.out.println(reverse.stream().collect(Collectors.joining(",")));

     /*

     Table A - id, name, age
     Table B - id, salary

     Fetch list of employees
     1. Name should start with S
     2. Age less that 30
     3. Salary between 10-15k
     4. Sort it by descending order of salary


     Select b.salary
     from A a, B b
     where a.id = b.id
     and   a.name like 'S%'
     and   a.age < 30
     and   b.salary between 10000 and 15000
     and   rownum = 1
     order by b.salary desc;

      */

    }
}
