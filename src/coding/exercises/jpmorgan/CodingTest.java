package coding.exercises.jpmorgan;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class CodingTest {

    // 1 to 100 num%3 "Fizz", num%5 "Buzz" "FizzBuzz" else print the num

    public static void main(String[] argv){

        int n = 100;

      //  BiFunction<Integer, Integer, Boolean> testDiv = (int a, int b) -> a%b ==0 ;

        IntStream.rangeClosed(1, n).forEach(num->{


            if(num%3==0 && num%5==0){
                System.out.println("FizzBuzz");
            }else if(num%3!=0 && num%5==0){
                System.out.println("Buzz");

            }else if(num%3==0 && num%5!=0){
                System.out.println("Fizz");
            }else{
                System.out.println(num);
            }

        });



        /*



        1. create table Employee is

        id number,
        name varchar,
        joinDate date,
        ....

        2. Primary key

        3. Unique key

        4. create index

        Emp, dept, salgrade

         jkkkkcy09x]0l-]
         =o[]####'mkl;lnhhhhhhhhjjjjjgr94335.'

/]]'';;
#?~~@']
'
#
~~
7/
414
4/

/]]'[''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''#####'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''c    hhhhjhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhjknmjk

         */

    }
}
