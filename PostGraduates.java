public class PostGraduates extends Student {

    public PostGraduates(String studentId, String name, double stipend,
                         int age, String email, String course,
                         int year, double gpa) {

        super(studentId, name, stipend, age, email, course, year, gpa);
    }

    
    @Override
    public double calculateStipend() {

        double postGraduateStipend = getStipend() + 100000;

        System.out.println("Calculating Postgraduate stipend...");

        return postGraduateStipend;
    }
}