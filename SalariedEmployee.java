public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary){
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double earnings(){
        return weeklySalary;
    }

    @Override
    public String toString(){
        return String.format("Salaried employee: %s\nEarnings: %.2f", super.toString(), weeklySalary);
    }

}
