package designByContract.employee;

import java.util.ArrayList;
import java.util.List;

public class HR {

    EmployeeFactory factory = new EmployeeFactory();

    private List<Employee> employees = new ArrayList<>();

    public HR() {
        for (int i = 0; i < 10; i++) {
            Employee e = factory.create();
            employees.add(e);
        }
    }

    public Employee getAnEmployee() {
        int index = (int) Math.random() * 10;
        return employees.get(index);
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public void listEmployees() {
        System.out.println("All Employees");
        for (Employee employee : employees)
            System.out.println(employee);
    }
}
