public class CommissionEmployee extends Employee {
    private double Sales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate) {
        super(firstName, lastName, ssn);
        this.Sales = sales;
        this.commissionRate = rate;
    }

    @Override
    public double earnings() {
        return Sales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("Commission Employee: %s\nGross Sales: %.2f; Commission Rate: %.2f", super.toString(), Sales, commissionRate);
    }
}
