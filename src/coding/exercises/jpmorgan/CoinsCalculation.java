package coding.exercises.jpmorgan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoinsCalculation {

    public static void setMap(Map<Integer,Integer> mapValue, int value){
            mapValue.put(value,(mapValue.containsKey(value))? mapValue.get(value) + 1 : 1);
    }

    public static int getNthMax(List<Integer> sample, int value){
        return sample.stream().filter(v->v<value).mapToInt(Integer::valueOf).max().getAsInt();
    }
    public static int getMin(List<Integer> sample){
        return sample.stream().mapToInt(Integer::valueOf).min().getAsInt();
    }

    public static void getMax(Map<Integer,Integer> mapValue, List<Integer> sample, int value){

     if(sample.contains(value)){
            setMap(mapValue, value);
     } else if (value>0) {
         if (value < getMin(sample)) {
             System.out.printf(" : Map : %s ",mapValue);
             System.out.printf(" : Pending : %s : Min Value : %s ",value,getMin(sample));
         }else {
             int max = getNthMax(sample, value);
             setMap(mapValue, max);
             value = value-max;
             getMax(mapValue, sample,  value);
         }
        }
     else{
         // do nothing
     }
    }

    public static void main(String[] args) {
        getNoOfCoins(List.of(5,10,25,11),55);
        getNoOfCoins(List.of(5,10,15,25),36);
    }
    public static void getNoOfCoins(List<Integer> sample, int sum){
        System.out.printf(" Input : %s ",sample);
        System.out.printf(" : Sum : %s ",sum);


        Map<Integer,Integer> mapValue  = new HashMap<>();

        getMax(mapValue, sample, sum);
        System.out.printf(" : Map : %s ",mapValue);
        System.out.printf(" : No of coins required: %s %n",mapValue.values().stream().mapToLong(Long::valueOf).sum());



    }
}
