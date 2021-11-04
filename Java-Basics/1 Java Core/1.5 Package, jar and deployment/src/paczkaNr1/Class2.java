package paczkaNr1;
//import API.ProfitCalculations;
import API.Calculations;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * @author Marcin
 */
public class Class2 implements Calculations{
    
        double value;
        int amount;
    
        public static void main(String args[]) throws IOException{

           

//            ProfitCalculations pr = new ProfitCalculations();
//            
//            System.out.println("I sucesfully extracted " + pr.bondsshareProfit() + " this value");

        }

    @Override
    public double CalculateCostOfTransaction() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double CalculateProfits() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
