package coding.exercises.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListDiv {
    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        int c=0;
        System.out.println(s +" : k = "+k);
        Map<Integer,List<Integer>> map = new HashMap();
        for(int i=0;i<s.size()-1;i++){
            for(int j=i+1;j<s.size()-1;j++){
                if((s.get(i)+s.get(j))%k!=0){
                    c=c+1;
                    map.put( c, List.of(s.get(i),s.get(j)));
                }
            }
        }

        System.out.println(map);
        return (int)map.values().stream().flatMap(List::stream).distinct().count();
       // return 0;

    }
}
