package stringproblems;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {

    public static boolean checkPalindrome(String str){

        List<Character> strChars = str.chars().mapToObj(ch->(char)ch).collect(Collectors.toList());
        Collections.reverse(strChars);
        return (strChars.stream().map(String::valueOf).collect(Collectors.joining()).equals(str));

    }

    public static void main(String[] args) {


        String str = "bcdedit";
        System.out.println(checkPalindrome(str));
        String str1 = "aprrpa";
        System.out.println(checkPalindrome(str1));



    }
}
