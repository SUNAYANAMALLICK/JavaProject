package coding.exercises.hashedin;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest {
    public static void main(String[] args) {

        String word = "racecar";

        System.out.println(word);


        Map<Character,Long> map =
                word.chars().mapToObj(ch->(char)ch)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                ;

        System.out.println(map);


        List<Integer> height = List.of(1,8,6,2,5,4,8,3,7);

        Map<Integer, Integer> areaMap = IntStream.range(0, height.size())
                .boxed()
                .collect(Collectors.toMap(i -> i + 1, j-> height.get(j)*(j+1)));

        System.out.println(areaMap);


    }
    public int maxArea(List<Integer> height) {
        int left = 0;
        int right = height.size() - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate the current area
            int currentHeight = Math.min(height.get(left), height.get(right));
            int width = right - left;
            int currentArea = currentHeight * width;

            // Update maxArea if the currentArea is greater
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer corresponding to the shorter height
            if (height.get(left) < height.get(right)) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}

/*



a,b
BiOperation
FunctionalInterface --> operation(a,b)


BiOperation add = (int a, int b) -> a+b;
BiOperation add = (int a, int b) -> a+b;

Stream.filter()


input -> byteCode ->

String, StringBuilder, StringBuffer

concat & appened


Employee(salary, 2nd highest)
select * from
(select * from emp order by sal desc)
where rownum = 2;






//

 */
