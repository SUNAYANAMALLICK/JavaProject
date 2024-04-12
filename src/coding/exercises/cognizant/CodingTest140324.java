package coding.exercises.cognizant;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingTest140324 {

    public static  boolean getResult(String value){
        Map<Character, Long> map = value.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        if(map.values().stream().filter(i->i>1).count()>0){
            return true;
        }else{
            return false;
        }

    }

    public static List<String> getList(List<String> list){

        return list.stream().filter(value->!getResult(value)).map(value->value.toUpperCase()).collect(Collectors.toList());

    }
    public static void main(String[] args) {

       List<String> list = new ArrayList<>();
       list.add("horse");
       list.add("sheep");
       list.add("cat");
       list.add("elephant");

       System.out.println(list);


     getList(list).stream().forEach(System.out::println);

       // sheep, elephant
        // Uppercase


    }
}
