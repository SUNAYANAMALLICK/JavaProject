package coding.exercises.amazon;

import java.util.*;

public class FruitsProblem {


public static Integer getRemainingFruits(List<Integer> fruits) {

    List<Integer> newList = new ArrayList<>();

     fruits.stream().flatMap(i ->fruits.stream().filter(j->j!=i).map(j -> Arrays.asList(i,j)))
             .filter(pair->!newList.containsAll( List.of(pair.get(0),pair.get(1))))
             .forEach(pair -> newList.addAll(List.of(pair.get(0),pair.get(1))));

     return fruits.size()-newList.size();
}




    public static void main(String[] args) {

       System.out.println(getRemainingFruits(List.of(3,3, 3, 3, 3)));
        System.out.println(getRemainingFruits(List.of(2,2,2,5,1)));





    }
}
