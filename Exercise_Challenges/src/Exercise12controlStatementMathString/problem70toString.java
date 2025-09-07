package Exercise12controlStatementMathString;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student std1 = new Student("Gaurang", 19);
        Student std2 = new Student("Mahi", 18);

        System.out.println(std1.toString());
        System.out.println(std2.toString());
    }
}
