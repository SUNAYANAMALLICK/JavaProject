package java8.methodreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class Solution {

    public static void main(String[] args) {

        //staticMethodRef
        Function<String,Integer> stringToInt = (s -> Integer.parseInt(s));
        Function<String,Integer> stringToIntRef = Integer::parseInt;

        System.out.println(stringToInt.apply("123"));
        System.out.println(stringToIntRef.apply("123456"));

        //instanceMethodRef
        BiPredicate<String,String> startsWith = (str,prefix)->str.startsWith(prefix);
        BiPredicate<String,String> startsWithRef = String::startsWith;

        System.out.println(startsWith.test("POLPOL","POL"));
        System.out.println(startsWithRef.test("POLPOL","POLL"));

        //constructorMethodRef
        Supplier<List<String>> listSupplier = ()->new ArrayList<>();
        Supplier<List<String>> listSupplierRef = ArrayList::new;

        System.out.println(listSupplier.get());
        System.out.println(listSupplierRef.get());

        //bundInstanceMethodRef
        BiFunction<String,String,Boolean> contains = (str, prefix)->str.contains(prefix);
        BiFunction<String,String,Boolean> containsRef = String::contains;

        System.out.println(contains.apply("SUNAYANA","NAYANA"));
        System.out.println(containsRef.apply("SUNAYANA","NAYPANA"));



    }
}
