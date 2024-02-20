package stringproblems;

import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {

    public static boolean checkPalindrome(String str){

        List<Character> reversedChars = str.chars().mapToObj(ch->(char)ch).collect(Collectors.collectingAndThen(Collectors.toList(), list ->{
            List<Character> reversedList = list.stream()
                    .collect(Collectors.toList());
            java.util.Collections.reverse(reversedList);
            return reversedList;
        }));

        if(str.equals(reversedChars.stream().map(String::valueOf).collect(Collectors.joining())))
        {
            return true;
        }
        else{
            return false;
        }


    }

    public static void main(String[] args) {


        String str = "bcdedit";
        System.out.println(checkPalindrome(str));



    }
}
