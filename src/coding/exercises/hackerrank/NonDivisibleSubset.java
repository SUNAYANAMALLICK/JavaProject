package coding.exercises.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class NonDivisibleSubset {

    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        TreeSet<Integer> set = new TreeSet<>();
        System.out.println(s);
        int size = s.size();
        System.out.println(size);
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                int a = s.get(i);
                int b = s.get(j);
                if((a+b)%k!=0){
                    System.out.println("["+i+","+j+"] : ["+a+","+b+"]" + " = " + (a+b)%k );
                    set.add(a);
                    set.add(b);
                }else{
                    System.out.println("["+i+","+j+"] : ["+a+","+b+"]" + " = " + (a+b)%k );
                }
            }
        }
        System.out.println(set);
        return set.size();
    }

    public static int nonDivisibleSubset1(int k, List<Integer> S) {
        // Initialize a map to store remainders count
        // Initialize a map to store remainders count
        Map<Integer, Integer> remaindersCount = new HashMap<>();

        // Count the remainders when divided by k
        for (int num : S) {
            int remainder = num % k;
            remaindersCount.put(remainder, remaindersCount.getOrDefault(remainder, 0) + 1);
        }

        // If k is even, one element can be included only if its remainder is half of k
        if (k % 2 == 0) {
            remaindersCount.put(k / 2, Math.min(remaindersCount.getOrDefault(k / 2, 0), 1));
        }

        // Initialize the result to include at most one element with remainder 0
        int maxLength = Math.min(remaindersCount.getOrDefault(0, 0), 1);

        // Consider pairs of remainders whose sum is k
        for (int i = 1; i <= k / 2; i++) {
            maxLength += Math.max(remaindersCount.getOrDefault(i, 0), remaindersCount.getOrDefault(k - i, 0));
        }

        return maxLength;
    }
    public static void main(String[] args) {
        int result = nonDivisibleSubset(3, List.of(1,7,2,4));
        System.out.println(result);
       //  result = nonDivisibleSubset(4, List.of(19,10,12,10,24,25,22));
        //System.out.println(result);

        result = nonDivisibleSubset1( 7, List.of(278,576,496,727,410,124,338,149,209,702,282,718,771,575,436));
        System.out.println(result);

    }    }
