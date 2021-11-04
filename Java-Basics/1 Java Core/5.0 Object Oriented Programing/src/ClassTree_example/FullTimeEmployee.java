package ClassTree_example;

// created by Marcin 
public class FullTimeEmployee extends Employee{
        
    private double weeklySalary;
    private double benefitDeduction;
    
    public FullTimeEmployee(double ws, double bD){
        weeklySalary = ws;
        benefitDeduction = bD;
    }
    
    public double findPaymentAmount(){
        weeklySalary -= benefitDeduction;
        return weeklySalary;
    }
    
    @Override
    public String ToString() {
            String state = String.format("After benefit deducted my weekly income is €%.2f ", findPaymentAmount());
            return "" + state;         
    }
    
    
}

