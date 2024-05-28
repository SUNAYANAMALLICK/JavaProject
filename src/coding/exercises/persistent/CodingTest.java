package coding.exercises.persistent;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest {

    public static int getNthHighest(Integer[] array,  int n){

       int len = array.length;

       for(int i=0;i<len-1;i++){
           for(int j=i+1;j<len;j++){
               if(array[i]<array[j]){
                   int temp = array[i];
                   array[i]=array[j];
                   array[j] = temp;
               }
           }
       }

        return array[n-1];
    }




    public static void main(String[] args) {

       // [10:50] Priyanka Takawale
        List<Integer> list=List.of(11,22,11,4,11,3,11,5);

        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(list);
        System.out.println(map);

        long max = map.values().stream().mapToLong(i->(long)i).max().getAsLong();
        int x = map.entrySet().stream().filter(i->i.getValue()==max).collect(Collectors.toList()).get(0).getKey();
        System.out.println(max);
        System.out.println(x);



       // System.out.println(getNthHighest(Arrays.));



        //Integer max = map.entrySet().stream().filter(i->i.)


    }
}
