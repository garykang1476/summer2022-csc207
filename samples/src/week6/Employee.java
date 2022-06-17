package week6;

import java.io.Serializable;

public class Employee implements Serializable{

    private String name;
    private Integer salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }
}
