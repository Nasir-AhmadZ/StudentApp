package ie.atu;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("");

        System.out.println("Enter info of first student: ");
        student1.studentInfo();

        System.out.println("Enter info of second student: ");
        student2.studentInfo();


        student1.displayInfo();
        student2.displayInfo();
    }
}