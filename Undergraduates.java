public class Undergraduates extends Student {

    
    public Undergraduates(String studentId, String name, double stipend,
                          int age, String email, String course,
                          int year, double gpa) {

        super(studentId, name, stipend, age, email, course, year, gpa);
    }

    
    @Override
    public double calculateStipend() {

        double undergraduateStipend = getStipend() + 50000;

        System.out.println("Calculating Undergraduate stipend...");

        return undergraduateStipend;
    }
}