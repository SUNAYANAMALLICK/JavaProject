package coding.exercises.cognizant;

import java.util.List;

public class CodingTest170424 {

    // methods (id){
    //

 public static void main(String[] args) {

     // 1XX
     //2XX -
     //3XX -
     //4XX -
     //5XX -

     // List of integers represented in string array. Using java 1.8 streams, sum it up and display the result

     List<String> list = List.of("1", "2", "3");

     int sum = list.stream().mapToInt(i->Integer.parseInt(i)).sum();

     System.out.println(sum);

     // Emp - (id, name , ...)
     // Get - id

     // input -  https://www.amex.com/network/name?qid=1234
      // <Name, id....>


    }
}
