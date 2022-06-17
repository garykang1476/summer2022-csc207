package week6;

import java.util.*;

public class EmployeeManager implements Iterable<Employee>{

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

    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator();
    }


    class EmployeeIterator implements Iterator<Employee>{

        private int index;

        @Override
        public boolean hasNext() {
            return index < employees.size();
        }

        @Override
        public Employee next() {
            if(hasNext()){
                return employees.get(index ++);
            }

            throw new NoSuchElementException();
        }
    }
}
