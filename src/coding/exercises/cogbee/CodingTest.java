package coding.exercises.cogbee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingTest {

    public static void main(String[] args) {

        // ABAKDK
        // Non Repeating Char
        String str = "KMKDHDZOZ";

        System.out.println(str);
        Map<Character, Long> map= str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);



        for(int i=0;i<str.length();i++){
            Character c = str.charAt(i);
            if(map.get(c)==1){
                System.out.println("Inside : " + c);
                break;
            }
        }


        int n = 123;
        int n1=0;
        int i1=1;

         while(n>0){
             int x = n%10;

                n1=x + n1*i1;

             i1=i1*10;
             n=n/10;
             System.out.println(n1);
         }

       // System.out.println(n1);

        Character nonRepChar = map.entrySet().stream().filter(i->i.getValue()==1).findFirst().get().getKey(); // wrong
        System.out.println(nonRepChar);

    }
}
