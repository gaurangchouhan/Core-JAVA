package Exercise9Classes_Objects;

class Course {

    static int maxCapacity = 100;

    String courseName;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];

    }

//    String[] enrolledStudents = new String[maxCapacity];

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudents(String studentName){
        System.out.println("Student Removed");
        enrollments--;
    }

    public static void main(String[] args) {
        Course java = new Course("JAVA");
        Course.setMaxCapacity(100);
    }
}

