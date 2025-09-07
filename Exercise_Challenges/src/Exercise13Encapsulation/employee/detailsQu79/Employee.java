package Exercise13Encapsulation.employee.detailsQu79;

public class Employee {
    private String name;
    private int age;
    private long salary;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    private void displayEmployeeDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }

    public void showDisplayEmployeeDetails(){
        displayEmployeeDetails();
    }
}
