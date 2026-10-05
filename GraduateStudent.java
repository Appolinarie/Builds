public class GraduateStudent extends Student {

    private double taHours;
    private double yearlyResearchGrant;

    public GraduateStudent(double taHours, double yearlyResearchGrant) {
        this.taHours = taHours;
        this.yearlyResearchGrant = yearlyResearchGrant;
    }

    @Override
    public double calculateMonthlyStipend() {

        double base = 1200;
        double taPay = taHours * 25;
        double monthlyResearchGrant = yearlyResearchGrant / 12;

        return base + taPay + monthlyResearchGrant;
    }
}