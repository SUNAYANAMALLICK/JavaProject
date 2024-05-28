package coding.exercises.ust;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingTest {

    public static<T extends Comparable<? super T>> T genMethodMax(List<T> list){
        if(list.isEmpty()){
            throw  new IllegalArgumentException("Empty List.");
        }else{
            AtomicReference<T> max = new AtomicReference<>(list.get(0));
            IntStream.range(0, list.size()).forEach(i->{
                T current = list.get(i);
                if(current.compareTo(max.get())>0){
                    max.set(list.get(i));
                }
            });
            return max.get();
        }
    }

    public static<T extends Comparable<? super T>> List<T> genMethodSort(List<T> list){
        if(list.isEmpty()){
            throw  new IllegalArgumentException("Empty List.");
        }else{
           return list.stream().sorted().collect(Collectors.toList());
        }
    }


    public static void main(String[] args) {

    // Write generic method to get max ?

     List<Integer> intList= List.of(2,1,4,8,6);
     System.out.println(genMethodMax(intList));
        System.out.println(genMethodSort(intList));

     List<String> stringList = List.of("Sun","Mall","Tuh","Chan");
        System.out.println(genMethodMax(stringList));
        System.out.println(genMethodSort(stringList));



    }
}
