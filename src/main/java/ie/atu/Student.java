package ie.atu;

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

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){ // setters would be used to add restrictions. eg name should have no numbers.
        this.name = name; //when we scan the input it sets this to parameter
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
}
