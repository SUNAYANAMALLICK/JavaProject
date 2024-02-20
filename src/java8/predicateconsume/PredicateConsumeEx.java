package java8.predicateconsume;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateConsumeEx {

    public static void fizzBuzz(int n) {
        // Write your code here

        Predicate<Integer> checkBoth = (integer -> integer%3==0 && integer%5==0);
        Predicate<Integer> checkThree = (integer -> integer%3==0 && integer%5!=0);
        Predicate<Integer> checkFive = (integer -> integer%3!=0 && integer%5==0);
        Predicate<Integer> checkNotBoth = (integer -> integer%3!=0 && integer%5!=0);

        Consumer<Object> display = a -> System.out.println(a);

        display.accept(1/3);

        IntStream.range(1, n+1).forEach(value -> {
            display.accept(
                            checkBoth.test(value) ? "FizzBuzz" :
                                    checkThree.test(value) ? "Fizz" :
                                            checkFive.test(value) ? "Buzz" :
                                                    checkNotBoth.test(value) ? value :
                                                            "Invalid"
                    );
                }
        );
    }

    public static void displayElement(Object o){
        Consumer<Object> display = a -> System.out.println(a);
        display.accept(o);
    }

    public  static int reverseNum(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static boolean checkPalindrome(int n){
        Predicate<Integer> isPalindrome = (integer -> reverseNum(integer) == integer);
        return isPalindrome.test(n);
    }

    public static boolean checkEvenNumber(int n){
        Predicate<Integer> isEven = (integer -> integer % 2 == 0);
        return isEven.test(n);
    }

    public static void main(String[] args) {
        int a = 101;
        int b = 112;
        System.out.println(String.format(" Input : a : %s : b : %s ",a, b));
        System.out.print("Is Even : ");
        displayElement(checkEvenNumber(a));
        displayElement(checkEvenNumber(b));
        System.out.print("Is Palindrome : ");
        displayElement(checkPalindrome(a));
        displayElement(checkPalindrome(b));

        fizzBuzz(10);


    }
}