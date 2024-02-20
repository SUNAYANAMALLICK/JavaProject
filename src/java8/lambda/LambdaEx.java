package java8.lambda;


public class LambdaEx {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        OperatorFI<Integer> addOperation = (x, y) -> x + y;
        OperatorFI<Integer> multiplyOperation = (x, y) -> x * y;
        OperatorFI<Integer> divOperation = (x, y) -> x / y;
        OperatorFI<String> appendOperation = (x, y) -> x + y;

        System.out.println(" Input : " + a + ", " + b + " : Add : " + addOperation.process(a, b) + " : Multiply : " + multiplyOperation.process(a, b) + " : Div : " + divOperation.process(a, b) + " : Append : " + appendOperation.process("a", "b"));

    }
}
