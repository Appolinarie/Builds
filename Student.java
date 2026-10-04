public class Student {

    
    private String name;
    private String studentId;
    private int age;
    private String email;
    private String course;
    private int year;
    private double gpa;
    private double stipend;

    
    public Student(String studentId, String name, double stipend,
                   int age, String email, String course,
                   int year, double gpa) {

        this.studentId = studentId;
        this.name = name;
        this.stipend = stipend;
        this.age = age;
        this.email = email;
        this.course = course;
        this.year = year;
        this.gpa = gpa;
    }

    
    public void studentInfo() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
        System.out.println("GPA: " + gpa);
        System.out.println("Stipend: $" + stipend);
    }

    
    public double calculateStipend() {

        System.out.println("Calculating stipend for: " + name);

        return stipend;
    }

    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    
    public String getName() {
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

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getStipend() {
        return stipend;
    }

    public void setStipend(double stipend) {
        this.stipend = stipend;
    }
}