public class Main {

    public static void main(String[] args) {

        Student undergraduate = new UndergraduateStudent(3.7);
        Student graduate = new GraduateStudent(20, 12000);

        System.out.println("Undergraduate stipend: $"
                + undergraduate.calculateMonthlyStipend());

        System.out.println("Graduate stipend: $"
                + graduate.calculateMonthlyStipend());
    }
}