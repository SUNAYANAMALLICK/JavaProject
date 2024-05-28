package java8.lambda;


import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        OperatorFI<Integer> addOperation = (x, y) -> x + y;
        OperatorFI<Integer> multiplyOperation = (x, y) -> x * y;
        OperatorFI<Integer> divOperation = (x, y) -> x / y;
        OperatorFI<String> appendOperation = (x, y) -> x + y;

        System.out.println(" Input : " + a + ", " + b + " : Add : " + addOperation.process(a, b) + " : Multiply : " + multiplyOperation.process(a, b) + " : Div : " + divOperation.process(a, b) + " : Append : " + appendOperation.process("a", "b"));

        List<Integer> list = List.of(1,5,4,9,6);
       // Function<Integer,Boolean> checkEven = (n)-> n%2==0;
        Predicate<Integer> checkEven = (n)-> n%2==0;

        System.out.println(list);
        list.stream().filter(checkEven::test).forEach(System.out::print);


    }
}
