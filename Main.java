public class Main {

    public static void main(String[] args) {

        
        Student student = new Student(
                "ST001",
                "Appolinarie",
                200000,
                20,
                "appolinarie@gmail.com",
                "Nuclear Science",
                2,
                3.5
        );

        
        System.out.println("===== STUDENT INFORMATION =====");

        student.studentInfo();

        
        System.out.println("Calculated Stipend: "
                + student.calculateStipend() + " RWF");
    }
    
}