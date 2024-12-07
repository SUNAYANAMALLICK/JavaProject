package coding.exercises.ey;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodingTest {
    public static void main(String[] args) {



        getConsecutiveCount(List.of(1,1,1,0,2,1,3,3,2,1,1,5,5,6,7,7,7,8,7,7));


        /*

        Book -> authorName, bookName

         You have a list of Book - bookList

          Write a program to find all the books written by Tom



         */


    }

    // consecutive repeating no
        /*

        1->3
        3->2
        1->2
        5->2
        7->3
        7->2
         */
    private static void getConsecutiveCount(List<Integer> list) {
       // List<Integer> list = List.of(1,1,1,0,2,1,3,3,2,1,1,5,5,6,7,7,7,8,7,7);
        int prev = list.get(0);
        int next = 0;
        int count = 1;
        for(int i=1;i<list.size()-1;i++){
            int current = list.get(i);
            next = list.get(i+1);
          // check previous = current
            if(prev == current){
                count++;
                if(current!=next){
                    System.out.println(String.format("%d -> %d", current, count));
                }
            }
            // yes count++ & print count
            // else count=1 & previous = current
            else{
                count=1;

            }
            prev = current;
        }
    }
}
