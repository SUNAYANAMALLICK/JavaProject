package core.comparator;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    record Employee(int id, String name, Double salary)  implements Serializable {

    }
    record Student(int id, String name, Integer marks) implements Serializable, Comparable<Student> {
        @Override
        public int compareTo(Student o) {
            return Integer.compare(this.marks, o.marks);
        }
    }
    public static void main(String[] args) {


        List<Employee> employees = List.of(
                new Employee(1,"Spriha", 12000d),
                new Employee(2,"Sunayana", 15000d),
                new Employee(3,"Tuhin", 11000d),
                new Employee(4,"Riya", 15000d)
        );

        System.out.println(employees);

        // Sort by salary (assuming getSalary() exists)
        List<Employee> sortedBySalary = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::salary))
                .collect(Collectors.toList());

        System.out.println(sortedBySalary);

        int n = 2; // Find 2nd highest salary

        Double nthHighestSalary = employees.stream()
                .map(Employee::salary)
                .distinct()
                .sorted(Comparator.reverseOrder()) // descending
                .skip(n - 1)
                .findFirst().orElse(0d);

        System.out.println( n + "th highest salary: " + nthHighestSalary);

        List<Student> students = List.of(
                new Student(1,"Spriha", 110),
                new Student(2,"Sunayana", 100),
                new Student(3,"Tuhin", 90),
                new Student(4,"Riya", 120)
        );

        System.out.println(students);

        List<Student> sorted = students.stream()
                .sorted() // uses compareTo()
                .collect(Collectors.toList());

        System.out.println("Sorted by marks:");
        System.out.println(sorted);



    }
}
