package core.hashmap;

import java.util.HashMap;

class Employee {
    private int id;
    private String name;
    private String department;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public int hashCode() {
        return id; // Simplified for collision example
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class HashMapExampleBeforeJavaEight {

    public static void main(String[] args) {

        {
            HashMap<Employee, String> map = new HashMap<>();
            Employee emp1 = new Employee(1, "John Doe", "HR");
            Employee emp2 = new Employee(1, "Jane Doe", "Finance");
            map.put(emp1, "Employee 1");
            System.out.println(map.keySet().stream().map(Employee::getName).toList());
            map.put(emp2, "Employee 2");
            // Both employees have the same hashcode (id = 1)
            System.out.println(map.keySet().stream().map(Employee::getName).toList());

            for (Employee emp : map.keySet()) {
                System.out.println(emp.getName() + ": " + map.get(emp));
            }


        /*
        Before Java 8, HashMap used a linked list to handle collisions.
        If multiple keys hash to the same index, they are stored in a linked list at that index.
        When a new entry is added to the map, it is appended to the linked list.
        When you access a key, the HashMap traverses the linked list at the hashed index to find the correct entry.

         */
        }
    }
}
