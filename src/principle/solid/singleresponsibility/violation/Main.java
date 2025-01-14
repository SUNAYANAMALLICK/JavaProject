package principle.solid.singleresponsibility.violation;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("A", 10000);
        System.out.println(employee.calculateYearlySalary());
        System.out.println(employee.generateReport());
    }
}
