package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListNodes {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        return grades.stream().map(value->{

                  if(value<38 ){
                      return value;
                  }
                  else if(40 - value < 3){
                      return 40;
                  } else  {
                      int div = value/5;
                      if(5*(div+1) - value < 3){
                          return 5*(div+1);
                      }else{
                          return value;
                      }
                  }


        }).collect(Collectors.toList());


    }

    public static int getMax(List<Integer> elements, int pos){
        AtomicInteger max = new AtomicInteger();
        IntStream.range(0,elements.size())
                .forEach(value->{
                    int newMax = elements.stream().filter(i->(elements.indexOf(i)+ value + 1 )% pos ==0 )
                            .mapToInt(i->i).sum();
                    if(max.get() < newMax){
                        max.set(newMax);
                    }
                }
                );
        return max.get();
    }

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();
        elements.addAll(List.of(3,5,-2,-4,9,16));
        System.out.print(" Input : "+elements +" : Max : ");
        System.out.println(getMax(elements,3));
    }
}
