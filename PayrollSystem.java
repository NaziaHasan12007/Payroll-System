public class PayrollSystem{
    public static void main(String args[]){
       Employee[] employee = new Employee[4];
       employee[0]= new SalariedEmployee("Abdur", "Rahim", "1111-1111-1111", 3000);
       employee[1]= new HourlyEmployee("Abdul","Gofur", "2222-2222-2222", 80, 6);
       employee[2]= new CommissionEmployee("Abdul", "Jabbar", "3333-3333-3333", 200, 0.06);
       employee[3]= new BasePlusCommissionEmployee("Abdul", "Wahab", "4444-4444-4444", 300, 0.05, 300);
       
       for(Employee e: employee){
           System.out.println(e.toString());
           if(e instanceof BasePlusCommissionEmployee){
              ((BasePlusCommissionEmployee)e).increaseBaseSalary(10);
              System.out.println("Base Salary increased by 10%");
           }

           System.out.printf("Earnigs: %.2f tk\n\n", e.earnings());
       }
       
       

    }
}

