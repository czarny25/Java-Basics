package pakowanie;

// created by Marcin 
public class TaxCalculation {
    
        public static void Calculate(double wage){
        

            
            if(wage <= 40000){
                wage *= 0.10;
            }else if(wage > 40000 && wage <= 80000){
                wage *= 0.25;
            }else{
                wage *= 0.55;
            }
            System.out.println("your tax is " + wage);
        }

}

