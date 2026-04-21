package Exercise20FunctionalProgramming.problem114problem114sortEmployeeSalary;

import java.util.Arrays;
import java.util.List;


public class Employee {
    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
