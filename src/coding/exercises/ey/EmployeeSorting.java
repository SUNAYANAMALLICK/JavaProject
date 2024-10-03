package coding.exercises.ey;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeSorting {
    // Employee record with name, id, and departmentId fields
    public record Employee(String name, int id, int departmentId) {}

    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 1, 10));
        employees.add(new Employee("Bob", 2, 20));
        employees.add(new Employee("Charlie", 3, 10));
        employees.add(new Employee("Dave", 4, 30));

        employees.stream().forEach(System.out::println);


        // Sorting employees by departmentId using Comparator
        employees.sort(Comparator.comparingInt(Employee::departmentId));

        employees.stream().forEach(System.out::println);

        // Output the sorted list of employees
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.name() +
                    ", ID: " + employee.id() +
                    ", Department ID: " + employee.departmentId());
        }
    }
}





/*
package coding.exercises.ey;



import core.inheritance.employee.Employee;

import java.util.Comparator;

public class CodingTest extends Comparator<Employee>{
    public static void main(String[] args) {


     */
/*   List<Employee> employees = Arrays.asList(
                new Employee("George", 10, 10000),
                new Employee("Robert", 12, 15000),
                new Employee("Kathy", 24, 25000)
        );


        employees.stream().sort(Comparator :: ascending).collect();

        *//*

*/
/**//*

    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return 0;
    }

    // 1. sealed class 2. text blocks 3. switch

    // Car int  ()

    // Car1, Car2, Car3

    // {kkkk
    // ,kkkk,
    // jkk}

    


}
*/
