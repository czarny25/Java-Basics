package ClassTree_example;
// created by Marcin 
public class ContractedEmployee extends Employee{
    
    private static double  totalPaid = 0.0;
    private double amountForCurrentJob;
    
    // this is constractor that sets the values of instant variabl
    public ContractedEmployee(double amountForCurrentJob){
        this.amountForCurrentJob = amountForCurrentJob;
    }
    // method which calculates total
    public double payForCurrentJob(){
        this.totalPaid = totalPaid + amountForCurrentJob;
        amountForCurrentJob = 0;         
        return totalPaid;      
    } 
    // printing method
    @Override
    public String ToString() {
            String state = String.format("As a contractor I made so far %.2f ", payForCurrentJob());
            return state;        
    }
}

