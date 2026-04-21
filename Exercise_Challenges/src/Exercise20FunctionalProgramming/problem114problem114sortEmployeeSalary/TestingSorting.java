package Exercise20FunctionalProgramming.problem114problem114sortEmployeeSalary;

import java.util.List;
import java.util.stream.Collectors;

public class TestingSorting {
    public static void main(String[] args) {

    List<Employee> employees =  List.of(
            new Employee("Ravi", 12010),
            new Employee("Kishore", 12100),
            new Employee("Shankar", 12001),
            new Employee("Guru", 12200)
    );

        employees.stream()
                .sorted ((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach (System.out::println);
    }
}
