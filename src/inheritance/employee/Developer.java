package inheritance.employee;

public class Developer extends Employee{
    private long managerId;

    public long getManagerId() {
        return managerId;
    }

    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }

    @Override
    public double calculateBonus(){
        return getSalary() * 21/20;
    }
}
