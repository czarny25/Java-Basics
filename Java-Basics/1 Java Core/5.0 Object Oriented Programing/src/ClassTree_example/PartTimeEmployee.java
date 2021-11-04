package ClassTree_example;

// created by Marcin 
public class PartTimeEmployee extends Employee{
       
    private double hourlyRate;
    private double totalHoursWorked ;
    
    public PartTimeEmployee(double rate, double hours , String name, String jobTitle,String PPSno){
        super(name, jobTitle, PPSno);  
        hourlyRate = rate;
        totalHoursWorked = hours;
    }    
    public double findPaymentAmount(){
        double totalWage = totalHoursWorked * hourlyRate;
        return totalWage;
    }
    // printing method
    @Override
    public String ToString() {
            String state = String.format("%s\nThis week I worked for %.2f hours and I earned €%.2f ",super.ToString(),totalHoursWorked, findPaymentAmount());
            return state;        
    }
}

