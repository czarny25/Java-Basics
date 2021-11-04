package pakowanie;
// created by Marcin 
// this class calculate if you are allowed to get Medical Card
public class MedicalCard {
    
        private static int rate = 35;
    
    
    
    
    
        public static void Calculate(double wage){
        

            
            if(wage <= rate){
               
             System.out.println("You can get Medical Card");   

            }else{
                
            
            System.out.println("Medical Card is not availiable for you");
        }
        }     
}

