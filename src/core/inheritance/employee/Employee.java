package core.inheritance.employee;

public class Employee {
    private String name;
    private Long employeeid;
    private double salary;

    public Employee() {
    }

    public Employee(String name, Long employeeid, double salary) {
        this.name = name;
        this.employeeid = employeeid;
        this.salary = salary;
    }

    public double calculateBonus(){
        return getSalary() * 11/10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Long employeeid) {
        this.employeeid = employeeid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
