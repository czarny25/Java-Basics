package Applikacje;
import java.util.Scanner;
import pakowanie.*;
// created by Marcin This class will show us how to import your own made classes for your own application 
public class Wage {
        public static void main(String args[]){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("This applications will measure your abilities for Social Services.");
            System.out.println("Enter your wage and pick your choice of service.");
            
            String YourChoice = keyboard.next();
            double YourWage = keyboard.nextDouble();

            if(YourChoice.equals("a")){
                TaxCalculation Your = new  TaxCalculation();
                Your.Calculate(YourWage);
            }
            if(YourChoice.equals("b")){
                MedicalCard Your1 = new MedicalCard();
                Your1.Calculate(YourWage);
            }
            if(YourChoice.equals("all")){   
                Mija(YourWage);
            }else{
                System.out.println("That is wrong entry");
            }
         }
        
        public static void Mija(double Wage){
        
            TaxCalculation Your = new  TaxCalculation();
            Your.Calculate(Wage);
            
            MedicalCard Your2 = new MedicalCard();
            Your2.Calculate(Wage);
            
            
            
        }


}

