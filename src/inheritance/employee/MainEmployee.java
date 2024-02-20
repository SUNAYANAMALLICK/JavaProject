package inheritance.employee;

public class MainEmployee {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setEmployeeid(1L);
        employee.setName("Employee 1");
        employee.setSalary(20000);

        System.out.println(String.format(" Employee [%s, %s] : Bonus + Salary : [%s]  ", employee.getName(), employee.getSalary(), employee.calculateBonus()));

        Manager manager = new Manager();
        manager.getAssignedDevelopers().add(employee.getEmployeeid());
        manager.setEmployeeid(2L);
        manager.setName("Employee 2");
        manager.setSalary(40000);

        System.out.println(String.format(" Manager [%s, %s] : Bonus + Salary : [%s]  ", manager.getName(), manager.getSalary(), manager.calculateBonus()));

        Developer developer = new Developer();
        developer.setManagerId(2L);
        developer.setEmployeeid(3L);
        developer.setName("Employee 3");
        developer.setSalary(25000);

        System.out.println(String.format(" Developer [%s, %s] : Bonus + Salary : [%s]  ", developer.getName(), developer.getSalary(), developer.calculateBonus()));





    }
    }
