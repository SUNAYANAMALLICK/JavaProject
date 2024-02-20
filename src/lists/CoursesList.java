package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CoursesList {
    private static List<Course> courses;

    public static  List<Course> getListWithNormalValue(){
        Course course1 = new Course("Java", "XYZ", 12.32F, 2.22F);
        Course course2 = new Course("Python", "ABC", 10.32F, 2.22F);
        Course course3 = new Course("C", "DEF", 13.32F, 2.22F);
        Course course4 = new Course("SQL", "GHI", 2.32F, 2.22F);

        courses = new ArrayList<>();
        courses.addAll(List.of(course1, course2, course3, course4));
        return courses;
    }

    public static List<Course> getListWithDuplicateValue(){
        Course course1 = new Course("Java", "XYZ", 12.32F, 2.22F);
        Course course2 = new Course("Python", "ABC", 10.32F, 2.22F);
        Course course3 = new Course("Java", "XYZ", 12.32F, 2.22F);
        Course course4 = new Course("SQL", "GHI", 2.32F, 2.22F);

        courses = new ArrayList<>();
        courses.addAll(List.of(course1, course2, course3, course4).stream().collect(Collectors.toList()));
        return courses;
    }

}
