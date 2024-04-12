package stringproblems;

import coding.exercises.onespatial.Fibonacci;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class StringProps {

    public static String appendAndDelete(String s, String t, int k) {
        // Write your code here

        LinkedList<Character> slist = new LinkedList<>(s.chars().mapToObj(ch->(char)ch).collect(Collectors.toList()));
        LinkedList<Character> tlist =  new LinkedList<>(t.chars().mapToObj(ch->(char)ch).collect(Collectors.toList()));
        int i=0;
        for(;;i++){

            String newStr = slist.stream().map(String::valueOf).collect(Collectors.joining());
            if(t.startsWith(newStr)){

                if(newStr.equals(t)){
                    break;
                }else{
                    t.indexOf(newStr);
                    slist.addLast(tlist.get(newStr.length()));
                    System.out.println(tlist.get(i));
                }


            }else{
                slist.removeLast();
            }

            System.out.println(newStr);


        }

        return String.valueOf(i<=k);


    }

    public static void main(String[] args) {
       appendAndDelete("hackerhappy", "hackerrank", 9);
    }
}
