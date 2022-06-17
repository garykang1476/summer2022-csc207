package week6;

import java.util.*;

public class EmployeeManager{

    protected List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees(){
        return Collections.unmodifiableList(employees);
    }

    @Override
    public String toString() {
        return "EmployeeManager{" +
                "employees=" + employees +
                '}';
    }

}
