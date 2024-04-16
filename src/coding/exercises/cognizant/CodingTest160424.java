package coding.exercises.cognizant;

import java.lang.annotation.Target;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class CodingTest160424 {


    public static boolean containsOrNot(List<String> strings, String name){

        Predicate<String> check = (str) -> strings.contains(str);
        return check.test(name);

    }
 public static void main(String[] args) {

        // Employee Controller + Service + Repository design

     // Design Pattern

     // Functional Interface

    // Tables - Employee (ID, Name, AddressId), address(ID, line1, Line2)

     // Write a SQL query to get the data from 2 Tables EMP and EMP_ADD using the ID EMP_ID=1234



    }
}
