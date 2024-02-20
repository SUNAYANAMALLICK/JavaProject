package coding.exercises.onespatial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        Fibonacci.printFibonacci(n);
    }

    public static List<Integer> getList(int n){

        List<Integer> finalFibList = new ArrayList<>();
        IntStream.range(0,n).forEach(value -> finalFibList.add((value==0)? 0 : (value==1)? 1 : finalFibList.get(value-1) + finalFibList.get(value-2)));
        return  finalFibList;

    }
    public static void printFibonacci(int n){
        System.out.println("Input : "+ n +" : " + getList(n));
    }
}
