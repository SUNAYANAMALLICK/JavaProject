package principle.solid.singleresponsibility.solution;



public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("A", 10000);
        System.out.println(SalaryCalculator.calculateYearlySalary(employee));
        EmployeeRepository.saveToDatabase(employee);
    }
}
