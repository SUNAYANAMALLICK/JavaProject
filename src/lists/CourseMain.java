package lists;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CourseMain {
    public static void main(String[] args) {


        System.out.println(" Sorting a List of Objects \n" );
        List<Course> courses = CoursesList.getListWithNormalValue();
        System.out.print( " Input : " + courses.stream().map(Course::getName).collect(Collectors.toList()));
        Collections.sort(courses);
        System.out.println(" : " + courses.stream().map(Course::getName).collect(Collectors.toList()));

        System.out.println("\n Removing Duplicates from a List \n" );
        courses = CoursesList.getListWithDuplicateValue();
        System.out.print( " Input : " + courses.stream().map(Course::getName).collect(Collectors.toList()));
        System.out.println(" : " + courses.stream().map(Course::getName).distinct().collect(Collectors.toList()));


    }
}
