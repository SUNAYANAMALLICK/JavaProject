package coding.exercises.jpmorgan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

public class SplitLists {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,8,10,11);
        SplitLists.getLists(integerList, 12);
        SplitLists.equalSideAray(List.of(1,2,3,6,3,2,1));
    }
        public static  void getLists(List<Integer> integerList, int sum){

        Map<Integer,List<Integer>> allMap = new HashMap<>();

        List<List<Integer>> allList = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();

        integerList.forEach(value->{
            int no = integerList.stream().filter(x->x==sum-value).findFirst().orElse(0);
            if(no>0){
                allMap.put(value,List.of(value,no));
            }

        });

        System.out.println(allMap);

    }

    public static void equalSideAray(List<Integer> integerList){

        AtomicBoolean result = new AtomicBoolean(true);

        IntStream.range(0, integerList.size()).filter(x->result.get()).forEach(x->{

            double sumStart = integerList.subList(0,x).stream()
                    .mapToLong(Integer::longValue)
                    .sum();
            double sumEnd = integerList.subList(x+1,integerList.size()).stream()
                    .mapToLong(Integer::longValue)
                    .sum();

            if(sumStart == sumEnd && sumEnd == integerList.get(x))
            {
                System.out.printf(" Input : %s :  %S %n",integerList,x+1);
                result.set(false);
            }

        });

    }
}
