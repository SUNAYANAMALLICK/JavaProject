package coding.exercises.ey;


import core.inheritance.employee.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSorting {
    // Employee record with name, id, and departmentId fields
   // public record Employee(String name, int id, int departmentId) {}

    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 1L, 10000));
        employees.add(new Employee("Bob", 2L, 20000));
        employees.add(new Employee("Charlie", 3L, 10000));
        employees.add(new Employee("Dave", 4L, 30000));

      //  employees.stream().forEach(System.out::println);

        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() +
                    ", ID: " + employee.getEmployeeid() +
                    ", Department ID: " + employee.getEmployeeid());
        }


        // Comparator to sort by name
        Comparator<Employee> sortByName = Comparator.comparing(Employee::getName);

        // Comparator to sort by id
        Comparator<Employee> sortById = Comparator.comparingLong(Employee::getEmployeeid);

        // Comparator to sort by salary
        Comparator<Employee> sortBySalary = Comparator.comparingDouble(Employee::getSalary);


        //employees.sort(Comparator.c
        // Sorting employees by departmentId using Comparator
        //employees.sort(Comparator.comparingDouble(Employee::getSalary));

        Collections.sort(employees,sortBySalary);


      //  employees.stream().forEach(System.out::println);

        // Output the sorted list of employees
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() +
                    ", ID: " + employee.getEmployeeid() +
                    ", Department ID: " + employee.getEmployeeid());
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
