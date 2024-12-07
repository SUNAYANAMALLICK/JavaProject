package coding.exercises.capgemini;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CodingTest {
 public static void main(String[] args) {

     // non repeated character

     String s = "Sunayana";

     Map<Character,Long> map = s.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

     map.entrySet().stream().filter(v->v.getValue()==1).forEach(v->System.out.println(v.getKey()));

     // Use of Comparator

     // Employee (id, name, salary) // getter // setter

     // List<Employee>

    //  Comparator.comparingInt()

     List<String> names = List.of("Sam", "James", "Selena", "James", "Joe", "Sam", "James");



   //  names.stream().distinct().sort(Comparator.comparing(String::length));

     System.out.println(names.getFirst());








    }
}
