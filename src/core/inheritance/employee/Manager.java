package core.inheritance.employee;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Long> assignedDevelopers;

    public Manager() {
        assignedDevelopers = new ArrayList<>();
    }

    public List<Long> getAssignedDevelopers() {
        return assignedDevelopers;
    }

    @Override
    public double calculateBonus(){
        return getSalary() * 12/10;
    }

    public void setAssignedDevelopers(List<Long> assignedDevelopers) {
        this.assignedDevelopers = assignedDevelopers;
    }
}
