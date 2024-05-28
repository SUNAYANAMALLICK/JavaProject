package coding.exercises.hackerrank;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class KaprekarNumber {

    public static long convertToPairedDigitList(long number) {
        //System.out.println(number);
        String numberStr = String.valueOf(number);

        return IntStream.range(0, numberStr.length() / 2)
                .mapToObj(i -> numberStr.substring(i * 2, i * 2 + 2))
                .map(Integer::valueOf)
                .collect(Collectors.toList()).stream().mapToLong(l->(long)l).sum();
    }

    public static boolean checkNumber(int n){

        return (n==1)?true : n==convertToPairedDigitList(n*n);



    }
    public static void main(String[] args) {

        System.out.println(checkNumber(45));

        IntStream.range(1,100).filter(KaprekarNumber::checkNumber).forEach(System.out::println);

    }
    }
