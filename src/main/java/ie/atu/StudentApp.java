package ie.atu;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println("Enter details of first student: ");
        student1.studentInfo();

        student1.displayInfo();
    }
}