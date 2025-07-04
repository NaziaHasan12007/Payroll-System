public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate, double baseSalary) {
        super(firstName, lastName, ssn, sales, rate);
        this.baseSalary = baseSalary;
    }

    public void increaseBaseSalary(double percent) {
        baseSalary += baseSalary * percent / 100;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString() {
        return String.format("Base Plus Commission Employee: %s\nBase Salary: %.2f", super.toString(), baseSalary);
    }
}
