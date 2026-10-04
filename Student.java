public class Student {

    private String name;
    private String studentId;
    private int age;
    private String email;
    private String course;
    private int year;
    private double gpa;
    private double stipend;



    public Student(String studentId, String name, double doubleStipend, int age,
         String email, String course, int year, double gpa) {
        
        this.name = name;
        this.studentId = studentId;
        this.age = age;
       this.course = course;
        this.year = year;
        this.gpa = gpa;
        this.stipend = doubleStipend;

       public static void studentInfo(String studentId, string name, double gpa){
            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course);
            System.out.println("Year: " + year);
            System.out.println("GPA: " + gpa);
            System.out.println("Stipend: $" + stipend);
        }

    }
    public double calculateStipend() {
        System.out.println("Calculating stipend for student: " + name);
        return stipend;
    }

    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }

    public double getBaseStipend() {
        return stipend;
    }

    
    

}


    

