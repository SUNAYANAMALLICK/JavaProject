package java11;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PredicateNotExample {

    public static boolean isEven(int num){
        return num%2==0;
    }
    public static void main(String[] args){
        List<Integer> list = IntStream.range(0,10).boxed().collect(Collectors.toList());
        Predicate<Integer> evenPredicate = n->n%2==0;
        list.stream().filter(evenPredicate).forEach(System.out::print);
        System.out.println();
        list.stream().filter(evenPredicate.negate()).forEach(System.out::print);
        System.out.println();
        list.stream().filter(PredicateNotExample::isEven).forEach(System.out::print);
        System.out.println();
        list.stream().filter(Predicate.not(PredicateNotExample::isEven)).forEach(System.out::print);




    }
}
