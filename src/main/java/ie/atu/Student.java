package ie.atu;
import java.util.Scanner;
public class Student {

    private String name;
    private String email;
    private String course;

    //default constructor
    public Student(){
        this.setName(name);
        this.setEmail(email);
        this.setCourse(course);
    }

    public Student(String name, String email, String course){
        this.name = name; //constructor
        this.email = email;
        this.course = course;
    }

    public Student(String name){
        this.name = name;
    }

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + getName() + ", Email:"+ getEmail() + ", Course: " + getCourse() );
    }

    public void studentInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name: ");
        this.name= scanner.nextLine();

        System.out.println("Enter student email: ");
        this.email = scanner.nextLine();

        System.out.println("Enter course: ");
        this.course = scanner.nextLine();
    }
}
