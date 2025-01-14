package principle.solid.singleresponsibility.solution;

public class SalaryCalculator {
    public static double calculateYearlySalary(Employee employee) {
        return employee.getSalary() * 12;
    }
}
