package coding.exercises.sainsburry;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class LuhnAlgorithm {

    public static boolean isValidCreditCardNumber(String creditCardNumber) {
        AtomicInteger sum = new AtomicInteger();
        Predicate<Integer> checkEven = (integer) -> integer % 2 == 0;
        Predicate<Integer> checkWithNine = (integer) -> integer >= 9;
        IntStream.range(0, creditCardNumber.length())
                .forEach(n -> {
                    int v = Integer.parseInt(String.valueOf(creditCardNumber.charAt(n)));
                    if (!checkEven.test(creditCardNumber.length())) { // odd numbers needs to be multiplied by 2
                        sum.set(sum.get() + ((n == 0) ? v : checkEven.test(n) ? v : checkWithNine.test(v * 2) ? (v * 2) - 9 : v * 2));

                    } else {// even numbers needs to be multiplied by 2
                        sum.set(sum.get() + ((n == 0) ? checkWithNine.test(v * 2) ? (v * 2) - 9 : v * 2 : checkEven.test(n) ? checkWithNine.test(v * 2) ? (v * 2) - 9 : v * 2 : v));
                    }
                });
        return sum.get() % 10 == 0;
    }

    public static void main(String[] args) {
        String creditCardNumber = "79927398713";
        String creditCardNumber2 = "4532015112830366";

        if (isValidCreditCardNumber(creditCardNumber)) {
            System.out.println("The credit card number is valid.");
        } else {
            System.out.println("The credit card number is invalid.");
        }

        if (isValidCreditCardNumber(creditCardNumber2)) {
            System.out.println("The credit card number is valid.");
        } else {
            System.out.println("The credit card number is invalid.");
        }
    }
}
