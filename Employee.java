public abstract class Employee{
    private String firstName;
    private String lastName;
    private String SSN;

    public Employee(String firstName, String lastName, String SSN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSSN(){
        return SSN;
    }

    public abstract double earnings();
    
    @Override
    public String toString(){
        return String.format("%s %s\nSSN: %s", firstName, lastName, SSN);
    }

}
