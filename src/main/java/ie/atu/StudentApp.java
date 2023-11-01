package ie.atu;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("");
        Student student3 = new Student("","","");

        System.out.println("Enter info of first student: ");
        student1.studentInfo();

        System.out.println("Enter info of second student: ");
        student2.studentInfo();

        System.out.println("Enter info of third student");
        student3.studentInfo();

        System.out.println("Student 1\n");
        student1.displayInfo();
        System.out.println("Student 2\n");
        student2.displayInfo();
        System.out.println("Student 3\n");
        student3.displayInfo();
    }
}